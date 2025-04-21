package demo;

import jakarta.ejb.Stateless;

/**
 *
 * @author Vdoxx
 */
@Stateless
public class HelloSessionBean implements HelloSessionInterface {

    @Override
    public String getHello(String param) {
        String temp = "I am HelloSessionBean. called from  " + param;
        System.out.println(temp);
        return temp;
    }

}
