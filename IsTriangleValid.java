/**
 * Class IsTriangleValid.
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-05-06
 */
 
public class IsTriangleValid {
	public void checkThreeSides(double doubleSidea, double doubleSideb, double doubleSidec) {
		if (doubleSidea > 0 && doubleSideb > 0 && doubleSidec > 0) {
			
		}
	    
	    else {
	    	System.out.println("Invalid Input");
	    }
		
	}
	
	public void checkTwoSidesAngleBetween(double doubleSidea, double doubleSideb, double doubleAngleC) {
		if (doubleAngleC < 180 && doubleAngleC > 0 && doubleSideb > 0 && doubleSidea > 0) {
			
		}
	    
	    else {
	    	System.out.println("Invalid Input");
	    }
		
	}

	public void checkTwoAnglesSideBetween(double doubleSidec, double doubleAngleA, double doubleAngleB) {
		if (doubleSidec > 0 && doubleAngleA > 0 && doubleAngleA < 180 && doubleAngleB > 0 && doubleAngleB < 180 && (doubleAngleA + doubleAngleB) < 180) {
			
		}
	    
	    else {
	    	System.out.println("Invalid Input");
	    }
		
	}
	
	public void checkTwoSidesAngleNotBetween(double doubleSidea, double doubleSideb, double doubleAngleA) {
		if (doubleSidea > 0 && doubleSideb > 0 && doubleAngleA > 0 && doubleAngleA < 180) {
		}
	    
	    else {
	    	System.out.println("Invalid Input");
	    }
		
	}
	
	public void checkTwoAnglesSideNotBetween(double doubleAngleA, double doubleAngleB, double doubleSideb) {
		if (doubleAngleA > 0 && doubleAngleA < 180 && doubleAngleB > 0 && doubleAngleB < 180 && doubleSideb > 0 && (doubleAngleA + doubleAngleB) < 180) {
			
		}
		
		else {
	    	System.out.println("Invalid Input");
	    }
		
	}
	
}