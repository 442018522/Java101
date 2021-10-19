
import java.util.Scanner;
public class Mid
{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		float var1;
		System.out.print("enter a grade from 0-100 :");
		var1 = myScanner.nextFloat();
		
		if (var1 >=60 && var1<=79) {
		    System.out.println("passed the course waith"+var1); }
		
		else if (var1 >=80 && var1<=89) {
		    System.out.println("good job waith"+var1+"out of 100"); }
		    
		else if (var1 >=90 && var1<=100) {
		    System.out.println(var1+"is equivalent to A"); }
		    
		else { System.out.println("sorry you fail or you entered wrong grade"); }
		    
		     
		    
		}
		
		
	}
