package com.greenfoxacademy.rest.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeter {

    @JsonProperty("welcome_message")
    private String welcomeMessage;

    public Greeter(String name, String title) {
        this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public Greeter() {
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
