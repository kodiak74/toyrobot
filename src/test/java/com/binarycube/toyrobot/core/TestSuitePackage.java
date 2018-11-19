package com.binarycube.toyrobot.core;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value = { 
	//Package test classes here
	TBLocation.class 
	, TBEnvironment.class 
	, TBHeading.class 
	, TBRobot.class 
})
public class TestSuitePackage{
	//Helper methods here
}