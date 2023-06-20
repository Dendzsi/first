import java.util.Scanner;
import java.util.InputMismatchException;

class Acs {
    
    void calculate() {
    Scanner scanner = new Scanner(System.in);
    
   	double Calorieneeds = 0;
    double aktivitas = 1;
    int kor = 0;
    String activity = "";
    String nem;
    
    System.out.println("Enter your gender(Only male or female allowed):");
    try{
    nem = scanner.nextLine();
    } 
    catch(Exception e){
    System.out.println("Please enter your gender correctly");  
    nem = scanner.nextLine();
    }
    //System.out.println("You are a "+nem);
    
    
   // try{
       System.out.println("Enter your age:");
    	kor = scanner.nextInt();
    	scanner.nextLine();
    /*}
   	catch(InputMismatchException e) {
      System.out.println("Please enter a number!");
    }*/
    
    System.out.println("Enter your weight:");
    int suly = scanner.nextInt();
    scanner.nextLine();
    

    //System.out.println("Please enter your activity level 1 or 2 or 3:");
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
 
    
    activity = scanner.nextLine();
    
    
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
    
    if(nem.equalsIgnoreCase("MALE"))
    {
      if(kor >= 61) {
        Calorieneeds = ((13.5 * suly) + 487) * aktivitas;
      }
      else if(kor >= 30 && kor <= 60) {
     	 Calorieneeds = ((11.6 * suly) + 879) * aktivitas;
        
      }
      else {
        Calorieneeds = ((15.3 * suly) + 679) * aktivitas;
      }
    }
    
    else if (nem.equalsIgnoreCase("FEMALE")) {
      if(kor <= 61) {
        Calorieneeds = ((10.5 * suly) + 596) * aktivitas;
      }
      else if(kor <= 30 && kor <= 60){
        Calorieneeds = ((8.7 * suly) + 829) * aktivitas;
      }
      else {
        Calorieneeds = ((14.7 * suly) + 496) * aktivitas;
      }
    }
    /*else{
      System.out.println("Are you alien or what?");
    }*/
    
    System.out.println("Your optimal daily calorie intake is:"+Calorieneeds+"kcal");
    
    
  }
}
