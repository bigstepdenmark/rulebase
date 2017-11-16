package example;

import example.controller.BankController;

import javax.xml.ws.Endpoint;

public class Serve
{
    public static void main( String[] args )
    {
        System.out.println("Starting Rule Base service...");
        Object implementor = new BankController();
        String address = "http://localhost:9000/rulebase";
        Endpoint.publish( address, implementor );
        System.out.println("Service is now running. (press CTRL+C to exit the server)");
        System.out.println("Address: " + address);
    }
}

