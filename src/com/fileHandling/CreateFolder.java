package com.fileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File folder = new File(
                "D:\\Idea Projects\\BIET-SecA-DSA\\Java\\Files");
        if(folder.mkdir()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Folder already exists.");
        }
    }
}
