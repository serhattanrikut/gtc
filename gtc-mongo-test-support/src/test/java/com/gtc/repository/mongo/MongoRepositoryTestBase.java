/**
 * 
 */
package com.gtc.repository.mongo;

import com.mongodb.DBCollection;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author stanriku
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MongoRepositoryTestBase {
    
    @Autowired 
    public MongoTemplate mongoTemplate;

    @Before 
    public void setUp() throws Exception {


    }
    
    @After 
    public void tearDown() throws Exception {
    }
    
    public <T>DBCollection  createCollection(Class<T> entityClass) throws Exception{
        
        DBCollection collection = mongoTemplate.createCollection(entityClass);
        
        return collection;
    }
    
    public <T> void dropCollection(Class<T> entityClass) throws Exception {
        
        mongoTemplate.dropCollection(entityClass);
        
    }

    /**
     * @return the mongoTemplate
     */
    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }

    /**
     * @param mongoTemplate the mongoTemplate to set
     */
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    
    

}
