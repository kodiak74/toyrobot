package com.binarycube.toyrobot;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value = { 
	//Project Test Suites here
	com.binarycube.toyrobot.command.TestSuitePackage.class 
	, com.binarycube.toyrobot.core.TestSuitePackage.class 
})
public class TestSuiteProject{
	//Helper methods here
}