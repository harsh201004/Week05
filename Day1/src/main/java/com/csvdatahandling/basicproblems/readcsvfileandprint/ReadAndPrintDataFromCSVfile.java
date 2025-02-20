package com.csvdatahandling.basicproblems.readcsvfileandprint;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadAndPrintDataFromCSVfile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\harsh\\OneDrive\\Desktop\\Training\\Week5\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\readcsvfileandprint\\FileForReadAndPrint.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] line;
            // Skip the header row if needed
            reader.readNext();

            // Read each record and print it
            while ((line = reader.readNext()) != null) {
                for (String details : line) {
                    System.out.println(details);
                }
            }
        } catch (IOException e) {
            // More specific error handling
            e.printStackTrace();
        }catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}