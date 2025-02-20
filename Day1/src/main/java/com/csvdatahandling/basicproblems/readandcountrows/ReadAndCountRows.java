package com.csvdatahandling.basicproblems.readandcountrows;


import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;

public class ReadAndCountRows {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\harsh\\OneDrive\\Desktop\\Training\\Week5\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\readandcountrows\\ReadAndCountRows.csv";
        int count = 0;

        try(CSVReader reader = new CSVReader(new FileReader(fileName))){
           // String[] nextLine;

            boolean isHeader = true;

            while (( reader.readNext()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                count++;
            }
            System.out.println("Total numbers of the rows are: " + count);
        } catch(IOException | CsvValidationException e) {
            throw new RuntimeException(e);}
    }
}
