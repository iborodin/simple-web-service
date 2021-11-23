package org.iborodin.dp;

import org.iborodin.dp.endpoint.DateEndpoint;

import javax.xml.ws.Endpoint;

public class App
{
    public static void main( String[] args )
    {
        final DateEndpoint endpoint = new DateEndpoint();
        final String url = "http://localhost:8080/DateEndpoint?wsdl";
        Endpoint.publish(url, endpoint );
        System.out.println(url);
    }
}
