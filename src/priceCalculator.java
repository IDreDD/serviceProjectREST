import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/priceCalculator")
public class priceCalculator {
    @GET
    @Path("/")
    @Produces("text/plain")
    public Response getPrice(@DefaultValue("0") @QueryParam("distance") float distance) {
        return Response.status(200).entity( distance * 0.3f).build();
    }
}
