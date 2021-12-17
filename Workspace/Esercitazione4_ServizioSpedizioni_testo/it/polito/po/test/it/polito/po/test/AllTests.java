package it.polito.po.test;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTest(new TestSuite(Test_R1.class));
		suite.addTest(new TestSuite(Test_R2.class));
		suite.addTest(new TestSuite(Test_R3.class));
		suite.addTest(new TestSuite(Test_R4.class));
		//$JUnit-END$
		return suite;
	}
}