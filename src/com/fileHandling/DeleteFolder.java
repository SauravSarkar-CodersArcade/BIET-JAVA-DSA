package com.fileHandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File(
                "./Java/Files");
        if(folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted.");
        }else {
            System.out.println("Folder doesn't exist.");
        }
    }
}
