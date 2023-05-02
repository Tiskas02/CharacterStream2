package CharacterStream2;

import java.io.*;
import java.util.jar.Attributes.Name;

public class LAB4 {
    public static void main(String[] args) {
        
        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(key);
            System.out.print("Enter your name :");
            String name = input.readLine();
            System.out.println("Hello" + name);
            // System.out.print("Enter your age :");
            // String age = input.readLine();
            // int x = age+1;
            System.out.print("Enter your hight :");
            String h = input.readLine();
            System.out.print("Enter your weight :");
            String w = input.readLine();
            System.out.println(Double.parseDouble(w)*Double.parseDouble(h));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
