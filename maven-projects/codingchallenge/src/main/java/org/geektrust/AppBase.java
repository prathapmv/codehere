package org.geektrust;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AppBase {

    static Map<String, Integer> meetingRooms = new HashMap<String, Integer>();
    static Map<String, Map<String, String>> roomsOccupied = new HashMap<String, Map<String, String>>();

    public static void processInput(List<String> coSpaceWorkersInput) {
        // Defining the meeting rooms' names and the capacity
        meetingRooms.put("C-Cave", 3);
        meetingRooms.put("D-Tower", 7);
        meetingRooms.put("G-Mansion", 20);

        // Reading the input file - This file contains both type of inputs
        // INPUT TYPE 1: BOOK <start_time> <end_time> <people_capacity>
        // INPUT TYPE 2: VACANCY <start_time> <end_time>
        // Validating the input and printing the respective result
        for (String userInput : coSpaceWorkersInput) { // ALLOCATES THE MEETING ROOM BASED ON THE FIRST COME FIRST SERVE
            // HERE -> Because the input file access from the beginning to
            // the end.
            // System.out.println("------------------------------------------------------------------------------");
            validateAndProcessInput(userInput);
            // System.out.println("------------------------------------------------------------------------------");
        }
    }

    private static void validateAndProcessInput(String userInput) {

        String[] splittedInput = userInput.split(" ");
        // System.out.println("Validating input for " + userInput);

        // Checking whether the provided time input is valid
        // Check whether the start time is greater than or equal to 23:45 as the booking
        // end time is 23:45. So, the user can't input the start time as 23:45
        for (int i = 0; i < splittedInput.length; i++) {
            boolean inputValidation = true;

            int startHours = 0;
            int startMinutes = 0;
            int endHours = 0;
            int endMinutes = 0;
            switch (i) {
                // If i == 0 then we checking for the input type
                case 0:
                    break;

                // If i == 1 then checking whether the start time is valid or not
                case 1:
                    startHours = Integer.parseInt(splittedInput[i].substring(0, 2));
                    startMinutes = Integer.parseInt(splittedInput[i].substring(3, 5));
                    if (startHours >= 23 && startMinutes >= 45) {
                        inputValidation = false;
                    }
                    break;

                // If i == 2 then checking whether the inputted time overlaps to the next day
                case 2:
                    startHours = Integer.parseInt(splittedInput[i - 1].substring(0, 2));
                    startMinutes = Integer.parseInt(splittedInput[i - 1].substring(3, 5));
                    endHours = Integer.parseInt(splittedInput[i].substring(0, 2));
                    endMinutes = Integer.parseInt(splittedInput[i].substring(3, 5));

                    // Timings overlapping check - Start
                    String formattedStartTime = AppHelper.convertingTimeToTwelveHourFormat(startHours, startMinutes);
                    String formattedEndTime = AppHelper.convertingTimeToTwelveHourFormat(endHours, endMinutes);
                    // System.out.println(
                    // " formattedStartTime : " + formattedStartTime + " formattedEndTime : " +
                    // formattedEndTime);

                    String startTimeFormat = formattedStartTime.substring(formattedStartTime.lastIndexOf(" "),
                            formattedStartTime.length());
                    String endTimeFormat = formattedEndTime.substring(formattedEndTime.lastIndexOf(" "),
                            formattedEndTime.length());
                    // System.out.println(" startTimeFormat : " + startTimeFormat + " endTimeFormat
                    // : " + endTimeFormat);

                    if (("AM").equalsIgnoreCase(startTimeFormat) && ("AM").equalsIgnoreCase(endTimeFormat)) {
                        inputValidation = false;

                    }
                    if (("PM").equalsIgnoreCase(startTimeFormat) && ("AM").equalsIgnoreCase(endTimeFormat)) {
                        inputValidation = false;

                    }
                    if (("AM").equalsIgnoreCase(startTimeFormat) && ("PM").equalsIgnoreCase(endTimeFormat)) {
                        if (endHours >= 23 && endMinutes >= 45) {
                            inputValidation = false;

                        }
                    }
                    // Timings overlapping check - End

                    // Input time should be in 15mts intervals check - Start
                    if ((startMinutes % 15) != 0 || (startMinutes % 15) != 15) {
                        inputValidation = false;
                        break;
                    }
                    if ((endMinutes % 15) != 0 || (endMinutes % 15) != 15) {
                        inputValidation = false;
                        break;
                    }
                    // Input time should be in 15mts intervals check - End

                    break;

                // // If i == 3 then checking for the people capacity
                // case 3:
                // break;
            }
            if (!inputValidation) {
                System.out.println(AppConstants.INCORRECT_INPUT);
                break;
            }
        }

    }

}
