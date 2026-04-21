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

            LocalDateTime rightNow = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

            System.out.println("what would you like to search (press x to quit): ");
            String newLine = scanner.nextLine();
            bufferedWriter.write(newLine);

            bufferedWriter.close();


        }catch (Exception ex){
            System.err.println("something went wrong");
        }
    }
}
