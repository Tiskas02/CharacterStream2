package CharacterStream2;

import java.util.Scanner;

import java.io.*;

public class LAB5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = s.nextLine();
        System.out.println("Hello Boi!" + name);
        System.out.println("Enter your weight :");
        double w = s.nextDouble();
        System.out.println("Enter your height :");
        double h = s.nextDouble();
        System.out.println(h*w/2);
    }
    
}
