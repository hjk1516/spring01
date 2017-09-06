package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log Log = LogFactory.getLog(CommonsLoggingExample.class);	
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());
	
	public static void main(String[] args) {

		log2.log(Level.INFO, "Java sstandard logger...");
		
		Log.trace("Commons 1.Trace level log");
		Log.debug("Commons 2.Debug level log");
		Log.warn("Commons 3.Warn level log");
		Log.info("Commons 4.Info level log");
		Log.error("Commons 5.Error level log");
		Log.fatal("Commons 6.Fatal level log");
		
		Log.info("###########################");
	}

}
