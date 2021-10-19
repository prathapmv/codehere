package org.geektrust;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppHelper {

    public static List<String> readInputFile(String inputFile) {

        List<String> inputs = new ArrayList<String>();

        try {
            Scanner inputsFromFile = new Scanner(new File(inputFile));

            String tempStr = "";
            while (inputsFromFile.hasNext()) {
                tempStr = inputsFromFile.nextLine();
                inputs.add(tempStr);
            }
            inputsFromFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;

    }

    public static String convertingTimeToTwelveHourFormat(int hours, int minutes) {
        String timeInAMPMFormat = "";
        String hoursStr = String.valueOf(hours);
        String minutesStr = String.valueOf(minutes);
        // old format
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");
        try {
            Date date3 = sdf.parse(hoursStr + "." + minutesStr);
            // new format
            SimpleDateFormat sdf2 = new SimpleDateFormat("hh.mm aa");
            // formatting the given time to new format with AM/PM
            timeInAMPMFormat = sdf2.format(date3);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeInAMPMFormat;
    }

    // Write a function to extract the AM PM details.
    // Write a function to split the hours and minutes.
}
