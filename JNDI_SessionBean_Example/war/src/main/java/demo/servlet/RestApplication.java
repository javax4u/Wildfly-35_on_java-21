/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.servlet;

/**
 *
 * @author Vdoxx
 */
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("api")  // Base URL for all REST endpoints
public class RestApplication extends Application {
    // No need to override anything if you just want auto-discovery
}
