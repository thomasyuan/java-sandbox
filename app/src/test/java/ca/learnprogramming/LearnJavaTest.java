/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ca.learnprogramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class LearnJavaTest {

    @Test public void testAppHasAGreeting() {
        LearnJava classUnderTest = new LearnJava();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
