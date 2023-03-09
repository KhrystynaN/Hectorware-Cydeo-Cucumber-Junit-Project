package com.hectorware.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:target/cucumber-reports.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                    "json:target/cucumber.json"
            },
            features = "src/test/resources/features",
            glue = "com/hectorware/step_definitions",
            dryRun = false,
            tags = "@B28G18-82",
            publish = true // generating a report with public link

    )


    public class CukesRunner {}
