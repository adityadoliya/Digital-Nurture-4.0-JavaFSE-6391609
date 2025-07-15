package org.example;

public class GreetingApplication {
    private GreetingService service;

    public GreetingApplication(GreetingService service){
        this.service = service;
    }

    public String greet(String name) {
        return service.greet(name);
    }
}
