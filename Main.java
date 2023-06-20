import java.util.Scanner;
import java.util.InputMismatchException;

class HelloCodiva {
  
  public static void main(String[] args) {
      
   Scanner scanner = new Scanner(System.in);
   String again = ""; 
   int quit = 0;
   Acs alap = new Acs();
   HarrisB HB = new HarrisB();
   
    
   do{ 
   System.out.println("Optimal Daily Calorie intake calculator");
   System.out.println("You have 2 options to choose from");
   System.out.println("1: Calculation of basic metabolism");
   System.out.println("2: Daily metabolism calculation with Harris Benedict method");
   System.out.println("Press 1 or 2 and enter based on your choice");
   int choice = scanner.nextInt();
   scanner.nextLine();
   
    
   if(choice == 1){
   alap.calculate();
   }
   else if(choice == 2){
   HB.calculate();
   }
   
   System.out.println("Would you like to make another calculation?");
   System.out.println("Press 'y' to do another one or press 'q' to quit");
   again = scanner.nextLine();
   int quit2 = 0;
     
   do{
   if(again.equalsIgnoreCase("q")){
     quit2 = 1;
     quit = 1;
     System.out.println("Successful exit from the programme");
   }
   else if(again.equalsIgnoreCase("y")){
     quit2 = 1;
   }
   else{
     quit2 = 0;
     System.out.println("Please choose between'y' or 'q' please");
     again = scanner.nextLine();
   }
   }while(quit2 < 1);
   
     
   }while(quit < 1);
    
    
  }
  
}
