package main.java;

/**
 * Created by George on 9/3/20.
 */

import groovy.util.AllTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;


public class AllGroovySuite extends TestSuite {

    static {
        System.setProperty(AllTestSuite.SYSPROP_TEST_DIR, "./test/groovy");
        System.setProperty(AllTestSuite.SYSPROP_TEST_PATTERN, "**/*Test.groovy");
    }


    public static Test suite() {
        return AllTestSuite.suite();
    }
}
