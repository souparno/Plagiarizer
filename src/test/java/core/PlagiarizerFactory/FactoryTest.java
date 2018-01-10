/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.PlagiarizerFactory;

import core.IO.Reader;
import core.IO.Writer;
import core.PlagiarismDetection.Assignment;
import core.PlagiarismDetection.Submission;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bonnie
 */
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of createAssignment method, of class Factory.
     */
    @Test
    public void testCreateAssignment() {
/*        System.out.println("createAssignment");*/
        //Factory instance = new Factory();
        //Assignment expResult = null;
        //Assignment result = instance.createAssignment();
        //assertEquals(expResult, result);
        //// TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }

    /**
     * Test of createSubmission method, of class Factory.
     */
    @Test
    public void testCreateSubmission_0args() {
        System.out.println("createSubmission");

        String[] fileNames = {"souparno.java"};
        String[] filePaths = {""};
        Factory factory = new Factory();
        Submission submisson = factory.createSubmission();

        submission.setStudentId(1);
        submission.setStudentName("souparno");
        submission.setFileNames(fileNames);
        submission.setFilePaths(filePaths); 
    }

    /**
     * Test of createSubmission method, of class Factory.
     */
    @Test
    public void testCreateSubmission_int_String() {
/*        System.out.println("createSubmission");*/
        //int studentID = 0;
        //String name = "";
        //Factory instance = new Factory();
        //Submission expResult = null;
        //Submission result = instance.createSubmission(studentID, name);
        //assertEquals(expResult, result);
        //// TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }

    /**
     * Test of createSubmission method, of class Factory.
     */
    @Test
    public void testCreateSubmission_4args() {
/*        System.out.println("createSubmission");*/
        //int studentID = 0;
        //String name = "";
        //String[] filePaths = null;
        //String[] fileNames = null;
        //Factory instance = new Factory();
        //Submission expResult = null;
        //Submission result = instance.createSubmission(studentID, name, filePaths, fileNames);
        //assertEquals(expResult, result);
        //// TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }

    /**
     * Test of Writer method, of class Factory.
     */
    @Test
    public void testWriter() {
/*        System.out.println("Writer");*/
        //Factory instance = new Factory();
        //Writer expResult = null;
        //Writer result = instance.Writer();
        //assertEquals(expResult, result);
        //// TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }

    /**
     * Test of Reader method, of class Factory.
     */
    @Test
    public void testReader() {
/*        System.out.println("Reader");*/
        //Factory instance = new Factory();
        //Reader expResult = null;
        //Reader result = instance.Reader();
        //assertEquals(expResult, result);
        //// TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.");*/
    }
    
}
