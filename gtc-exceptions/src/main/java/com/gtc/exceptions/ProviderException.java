/**
 * 
 */
package com.gtc.exceptions;

/**
 * general exception
 * 
 * @author stanriku
 *
 */
public class ProviderException extends Exception {

    private static final long serialVersionUID = 296188028230835097L;

    /**
     * 
     */
    public ProviderException() {
        
    }

    /**
     * @param message
     */
    public ProviderException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public ProviderException(Throwable cause) {
        super(cause);
     
    }

    /**
     * @param message
     * @param cause
     */
    public ProviderException(String message, Throwable cause) {
        super(message, cause);
    }

}
