package com.prathap.amenityreservation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

import com.prathap.amenityreservation.model.AmenityType;
import com.prathap.amenityreservation.model.Capacity;
import com.prathap.amenityreservation.model.Reservation;
import com.prathap.amenityreservation.model.User;
import com.prathap.amenityreservation.repos.CapacityRepository;
import com.prathap.amenityreservation.repos.ReservationRepository;
import com.prathap.amenityreservation.repos.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AmenityreservationApplication {

    private Map<AmenityType, Integer> initialCapacities = new HashMap<AmenityType, Integer>() {
        {
          put(AmenityType.GYM, 20);
          put(AmenityType.POOL, 4);
          put(AmenityType.SAUNA, 1);
        }
      };
      
    public static void main(String[] args) {
        SpringApplication.run(AmenityreservationApplication.class, args);
    }


    @Bean
  public CommandLineRunner loadData(UserRepository userRepository, CapacityRepository capacityRepository) {
    return (args) -> {
      userRepository.save(new User("Prathap", "prathap", bCryptPasswordEncoder().encode("12345")));
      userRepository.save(new User("Jesi", "jesi", bCryptPasswordEncoder().encode("12345")));

      for (AmenityType amenityType : initialCapacities.keySet()) {
        capacityRepository.save(new Capacity(amenityType, initialCapacities.get(amenityType)));
      }
    };
  }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
