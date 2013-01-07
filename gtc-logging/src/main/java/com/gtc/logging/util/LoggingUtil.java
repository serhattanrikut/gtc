/**
 * 
 */
package com.gtc.logging.util;

import org.apache.commons.logging.Log;

/**
 * utility class for logging essentials
 * 
 * @author stanriku
 *
 */
public class LoggingUtil {

    
    /**
     * checks whether debug is enabled and then writes debug logs
     * 
     * @param logger
     * @param message
     */
    public static void debug(Log logger, Object message) {       
        if(logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }
    
    /**
     * checks whether debug is enabled and then writes debug logs
     *  
     * @param logger
     * @param message
     * @param t
     */
    public static void debug(Log logger, Object message, Throwable t) {      
        if(logger.isDebugEnabled()) {
            logger.debug(message,t);
        }     
    }
    
    /**
     * checks whether debug is enabled and then writes trace logs
     * @param logger
     * @param message
     */
    public static void trace(Log logger, Object message) {
        if(logger.isTraceEnabled()){
            logger.trace(message);
        }
    }
    
    /**
     * checks whether debug is enabled and then writes trace logs
     * @param logger
     * @param message
     */
    public static void trace(Log logger, Object message, Throwable t) {
        if(logger.isTraceEnabled()){
            logger.trace(message,t);
        }
    }

}
