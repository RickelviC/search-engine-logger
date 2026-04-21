package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logs.txt", true));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            String rightNow = LocalDateTime.now().format(formatter);

            bufferedWriter.write("\n" + rightNow + "Started program");

            String input;
            do {
                System.out.print("what would you like to search (press x to quit): ");
                input = scanner.nextLine();
                bufferedWriter.write("\n" + rightNow + " search: " + input);

            } while (!input.equalsIgnoreCase("x"));
            bufferedWriter.write("\n" + rightNow + "Ended program");
            bufferedWriter.close();

        }catch (Exception ex){
            System.err.println("something went wrong");
        }
    }
}
