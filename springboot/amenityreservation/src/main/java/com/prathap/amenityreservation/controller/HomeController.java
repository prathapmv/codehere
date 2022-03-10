package com.prathap.amenityreservation.controller;

import java.util.Set;

import javax.servlet.http.HttpSession;

import com.prathap.amenityreservation.model.Reservation;
import com.prathap.amenityreservation.model.User;
import com.prathap.amenityreservation.service.UserService;
import com.prathap.amenityreservation.service.ReservationService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class HomeController {

    final UserService userService;
    final ReservationService reservationService;

    public HomeController(UserService userService, ReservationService reservationService) {
        this.userService = userService;
        this.reservationService = reservationService;
    }
    
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

     
    @GetMapping("/reservations")
    public String reservations(Model model, HttpSession session) {

        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = principal.getUsername();

        User user = userService.getUserByUsername(name);

        if(user != null){
            session.setAttribute("user",user);
            
            Reservation reservation = new Reservation();
            model.addAttribute("reservation", reservation);

            return "reservations";
        }
        
        return "index";
    }

    @PostMapping("/reservations-submit")
    public String reservationsSubmit(@ModelAttribute Reservation reservation,
                                     @SessionAttribute("user") User user) {

        // Save to DB after updating
        assert user != null;
        reservation.setUser(user);
        reservationService.create(reservation);
        Set<Reservation> userReservations = user.getReservations();
        userReservations.add(reservation);
        user.setReservations(userReservations);
        userService.update(user.getId(), user);
        return "redirect:/reservations";
    }
}
