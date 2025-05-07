package com.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new
                FileWriter("./Java/biet.txt", true);
        writer.append("\nFile Handling In Python");
        writer.close();
        System.out.println("Successfully wrote data into the file.");
    }
}
