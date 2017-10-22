package com.ms.szkatulka.cucumber.stepdefs;

import com.ms.szkatulka.SzkatulkaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SzkatulkaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
