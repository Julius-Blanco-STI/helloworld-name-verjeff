package main;
import java.util.*;
public class Main {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
   
    System.out.println("Hello World");
    
    System.out.print("What's your name? ");
     String name = scn.nextLine();
    System.out.print("How old are you? ");
      String age = scn.nextLine();
    System.out.print("What's your address? ");
      String address = scn.nextLine();
      
       System.out.println("Hi " + name);
       System.out.println("You are " + age + " yrs old");
       System.out.println("You live at " + address);
  }

}