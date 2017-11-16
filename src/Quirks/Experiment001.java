package Quirks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Experiment001 {

  public static void main(String[] args) {

    String line1 = "";
    String line2 = "";

    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.print("Line 1: ");
      line1 = br1.readLine();
      br1.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      System.out.print("Line 2: ");
      line2 = br2.readLine();
      br2.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("-----------------------------");
    System.out.println(line1);
    System.out.println(line2);

  }

}
