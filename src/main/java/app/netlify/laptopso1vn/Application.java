package app.netlify.laptopso1vn;

import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;



@Provider
public class Application extends ResourceConfig {

    public Application() {
            property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
            property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
    }

}
