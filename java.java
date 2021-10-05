package alrpro_c;
import java.util.Scanner;
public class java {
	
	    public static void main(String[] args) {
	    Problem1();
	    Problem2();
	    Problem3();


	    }
	    public static void Problem1(){
	        //Use simple if else syntax to generate the result
	        
	        /*
	            Example:
	            
	            System and input:
	            Input the 1st number: 1
	            Input the 2nd number: 2
	            Input the 3rd number: 3
	            
	            System:
	            The smallest: 1
	        */    
	        
	        Scanner input = new Scanner(System.in);

	        System.out.print("Input the 1st number: ");
	        int num1 = input.nextInt();

	        System.out.print("Input the 2nd number: ");
	        int num2 = input.nextInt();

	        System.out.print("Input the 3rd number: ");
	        int num3 = input.nextInt();
	        
	        //YOUR CODE HERE!
			int smallest;
	        if (num1 < num2) {
				smallest = num1;
			} else smallest = num2;
			if (num3 < smallest) smallest = num3;
			System.out.println("The smallest: "+smallest);

	        separator();
	    }
	    
	    public static void Problem2(){
	        
	        int i,n;
	        int f=1;

	        System.out.print("Input number of terms : ");
	        Scanner input = new Scanner(System.in);
	        n = input.nextInt();

	        //YOUR CODE HERE!
	        for (i=n; i>0; i--) f *= i;
			System.out.println("Factorial of "+n+" is : "+f);
	        
	        separator();
	    }
	    
	    
	    public static void Problem3(){
	        //Use some simple loops to generate all coordinate!
	        
	        /*
	            Example:
	            
	            System: "Enter number: "
	            User Input: 5
	            System: 
	            (0,0)
	            (1,0) (1,1)
	            (2,0) (2,1) (2,2)
	            (3,0) (3,1) (3,2) (3,3) 
	            (4,0) (4,1) (4,2) (4,3) (4,4) 
	        */
			/* System.out.println("Problem 3"); */
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter number : ");
	        int max = input.nextInt();
	        for (int i = 0; i < max; i++){
	            for (int j = 0; j <= i; j++){
	                System.out.print("(" + i + ", " + j + ")");
	                
	            }
	            System.out.println();
	        }
	              
	    }
	     public static void separator(){
	        System.out.println("------------------------------- " );
	    }
	}

