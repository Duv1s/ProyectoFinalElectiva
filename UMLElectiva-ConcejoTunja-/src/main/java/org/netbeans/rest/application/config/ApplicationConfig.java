
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import model.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
 * @author Duv1s
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(model.servicio.ConcejalServicio.class);
resources.add(model.servicio.DestinoPeticionServicio.class);
resources.add(model.servicio.EventoServicio.class);
resources.add(model.servicio.PeticionServicio.class);
resources.add(model.servicio.TipoPeticionServicio.class);
    }
    
}

