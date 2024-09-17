package automation.log3.LogbackManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class HelloWorld2 {
		//https://logback.qos.ch/manual/introduction.html

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Logger logger = LoggerFactory.getLogger("automation.log3.LogbackManager.HelloWorld1");
	    logger.debug("Hello world.");	
	    
	    // print internal state
	    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
	}

}
