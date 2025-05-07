package com.basics.patterns;

public class ZigZagPattern {
    public static void main(String[] args) {
        zigzag1(17);
        zigzag2(13);
    }
    public static void zigzag1(int cols){
        for (int row=1; row<=3; row++){
            for (int col = 1; col <= cols; col++){
                if((row+col) % 4 == 0 || row == 2 && col % 4 == 0){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void zigzag2(int cols){
        for (int row=1; row<=3; row++){
            for (int col = 1; col <= cols; col++){
                if(row == 1 && col % 4 == 3 ||
                    row == 2 && col % 2 == 0 ||
                    row == 3 && col % 4 == 1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
