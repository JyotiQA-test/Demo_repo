package com.qa.util;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "test",
        features="C:/Users/jyotirani/IdeaProjects/Hooks_demo/src/test/java/com/qa/features"
        , glue="com/qa/stepdef")

public class testrunner {



}
