package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!, This if my first application build";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
