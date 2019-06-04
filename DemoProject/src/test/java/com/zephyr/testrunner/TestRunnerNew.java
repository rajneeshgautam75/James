package com.zephyr.testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features={"Features/"},
//tags={"@Create,@Delete,@DND,@Export,@Edit,@Import,@Map,@search,@View"},
tags={"@Login"},
glue={"com.zephyr.stepdefinition"},
plugin = {"html:target/cucumber-html-report",
		"pretty:target/cucumber-pretty.txt","rerun:target/rerun.txt",
		"usage:target/cucumber-usage.json","json:target/cucumber.json"},
		monochrome = false)

public class TestRunnerNew extends AbstractTestNGCucumberTests
{
		

}
