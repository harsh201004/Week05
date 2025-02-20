package com.csvdatahandling.basicproblems.writedataincsvfile;

import com.opencsv.*;
import java.io.*;


public class WriteDataInCSVFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\harsh\\OneDrive\\Desktop\\Training\\Week5\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\writedataincsvfile\\FileToWrite.csv";

        String[] header = {"Id", "Name", "Club", "Age"};
        String[][] members = {
                {"001", "Harsh", "Cricket", "20"},{"002", "Kuldeep", "Cricket", "21"}, {"003", "Ishan", "Coding", "21"}
        };
        try(CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            writer.writeNext(header);

            writer.writeNext(new String[]{});

            //write the members details
            for(String[] member : members){
                writer.writeNext(member);
            }

            System.out.println("File is written.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}