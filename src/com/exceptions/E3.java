package com.exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class E3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        String str;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            br.close();
        }
    }
}
