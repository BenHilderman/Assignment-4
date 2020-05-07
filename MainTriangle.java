import java.util.Scanner;

/**
 * Class MainTriangle.
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-05-06
 */
 
public class MainTriangle {
	
	    // Variables
		int sidea;
	    int sideb;
	    int sidec;
	    int angleA;
	    int angleB;
	    int angleC;
	
	public static void main(String[] args) {
		// Variables
        MainTriangle app = new MainTriangle();
    	app.printText();
	}
	
	public int userInfo(int userInput) {
		// Variables
	    int userChoice;
		Scanner scanner = new Scanner(System.in);
		
		switch(userInput) {
			
			case 1:
			userChoice = 1;
		    
            System.out.println("Enter side a");
			sidea = scanner.nextInt();
			
			System.out.println("Enter side b");
			sideb = scanner.nextInt();
			
			System.out.println("Enter side c");
			sidec = scanner.nextInt();
			
			break;
			
			case 2:
			userChoice = 2;
			
			System.out.println("Enter length of side a in cm");
			sidea = scanner.nextInt();
			
			System.out.println("Enter length of side b in cm");
			sideb = scanner.nextInt();
			
			System.out.println("Enter angle C");
			angleC = scanner.nextInt();

			break;
			
			case 3:
			userChoice = 3;
			
			System.out.println("Enter length of side c in cm");
			sidec = scanner.nextInt();
			
			System.out.println("Enter angle A");
			angleA = scanner.nextInt();
			
			System.out.println("Enter angle B");
			angleB = scanner.nextInt();
			
			break;
			
			case 4:
			userChoice = 1;

            System.out.println("Enter length of side a in cm");
			sidea = scanner.nextInt();
			
			System.out.println("Enter length of side b in cm");
			sideb = scanner.nextInt();
			
			System.out.println("Enter angle A");
			angleA = scanner.nextInt();
			
			
			break;
			
			case 5:
			userChoice = 1;

            System.out.println("Enter angle A");
			angleA = scanner.nextInt();
			
			System.out.println("Enter angle B");
			angleB = scanner.nextInt();
			
			System.out.println("Enter length of side b in cm");
			sideb = scanner.nextInt();

			break;
			
			default:
			System.out.println("Invalid input");
			System.exit(0);
		}
		return -1;
	}
  	
	public void printText() {
	    IsTriangleValid run = new IsTriangleValid();
	    Calculations runC = new Calculations();
        MainTriangle app = new MainTriangle();
        Scanner scanner = new Scanner(System.in);
		
    	System.out.println("What information do you have on your triangle? (Enter the number beside the option):");
    	System.out.println("[1] 3 sides");
        System.out.println("[2] 2 sides and angle between");
    	System.out.println("[3] 2 angles and side between");
        System.out.println("[4] 2 sides and angle not between");
    	System.out.println("[5] 2 angles and side not between");
        int userInput = scanner.nextInt();
        this.userInfo(userInput);
       
        double doubleAngleA = angleA;
		double doubleAngleB = angleB;
		double doubleAngleC = angleC;
		
		double doubleSidea = sidea;
		double doubleSideb = sideb;
		double doubleSidec = sidec;
        
        // Check to see if dimensions are valid
        // Run IsTriangleValid and Calculations
        
        if (userInput == 1) {
        run.checkThreeSides(doubleSidea, doubleSideb, doubleSidec);
        runC.calcThreeSides(doubleSidea, doubleSideb, doubleSidec);
        }
        
        if (userInput == 2) {
        run.checkTwoSidesAngleBetween(doubleSidea, doubleSideb, doubleAngleC);
        runC.calcTwoSidesAngleBetween(doubleSidea, doubleSideb, doubleAngleC);
        }
        
        if (userInput == 3) {
        run.checkTwoAnglesSideBetween(doubleSidec, doubleAngleA, doubleAngleB);
        runC.calcTwoAnglesSideBetween(doubleSidec, doubleAngleA, doubleAngleB);
        }
        
        if (userInput == 4) {
        run.checkTwoSidesAngleNotBetween(doubleSidea, doubleSideb, doubleAngleA);
        runC.calcTwoSidesAngleNotBetween(doubleSidea, doubleSideb, doubleAngleA);
        }
        
        if (userInput == 5) {
        run.checkTwoAnglesSideNotBetween(doubleAngleA, doubleAngleB, doubleSideb);
        runC.calcTwoAnglesSideNotBetween(doubleAngleA, doubleAngleB, doubleSideb);
		
        }
		
		runC.finall();
	}
}