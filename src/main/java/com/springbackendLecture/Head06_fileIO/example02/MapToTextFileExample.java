package com.springbackendLecture.Head06_fileIO.example02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToTextFileExample {
    public static void main(String[] args) {

        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("AAPL", 100);
        stockMap.put("GOOG", 80);
        stockMap.put("AMAZON", 50);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("stock.txt"))) {
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                bw.write(entry.getKey() + " " + entry.getValue());

                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
