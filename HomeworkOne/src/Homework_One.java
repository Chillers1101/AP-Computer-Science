
import java.util.Scanner;




public class Homework_One {
	
	public static boolean isPlural(int value) {
		
		if(value > 1) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		double length1, width1, length2, width2, lawnarea, rate;
		int hours, minutes, seconds;
		Scanner scan = new Scanner(System.in);
	      
	    System.out.println("Please enter the lot's length and width: ");
	    length1 = scan.nextDouble();
	    width1 = scan.nextDouble();
	    
	    System.out.println("Now enter the house's length: ");
	    length2 = scan.nextDouble();
	    width2 = scan.nextDouble();
	    
	    System.out.println("Now lastly, enter the rate at which the lawn is being mown: ");
	    rate = scan.nextDouble();
	    
	    lawnarea = (double)(length1 * width1) - (length2 * width2);
	    System.out.println("The area of the lawn is " +lawnarea+ " feet squared.");
	    
	    seconds = (int)Math.round(lawnarea/rate);
	    
	    minutes = seconds/60;
	    seconds = seconds%60;
	    hours = minutes/60;
	    minutes = minutes%60;
	    
	    if( seconds==1 && hours==1 && minutes==1) { 
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hour "+minutes+" minute "+seconds+" second. ");
	        } else if (seconds ==1 && hours==1) { 
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hour "+minutes+" minutes "+seconds+" second. ");
	        } else if (seconds==1 && minutes==1) {
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hours "+minutes+" minute "+seconds+" second. ");
	        } else if (hours==1 && minutes==1 ) {
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hour "+minutes+" minute "+seconds+" seconds. ");
	        } else if (seconds==1) {
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" second. ");
	        } else if (hours==1) {
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hour "+minutes+" minutes "+seconds+" seconds. ");
	        } else if (minutes==1) {
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hours "+minutes+" minute "+seconds+" seconds. ");
	        } else {
	        System.out.print("The amount of time to mow the lawn will be ");
	        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds. ");
	        
	        }

	}
}
