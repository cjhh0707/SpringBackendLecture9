package com.springbackendLecture.Head06_fileIO.example01;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("example.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("output.txt")) {
            String content = "Hello World";
            for (char c : content.toCharArray()) {
                fw.write(c);
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
