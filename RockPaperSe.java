
package rockpaperse;

import java.util.Random;
import java.util.Scanner;

//your grade is 4.5/5

//change file name to be RockPaperSe.java
public class RockPaperSe {

    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerChoices = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            //get the input from the scanner as string. [ User Input w3schools ]
            String userInput = scan.nextLine();            
            //convert the string to lower case by using toLowerCase() [ String w3schools ]
            String userInputLower = userInput.toLowerCase();
            //get first char by using charAt() [ String w3schools ]
            char userChoice = userInputLower.charAt(0);
            
            //check the first char if it is not r, p, and s then break the loop [ if w3schools ]
            if (userChoice !='r' && userChoice!='p' && userChoice!='s')
               
            //use break keyword [ while w3schools ]
                      break;
            //here is the computer choice
            char computerChoice = computerChoices.charAt(rnd.nextInt(computerChoices.length()));

            //check & match who wins
            System.out.println("Your choice is " +userChoice + " and the computer choice is "+computerChoice);
            if (userChoice==(computerChoice)) 
              System.out.println("It's a tie!"); 
            else if (userChoice==('r')) {
               if (computerChoice==('s')) 
                  System.out.println("Rock crushes scissors. You win!!");
               else if (computerChoice==('p')) 
                  System.out.println("Paper eats rock. You lose!!"); }
            else if (userChoice==('p')) {
               if (computerChoice==('s')) 
                  System.out.println("Scissor cuts paper. You lose!!"); 
               else if (computerChoice==('r')) 
                  System.out.println("Paper eats rock. You win!!"); }
            else if (userChoice==('s')){ 
              if (computerChoice==('p')) 
               System.out.println("Scissor cuts paper. You win!!"); 
              else if (computerChoice==('r')) 
               System.out.println("Rock breaks scissors. You lose!!"); }
           

            //print new line
            System.out.println("\n\n");
        }while(true);
    }
    
}
