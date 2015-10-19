package java_log4j;

import org.apache.logging.log4j.Logger; 
import org.apache.logging.log4j.LogManager;



public class test {
	private static final Logger log4j = 
			LogManager.getLogger(HelloLog4j.class .getName());
	
	public static void main(String arg[]){
		System.out.println("t");
		
		log4j.trace("This is a trace message."); 
		log4j.debug("This is  a debug message."); 
		log4j.info("This is an info message."); 
		log4j.error("This is an error message");
		
	}
	
}
