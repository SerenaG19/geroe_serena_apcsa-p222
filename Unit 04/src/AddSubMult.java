//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	//instance variables
	double varA, varB;
	
	//default constructor
	public AddSubMult(){
		setVars(0,0);
	}
	
	//initializing constructor
	public AddSubMult(double a, double b){
		setVars(varA,varB);
	}
	
	//modifying method
	public void setVars(double a, double b) {
		varA = a;
		varB = b;
	}
	
	//return / accessor method
	public static double check( double a, double b )
	{
		if(a>b) {
			return a-b;
		}
		else if(b>a) {
			return b-a;
		}
		else {
			return a*b;
		}
	}
}