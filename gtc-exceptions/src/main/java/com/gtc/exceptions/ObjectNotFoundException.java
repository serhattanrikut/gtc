/**
 * 
 */
package com.gtc.exceptions;

/**
 * This exception is thrown when a resource is not found in any type of repository
 * id and name properties provides extra information about the resources being searched
 * 
 * @author stanriku
 *
 */
public class ObjectNotFoundException extends Exception {

    private static final long serialVersionUID = 7299340509272875771L;

    private String id;
    private String name;
    
    /**
     * 
     */
    public ObjectNotFoundException() {
        
    }
    
    /**
     * @param id
     * @param name
     */
    public ObjectNotFoundException(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * @param message
     */
    public ObjectNotFoundException(String message) {
        super(message);
    }
    
    /**
     * @param id
     * @param name
     * @param message
     */
    public ObjectNotFoundException(String id, String name,String message) {
        super(message);
        this.id = id;
        this.name = name;
    }

    /**
     * @param cause
     */
    public ObjectNotFoundException(Throwable cause) {
        super(cause);
    }
    
    /**
     * @param id
     * @param name
     * @param cause
     */
    public ObjectNotFoundException(String id, String name,Throwable cause) {
        super(cause);
        this.id = id;
        this.name = name;
    }

    /**
     * @param message
     * @param cause
     */
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * @param id
     * @param name
     * @param message
     * @param cause
     */
    public ObjectNotFoundException(String id, String name,String message, Throwable cause) {
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
