package org.jkd.poc.camelcxf.perf;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kd40173 on 19/06/14.
 */
public class MaintanaceServiceFrontEnd {

    @Path("/replacement")
    @POST
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Response notifyReplacement(ReplacementNotification notification){
        return null;
    }
}
