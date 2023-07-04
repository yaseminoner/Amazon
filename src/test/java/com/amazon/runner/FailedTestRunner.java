package com.amazon.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/akdp/step_defs",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {


}
