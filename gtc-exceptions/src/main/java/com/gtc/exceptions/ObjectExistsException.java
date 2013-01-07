/**
 * 
 */
package com.gtc.exceptions;

/**
 * This exception is thrown when any resource is duplicated by any means
 * in any resource repository.id and name properties provides extra information about 
 * the resources being duplicated
 *  
 * @author stanriku
 *
 */
public class ObjectExistsException extends Exception {

    private String id;
    private String name;
    
    private static final long serialVersionUID = -1099533001167000388L;

    /**
     * 
     */
    public ObjectExistsException() {
        
    }
    
    /**
     * @param id
     * @param name
     */
    public ObjectExistsException(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * @param message
     */
    public ObjectExistsException(String message) {
        super(message);
    }
    
    /**
     * @param id
     * @param name
     * @param message
     */
    public ObjectExistsException(String id, String name,String message) {
        super(message);
        this.id = id;
        this.name = name;
    }

    /**
     * @param cause
     */
    public ObjectExistsException(Throwable cause) {
        super(cause);
    }
    
    /**
     * @param id
     * @param name
     * @param cause
     */
    public ObjectExistsException(String id, String name,Throwable cause) {
        super(cause);
        this.id = id;
        this.name = name;
    }

    /**
     * @param message
     * @param cause
     */
    public ObjectExistsException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * @param id
     * @param name
     * @param message
     * @param cause
     */
    public ObjectExistsException(String id, String name,String message, Throwable cause) {
        super(message, cause);
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
