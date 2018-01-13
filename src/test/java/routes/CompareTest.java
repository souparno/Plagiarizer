/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routes;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import routes.model.CompareStudents;

/**
 *
 * @author satnam-sandhu
 */
public class CompareTest {
    
    public CompareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of assignments method, of class Compare.
     */
    @Test
    public void testAssignments() {
        System.out.println("assignments");
        Compare ob = new Compare();
        String project1[]={"/home/satnam-sandhu/Desktop/1.java"};
        String project2[]={"/home/satnam-sandhu/Desktop/2.java"};
        double[] results=null;
        try{
            results = ob.AllComparisons(project1, project2);
        }
        catch(Exception e){
            System.out.println("Error ho gaya");
        }
        
        System.out.println("AST: "+results[0]);

    }
    
}
