package app.netlify.laptopso1vn;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import jakarta.ws.rs.ext.Provider;


@Provider
public class Application extends ResourceConfig {

    public Application() {

            property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
            property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
    }

}
