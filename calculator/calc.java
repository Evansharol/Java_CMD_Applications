package calculator;
import java.util.*;
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public double div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Cannot be divisible by 0");
        }
        return (double) a/b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }
}
class Scalc extends Calculator{
    public double pow(int a,int b){
        return Math.pow(a,b);
    }
    public double sq(int a){
        if(a<0){
            throw new ArithmeticException("Negative number");
        }
        return Math.sqrt(a);
    }
}
public class calc
{
	public static void main(String[] args) {
		System.out.println("Welcome to calc");
		Scalc scal = new Scalc();
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		while(running){
		    System.out.println("1. Add numbers");
		    System.out.println("2. Subtract numbers");
		    System.out.println("3. Multiply numbers");
		    System.out.println("4. Divide numbers");
		    System.out.println("5. Power of two numbers");
		    System.out.println("6. Squareroot");
		    System.out.println("7. Exit");
		    System.out.println("Enter your choice : ");
		    int choice = sc.nextInt();
		    if(choice == 7){
		    running = false;
		    System.out.println("Exiting....");
		    break;
		    }
			try{
		    switch(choice){
		        case 1:
		            System.out.println("Enter a number A: ");
		            int a = sc.nextInt();
		            System.out.println("Enter a number B: ");
		            int b = sc.nextInt();
		            System.out.println("Enter a number C: ");
		            int c = sc.nextInt();
		            System.out.println("Result: " + scal.add(a,b));
		            System.out.println("Result: " + scal.add(a,b,c));
		            break;
		        case 2:
		            System.out.println("Enter a number A: ");
		            int a1 = sc.nextInt();
		            System.out.println("Enter a number B: ");
		            int b1 = sc.nextInt();
		            System.out.println("Result: " + scal.sub(a1,b1));
		            break;
		        case 3:
		            System.out.println("Enter a number A: ");
		            int a2 = sc.nextInt();
		            System.out.println("Enter a number B: ");
		            int b2 = sc.nextInt();
		            System.out.println("Result: " + scal.mul(a2,b2));
		            break;
		        case 4:
		            System.out.println("Enter a number A: ");
		            int a3 = sc.nextInt();
		            System.out.println("Enter a number B: ");
		            int b3 = sc.nextInt();
		            System.out.println("Result: " + scal.div(a3,b3));
		            break;
		        case 5:
		            System.out.println("Enter a number A: ");
		            int a4 = sc.nextInt();
		            System.out.println("Enter a number B: ");
		            int b4 = sc.nextInt();
		            System.out.println("Result: " + scal.pow(a4,b4));
		            break;
		        case 6:
		            System.out.println("Enter a number A: ");
		            int a5 = sc.nextInt();
		            System.out.println("Result: " + scal.sq(a5));
		            break;
		         default:
		            System.out.println("Invalid choice");
		    }
		}
		catch(ArithmeticException e){
		    System.out.println("Error :" + e.getMessage());
		}
	}
 
		sc.close();
	}
}