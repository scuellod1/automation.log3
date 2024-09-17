package automation.log3.LogbackManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloWorld1 {
	
	//https://logback.qos.ch/manual/introduction.html
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Logger logger = LoggerFactory.getLogger("automation.log3.LogbackManager.HelloWorld1");
	    logger.debug("Hello world.");		
		
	}

}
