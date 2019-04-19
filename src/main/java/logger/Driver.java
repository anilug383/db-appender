package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Driver {
	private static final Logger log = LogManager.getLogger(); 
	public static void main(String[] args) {
		log.info("This is an info method");
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			log.error("Runtime Exception occured while processing", e);
		}
		log.info("Method ends");
	}
}
