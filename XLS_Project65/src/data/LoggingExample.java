package data;

import org.apache.log4j.Logger;


public class LoggingExample {

	public static void main(String[] args) {
		
		// add log4j.jar to the ptoject = to build path
		//copy log4j.proprtie directly inside src folder
		// create the object of logger in the code
		
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello"); //System.out.printin("Hello");
		//System.out.println("hello");
		
		print.debug("We are writing in to a log file"); //System.out.println("We are writing in to a log file");
		print.debug("starting the test case xyz test");
		print.debug("starting the test case xyz test1");
	}

}
