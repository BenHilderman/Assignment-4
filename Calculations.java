import java.lang.Math;

/**
 * Class Calculations.
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-05-06
 */

public class Calculations {
	
	// Variables
	double sideA;
	double sideB;
	double sideC;
	double perimeter;
	double area;
	double s;
	double incircle;
	double cRadius;
	double cArea;
	double anglea;
	double angleb;
	double anglec;
	
	public void calcThreeSides(double doubleSidea, double doubleSideb, double doubleSidec) {
		double newAngleA;
		double newAngleB;
		double newAngleC;
		double a = Math.toRadians(doubleSidea);
		double b = Math.toRadians(doubleSideb);
		double c = Math.toRadians(doubleSidec);
		
		// Find angle A
		
		newAngleA = ((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
		
		if (newAngleA < 0) {
			newAngleA = newAngleA * -1;
		}
		newAngleA = Math.acos(newAngleA) * (180/Math.PI);
		newAngleA = Math.round(newAngleA * 100) / 100.0;
		System.out.println("\nAngle A is " + newAngleA);
		
		// Find angle B
		newAngleB = ((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * c * a));
		
		if (newAngleB < 0) {
			newAngleB = newAngleB * -1;
		}
		newAngleB = Math.acos(newAngleB) * (180/Math.PI);
		newAngleB = Math.round(newAngleB * 100) / 100.0;
		System.out.println("Angle B is " + newAngleB);
		
		// Find angle C
		newAngleC = 180.0 - newAngleA - newAngleB;
		newAngleC = Math.round(newAngleC * 100) / 100.0;
		System.out.println("Angle C is " + newAngleC);
		
		anglea = newAngleA;
		angleb = newAngleB;
		anglec = newAngleC;
		sideA = doubleSidea;
	    sideB = doubleSideb;
	    sideC = doubleSidec;
	    
		
	}
	
	public void calcTwoSidesAngleBetween(double doubleSidea, double doubleSideb, double doubleAngleC) {
		
		// Variables
		double newAngleA;
		double newAngleB;
		double newAngleC = Math.toRadians(doubleAngleC);
		double a = doubleSidea;
		double b = doubleSideb;
		double c;
		
		c = (Math.pow(a, 2) + Math.pow(b, 2) - Math.cos(newAngleC) * 2 * b * a);
		c = Math.sqrt(c);
		
		newAngleA = (Math.sin(newAngleC) * a) / c;
		newAngleA = Math.asin(newAngleA) * (180/Math.PI);
		
		newAngleB = 180 - newAngleA - doubleAngleC;
		
		c = Math.round(c * 100) / 100.0;
		newAngleA = Math.round(newAngleA * 100) / 100.0;
		newAngleB = Math.round(newAngleB * 100) / 100.0;
		
		System.out.println("\nAngle A is " + newAngleA);
		System.out.println("Angle B is " + newAngleB);
		System.out.println("Side c is " + c);
		
		anglea = newAngleA;
		angleb = newAngleB;
		anglec = newAngleC;
		sideA = a;
	    sideB = b;
	    sideC = c;
	    
	}

	public void calcTwoAnglesSideBetween(double doubleSidec, double doubleAngleA, double doubleAngleB) {
		
		// Variables
		double newAngleC;
		double newAngleA = doubleAngleA;
		double newAngleB = doubleAngleB;
		double a;
		double b;
		double c = doubleSidec;
		
		newAngleC = 180 - newAngleA - newAngleB;
		
		a = (c / Math.sin(newAngleC)) * Math.sin(newAngleA);
		
		b = (c / Math.sin(newAngleC)) * Math.sin(newAngleB);
		
		a = Math.round(a * 100) / 100.0;
		b = Math.round(b * 100) / 100.0;
		
		System.out.println("\nAngle C is " + newAngleC);
        System.out.println("Side a is " + a);
        System.out.println("Side b is " + b);
        
        anglea = newAngleA;
		angleb = newAngleB;
		anglec = newAngleC;
		sideA = a;
	    sideB = b;
	    sideC = c;
	}
	
	public void calcTwoSidesAngleNotBetween(double doubleSidea, double doubleSideb, double doubleAngleA) {
		
		// Variables
		double newAngleA = Math.toRadians(doubleAngleA);
		double newAngleB;
		double newAngleC;
		double a = doubleSidea;
		double b = doubleSideb;
		double c;
		
		newAngleC = (b * Math.sin(newAngleA)) / a;
		newAngleC = Math.asin(newAngleC) * (180/Math.PI);
		
		newAngleB = 180 - newAngleA - newAngleC;
		
		c = (Math.sin(newAngleB) * b) / Math.sin(newAngleA);
		
		newAngleC = Math.round(newAngleC * 100) / 100.0;
		c = Math.round(c * 100) / 100.0;
		newAngleB = Math.round(newAngleB * 100) / 100.0;
		
		System.out.println("\nAngle C is " + newAngleC);
		System.out.println("Side c is " + c);
		System.out.println("Angle B is " + newAngleB);
	
	    anglea = newAngleA;
		angleb = newAngleB;
		anglec = newAngleC;
		sideA = a;
	    sideB = b;
	    sideC = c;
	}
	
	public void calcTwoAnglesSideNotBetween(double doubleAngleA, double doubleAngleB, double doubleSideb) {
		
		// Variables
		double newAngleC;
		double newAngleA = doubleAngleA;
		double newAngleB = doubleAngleB;
		double a;
		double b = doubleSideb;
		double c;

		newAngleC = 180 - newAngleA - newAngleB;
		
		c = (Math.sin(newAngleB) * b) / Math.sin(newAngleA);
		
		a = (c / Math.sin(newAngleC)) * Math.sin(newAngleB);
		
		a = Math.round(a * 100) / 100.0;
		c = Math.round(c * 100) / 100.0;
		
		System.out.println("\nAngle B is " + newAngleB);
        System.out.println("Side a is " + a);
        System.out.println("Side c is " + c);
		
		anglea = newAngleA;
		angleb = newAngleB;
		anglec = newAngleC;
		sideA = a;
	    sideB = b;
	    sideC = c;
	}
	
    public void finall() {
    	
    	if (sideA == sideB || sideA == sideC || sideB == sideC) {
    		System.out.println("\nThis is an isosceles triangle.");
    	
    	}
    	
    	else if (sideA == sideB && sideA == sideC) {
    		System.out.println("\nThis is an Equilateral triangle.");
    		
    	}
    	
    	else {
    		System.out.println("\nThis is a Scalene triangle.");
    		
    	}
    	
    	if (anglea == 90.0 || angleb == 90.0 || anglec == 90.0) {
    		System.out.println("This is a Right angle triangle.\n");
    		
    	}
    	
    	if (anglea < 90.0 && angleb < 90.0 && anglec < 90.0) {
    		System.out.println("This is an Acute triangle.\n");
    		
    	}
    	
    	else {
    		System.out.println("This is an Obtuse triangle.\n");
    		
    	}
    		
	    perimeter = sideA + sideB + sideC;
	    s = perimeter / 2;
		area = Math.sqrt((s * (s - sideA) * (s - sideB) * (s - sideC)));

		area = Math.round(area * 100) / 100.0;
		
		incircle = area / s;
		
		cRadius = (sideA * sideB * sideC) / (4 * area);
		
		cArea = Math.PI * cRadius * cRadius;
		
		area = Math.round(area * 100) / 100.0;
		incircle = Math.round(incircle * 100) / 100.0;
		cRadius = Math.round(cRadius * 100) / 100.0;
		cArea = Math.round(cArea * 100) / 100.0;
		
		System.out.println("The perimeter is " + perimeter);
		System.out.println("The semi perimeter is " + s);
		System.out.println("The area is " + area);
		System.out.println("The incircle is " + incircle);
		System.out.println("The circumcircle radius is " + cRadius);
		System.out.println("The circumcircle area is " + cArea);
    }
}