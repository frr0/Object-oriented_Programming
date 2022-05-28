package it.polito.po.test;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTest(new TestSuite(TestR1_Concorrenti.class));
		suite.addTest(new TestSuite(TestR2_Squadre.class));
		suite.addTest(new TestSuite(TestR3_PuntateBraniEsibizioni.class));
		suite.addTest(new TestSuite(TestR4_EliminatiVincitori.class));
		//$JUnit-END$
		return suite;
	}
}