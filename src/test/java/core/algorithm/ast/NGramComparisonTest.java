/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.algorithm.ast;

import java.util.List;
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
public class NGramComparisonTest {
    
    public NGramComparisonTest() {
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
     * Test of nGramComparison method, of class NGramComparison.
     * @throws java.lang.Exception
     */
    @Test
    public void testNGramComparison_StringArr_StringArr() throws Exception {
        System.out.println("nGramComparison");
        String[] project1 = null;
        String[] project2 = null;
        NGramComparison instance = new NGramComparison();
        instance.nGramComparison(project1, project2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nGramComparison method, of class NGramComparison.
     */
    @Test
    public void testNGramComparison_AstTree_AstTree() {
        System.out.println("nGramComparison");
        AstTree t1 = null;
        AstTree t2 = null;
        NGramComparison instance = new NGramComparison();
        instance.nGramComparison(t1, t2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nGramComparison method, of class NGramComparison.
     */
    @Test
    public void testNGramComparison_List_List() {
        System.out.println("nGramComparison");
        List<AstTree> t1 = null;
        List<AstTree> t2 = null;
        NGramComparison instance = new NGramComparison();
        instance.nGramComparison(t1, t2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateResult method, of class NGramComparison.
     */
    @Test
    public void testCalculateResult() {
        System.out.println("calculateResult");
        List<String> target1 = null;
        List<String> target2 = null;
        NGramComparison instance = new NGramComparison();
        double expResult = 0.0;
        double result = instance.calculateResult(target1, target2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class NGramComparison.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        NGramComparison instance = new NGramComparison();
        double expResult = 0.0;
        double result = instance.getResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
