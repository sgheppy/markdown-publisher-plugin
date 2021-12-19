package io.jenkins.plugins.sample;

import hudson.model.Action;

public class HelloWorldAction implements Action {


    private String name;
    private String mdtext;

    public HelloWorldAction(String name, String mdtext) {
        this.name = name;
        this.mdtext = mdtext;
    }

    public String getName() {
        return name;
    }

    public String getMdtext() {
        return mdtext;
    }

    @Override
    public String getIconFileName() {
        return "document.png"; 
    }

    @Override
    public String getDisplayName() {
        return "Greeting"; 
    }

    @Override
    public String getUrlName() {
        return "greeting"; 
    }
}