package example;

import example.controller.BankController;

import javax.xml.ws.Endpoint;

public class Serve
{
    public static void main( String[] args )
    {
        Object implementor = new BankController();
        String address = "http://localhost:8000/rolebase";
        Endpoint.publish( address, implementor );
    }
}

