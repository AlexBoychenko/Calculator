import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        try {
            String inputText = Files.readString(Paths.get("input.txt"));
            Files.writeString(Paths.get("output.txt"), inputText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}