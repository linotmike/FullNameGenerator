package com.pluralsight;
import java.util.Scanner;


public class Main {
   static Scanner scanner = new Scanner(System.in);
   public static void main (String [] args){
   System.out.println("Please enter your first name");
   String firstName = nameMethod();
   System.out.println("Do you have a middle initial ? (yes/no)");
   String middleNameResponse = scanner.nextLine().trim();
   String middleInitial = "";
   if (middleNameResponse.equals("yes")){
       System.out.println("Please enter your middle initial");
       middleInitial = middleNameMethod();
   }
   System.out.println("What is your last name?");
   String lastName = lastName();
   System.out.println("Do you have a suffix?(yes/no)");
   String suffixResponse = scanner.nextLine().trim();
   String suffix = "";
   if (suffixResponse.equals("yes")){
       System.out.println("Please enter your suffix");
       suffix = suffixMethod();
   }

if(middleNameResponse.equals("no") && suffixResponse.equals("no")){
    System.out.println("You have chosen not to include a middle name and a suffix");
    System.out.println("Your full name is " + firstName + " " + lastName);
} else if (middleNameResponse.equals("yes") && suffixResponse.equals("no")){
    System.out.println("You have chosen not to include a suffix");
    System.out.println("Your full name is "+ firstName + middleInitial + ". " + lastName);
} else if (middleNameResponse.equals("no") && suffixResponse.equals("yes")){
    System.out.println("You have chosen not to include a middle name");
    System.out.println("Your full name is "+ firstName + " " +lastName + ", " + suffix);

} else {
    System.out.println("Your full name is " + firstName + " " + middleInitial
            + ". " + lastName + ", " + suffix);
}

   }

public static String nameMethod(){
       String response = scanner.nextLine();
       if(!response.isEmpty()){
           System.out.println("Your first name is: " + response);
           return response;
       } else {
            System.out.println("Please enter your name");
            return nameMethod();
       }
}

public static String middleNameMethod(){
       String response = scanner.nextLine();
       if (!response.isEmpty()){
           System.out.println("you middle initial is: " + response);
           return response;
       }else {
           System.out.println("You have choose not to add a middle name");
           return "No middle name provided";
       }




}

public static String lastName(){
       String response = scanner.nextLine();
       if(!response.isEmpty()){
           System.out.println("your last name is: " + response);
           return response;
       }else{
           System.out.println("please enter your last name");
           return lastName();
       }
}

public static String suffixMethod(){
       String response = scanner.nextLine();

       if(!response.isEmpty()){
           System.out.println("your suffix is: " + response);
           return response;
       }else {
           System.out.println("you have chosen not to have a suffix");
           return "No suffix provided";
//           return suffixMethod();
       }
}


}
