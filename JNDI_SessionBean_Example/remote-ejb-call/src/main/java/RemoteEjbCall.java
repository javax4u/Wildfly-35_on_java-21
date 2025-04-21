
import demo.HelloSessionInterface;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Vdoxx
 */
public class RemoteEjbCall {

    public static String LOOK_UP_STRING_1 = "ejb:demo/ejb_impl/HelloSessionBean!demo.HelloSessionInterface";
    public static HelloSessionInterface helloSessionInterface;

    public static void main(String[] args) throws Exception {
        lookupWithEjbBindingHelloSessionInterface();
    }

    public static void lookupWithEjbBindingHelloSessionInterface() throws Exception {
        Hashtable<String, Object> jndiProps = new Hashtable<>();

        jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        jndiProps.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");

        // Authentication credentials
        jndiProps.put(Context.SECURITY_PRINCIPAL, "admin");     // <-- your WildFly user
        jndiProps.put(Context.SECURITY_CREDENTIALS, "admin"); // <-- your WildFly password

        Context context = new InitialContext(jndiProps);

        HelloSessionInterface bean = (HelloSessionInterface) context.lookup(LOOK_UP_STRING_1);

        String response = bean.getHello("ANOTHER JVM ");
        System.out.println("Response from server: " + response);

        context.close();
    }

}
