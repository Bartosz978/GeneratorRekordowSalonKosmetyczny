package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DF");
        stringBuilder.append("Fddf");
        System.out.printf(String.valueOf(stringBuilder));
        try {
            FileWriter fileWriter = new FileWriter("text.csv");
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}