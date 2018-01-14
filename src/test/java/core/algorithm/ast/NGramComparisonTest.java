/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.algorithm.ast;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
	 * Test of getResult method, of class NGramComparison.
	 * @throws java.io.IOException
	 */
	@Test
	public void testGetResult() throws IOException {
		System.out.println("getResult");
		double result = 0;
		String project1[] = {"/home/satnam-sandhu/Desktop/1.java"};
		String project2[] = {"/home/satnam-sandhu/Desktop/2.java"};
		NGramComparison ngramcomparison = new NGramComparison();
		ngramcomparison.nGramComparison(project1, project2);
		result = ngramcomparison.getResult();
		System.out.println(result);
	}
}
