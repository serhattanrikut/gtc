/**
 * 
 */
package com.gtc.domain.mongo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * base mongdo db complaint persistent class. It provides common configurations
 * and properties
 * 
 * @author stanriku
 *
 */
@Document
public abstract class MongoPersistentObject {

    public static final String idField = "_id";
    public static final String createdField = "cd";
    public static final String updatedField = "ud";
    
    
    public String id;
    
    @Field(value=createdField)
    public Date created;
    
    @Field(value=updatedField)
    public Date updated;
    
    /**
     * default constructor
     */
    public MongoPersistentObject() {
        
    }
    
    /**
     * @param id
     */
    public MongoPersistentObject(String id) {
        this.id = id;
    }


    /**
     * @param id
     * @param created
     * @param updated
     */
    public MongoPersistentObject(String id, Date created, Date updated) {
        this.id = id;
        this.created = created;
        this.updated = updated;
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
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated the updated to set
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MongoPersistentObject)) {
            return false;
        }
        MongoPersistentObject other = (MongoPersistentObject) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MongoPersistentObject [id=");
        builder.append(id);
        builder.append(", created=");
        builder.append(created);
        builder.append(", updated=");
        builder.append(updated);
        builder.append("]");
        return builder.toString();
    }
}
