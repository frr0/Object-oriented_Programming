package it.polito.po.test;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

  public static Test suite() {
    TestSuite suite = new TestSuite(AllTests.class.getName());
    //$JUnit-BEGIN$
    suite.addTest(new TestSuite(TestR1.class));
    suite.addTest(new TestSuite(TestR2.class));
    suite.addTest(new TestSuite(TestR3.class));
    suite.addTest(new TestSuite(TestR4.class));
    //$JUnit-END$
    return suite;
  }
}