import java.util.Scanner;

public class Homework_One {
	
	public static boolean isPlural(int value) {
	    return (value > 1);	
	}

    public static boolean isEmpty(int value) {
        return (value == 0);
    }

    public static void printStatement(String measurement, int value) {
        if (isEmpty(value)) {
            System.out.print("");
        } else if (isPlural(value)) {
            System.out.print(value + " " + measurement + "s ");
        } else {
            System.out.print(value + " " + measurement + " ");
        }
    }
	
	public static void main(String[] args) {
		
		double length1, width1, length2, width2, lawnarea, rate;
		int hours, minutes, seconds;
		Scanner scan = new Scanner(System.in);
	      
	    System.out.print("Lot's length and width: ");
	    length1 = scan.nextDouble();
	    width1 = scan.nextDouble();
	    
	    System.out.print("House's length and width: ");
	    length2 = scan.nextDouble();
	    width2 = scan.nextDouble();
	    
	    lawnarea = (double)(length1 * width1) - (length2 * width2);
	    
	    if(lawnarea == 0) {
	    		System.out.println("There is no lawn.");
	    } else if(lawnarea < 0) {
	    		System.out.println("Those are not valid dimensions.");
	    } else {
	    		System.out.println("Area of lawn: " +lawnarea+ " ft^2");
	    		
	    		System.out.print("Rate at which the lawn is being mown: ");
	    	    rate = scan.nextDouble();
	    		
	    		seconds = (int)Math.round(lawnarea/rate);
	    	    
	    	    minutes = seconds/60;
	    	    seconds = seconds%60;
	    	    hours = minutes/60;
	    	    minutes = minutes%60;
	    	  
	        System.out.print("Lawn mowed in ");
	        printStatement("hour", hours);
	        printStatement("minute", minutes);
	        printStatement("second", seconds);
	    	    System.out.println("");
	    }
	    
	    
	   
    }
}
