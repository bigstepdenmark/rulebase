package example;

import example.controller.BankController;

import javax.xml.ws.Endpoint;

public class Serve
{
    public static void main( String[] args )
    {
        System.out.println("Starting server...");
        Object implementor = new BankController();
        String address = "http://localhost:9000/rulebase";
        Endpoint.publish( address, implementor );
        System.out.println("The server is now running. (press CTRL+C to exit the server)");
        System.out.println("Address: " + address);
    }
}

