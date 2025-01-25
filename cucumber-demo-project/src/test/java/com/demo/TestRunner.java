package com.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", // folder name
				 glue = { "stepdefinitions" } // package name of step definitions file
)
public class TestRunner {

}
