package com.nice.demo;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("d:\\nice.txt");
            writer.write("nice");
            writer.write("\r\t宁海博");
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
