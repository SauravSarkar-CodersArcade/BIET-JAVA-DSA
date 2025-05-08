package com.strings;
public class BufferBuilderPerformance {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("BIET");
        long startTime = System.currentTimeMillis();
        for (int i=1; i<1000000; i++){
            buffer.append(" College");
        }
        System.out.println("Buffer Time: " +
                (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("BIET");
        for (int i=1; i<1000000; i++){
            builder.append(" College");
        }
        System.out.println("Builder Time: " +
                (System.currentTimeMillis() - startTime) + "ms");
    }
}
