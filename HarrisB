import java.util.Scanner;
import java.util.InputMismatchException;

class HarrisB {
  void calculate() {
     Scanner scanner = new Scanner(System.in);
    
     double Calorieneeds = 0;
     double aktivitas = 1;
    
     System.out.println("Enter your gender(Only male or female allowed):");
     String nem = scanner.nextLine();
  	
    
     System.out.println("Enter your age:");
     int kor = scanner.nextInt();
     scanner.nextLine();
    
     System.out.println("Enter your weight:");
     double suly = scanner.nextDouble();
     scanner.nextLine();
    
    
     System.out.println("Enter your height:");
     double magassag = scanner.nextDouble();
     scanner.nextLine();
    
     System.out.printf("----------------------------------------------%n");
     System.out.printf("      !Please enter your activity level!      %n");
     System.out.printf("----------------------------------------------%n");
     System.out.printf("       Choose a number beteween 1 and 9       %n");
     System.out.printf(" Based on the type of of physical work you do %n");
     System.out.printf("----------------------------------------------%n");
     System.out.printf("                    | Easy! | Moderate! | Hard! |%n");
     System.out.printf("|   Not so active   |   1   |     2     |   3   |%n");
     System.out.printf("| Moderately active |   4   |     5     |   6   |%n");
     System.out.printf("|   Highly active   |   7   |     8     |   9   |%n");
 
    
     String activity = scanner.nextLine();
    
          if(nem.equalsIgnoreCase("Male"))
      {
        switch(activity){
          case "1": aktivitas = 1.4;
          break;
          case "2": aktivitas = 1.6;
          break;
          case "3": aktivitas = 1.7;
          break;
          case "4": aktivitas = 1.5;
          break;
          case "5": aktivitas = 1.7;
          break;
          case "6": aktivitas = 1.8;
          break;
          case "7": aktivitas = 1.6;
          break;
          case "8": aktivitas = 1.8;
          break;
          case "9": aktivitas = 1.9;
          break;
        }
      }

      if(nem.equalsIgnoreCase("FEMALE"))
      {
        switch(activity){
          case "1": aktivitas = 1.4;
          break;
          case "2": aktivitas = 1.5;
          break;
          case "3": aktivitas = 1.5;
          break;
          case "4": aktivitas = 1.5;
          break;
          case "5": aktivitas = 1.6;
          break;
          case "6": aktivitas = 1.6;
          break;
          case "7": aktivitas = 1.6;
          break;
          case "8": aktivitas = 1.7;
          break;
          case "9": aktivitas = 1.7;
          break;
        }
      }

     
     if(nem.equalsIgnoreCase("MALE")) {
        Calorieneeds = (66.5 + (13.8*suly) + (5.0 * magassag) - (6.8 * kor)) * aktivitas;
     }

     else if (nem.equalsIgnoreCase("FEMALE")) {
       Calorieneeds = (655 + (9.6*suly) + (1.9 * magassag) - (4.7 * kor)) * aktivitas;
        
     }
    System.out.println("Your optimal daily calorie intake is:"+Calorieneeds+"kcal");
    
  }
}
