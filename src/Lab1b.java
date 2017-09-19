
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author Kasey Mills
 * @version 1
 * @since 08-30-2017
 */

import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab1b {

	// data members
	

	/**
	 * Constructor: calls method readFile that reads the doubles contained in the
	 * file "<code>filename</code>" and computes the average of the elements.
	 * 
	 * @param filename
	 *            name of the file containing doubles.
	 */
	public Lab1b(String filename) 
	{
		readFile(filename);
	}

	/**
	 * Reads double from a file named <code>filename</code> and computes the average
	 * of the elements contained in the file
	 * 
	 * @param filename
	 *            name of the file containing the doubles
	 */
	public void readFile(String filename) 
	{

    	try 
    	{
	    	File inputFile = new File(filename);
	    	Scanner input = new Scanner(inputFile);
	    	double value = 0;
	    	double average = 0;
	    	int count=0;
	    	
	    	
	    	// Do Average
	    	while (input.hasNextDouble()) 
	    	{
	    		value += input.nextDouble();
	    		count++;
	    		
	    		
	    	}
	    	
	    	average = value / count;

	    	
	    	
	    	//output results
	    	System.out.printf("Average %f\n", average);
	    	input.close();
    	} 
    	catch (IOException e) 
    	{
    		System.err.println("IOException in reading input file!!!" + e.getMessage().toString());
    	}	

		// -- TO COMPLETE -- Method description here
	}

	// end readFile()

	/**
	 * main : creates a Lab1b Object with the filename passed in argument
	 */
	public static void main(String args[]) 
	{
			new Lab1b("src/Lab1b.dat");
	} // end main

} // end class Lab1b
