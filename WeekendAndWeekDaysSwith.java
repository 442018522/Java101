
import java.util.Scanner;

public class WeekendAndWeekDaysSwith {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter Number ");

int var1 = scan.nextInt();

switch (var1){

case 1:

case 2:

case 3:

case 4:

case 5:

System.out.println("week daysً");

break;

case 6:

break;

case 7:

System.out.println("weekend");

break;

default:System.out.println("error enter fron 1 to 7");

}

}

}
