package org.geektrust;

import java.util.List;
import org.geektrust.*;

public class App {

    public static void main(String args[]) {

        if (args.length < 1) {
            System.err.println("Please provide an input file path!");
            System.exit(0);
        } else {
            List<String> coSpaceWorkersInput = AppHelper.readInputFile("src/input/inputfile.txt");
            // List<String> coSpaceWorkersInput = readInputFile(
            // "C:\\Users\\prathap.matheswaran\\OneDrive -
            // Accenture\\Projects\\practice\\src\\maven-practise\\codingchallenge\\src\\input\\inputfile.txt");
            AppBase.processInput(coSpaceWorkersInput);
        }

    }

}
