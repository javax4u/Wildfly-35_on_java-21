/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.servlet;

import demo.HelloSessionInterface;
import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Vdoxx
 */
@Path("hello")
public class HelloResource {

    @EJB
    HelloSessionInterface helloSessionInterface;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        String response = helloSessionInterface.getHello("HelloResource_Rest_Servlet");
        String temp = "Hi am  HelloResource_Rest_Servlet rest-servlet going to call EJB HelloSessionBean..." + "\n" + response;
        System.out.println(temp);
        return temp;
    }
}
