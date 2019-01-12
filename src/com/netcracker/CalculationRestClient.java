package com.netcracker;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import javax.ws.rs.core.Response;

public class CalculationRestClient {

    private static WebTarget target;
    private static Response response;


    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        getCalcResponse(client, OPERATION.add, a, b);

        getCalcResponse(client, OPERATION.sub, a, b);

        getCalcResponse(client, OPERATION.mul, a, b);

        getCalcResponse(client, OPERATION.div, a, b);


    }

    public static void getCalcResponse(Client client, OPERATION op, int a, int b) {
        target = client.target("http://localhost:8080/rest/calc/" + op + "/{a}/{b}")
                .resolveTemplate("a", a)
                .resolveTemplate("b", b);
        response = target.request().post(null);
        System.out.println(response.readEntity(String.class));
    }

    enum OPERATION {
        add, sub, mul, div
    }
}