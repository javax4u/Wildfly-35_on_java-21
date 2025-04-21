/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demo;

import jakarta.ejb.Remote;

/**
 *
 * @author Vdoxx
 */
@Remote
public interface HelloSessionInterface {

    public String getHello(String param);
}
