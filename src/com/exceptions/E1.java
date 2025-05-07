package com.exceptions;
public class E1 {
    static {
        System.out.println("Static 2");
    }
    public static void main(String[] args) {
        new E1();
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Operation");
        }
        catch (Exception e){
            System.out.println("Something unexpected happened.");
        }
        finally {
            System.out.println("End of execution");
        }
        System.out.println("The value of k is: " + k);
    }
    static {
        System.out.println("Start of execution : Static 1");
    }

    {
        System.out.println("IIB1");
    }
    {
        System.out.println("IIB2");
    }
}
