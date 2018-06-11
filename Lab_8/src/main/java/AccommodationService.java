import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/accommodation")
public class AccommodationService {

    private static Map<Integer, Accommodation> accommodationMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Accommodation getAccommodation(@PathParam("id") Integer id) {
        return accommodationMap.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createAccommodation(Accommodation accommodation) {
        accommodationMap.put(accommodation.getId(), accommodation);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceAccommodation(@PathParam("id") Integer id, Accommodation accommodation) {
        accommodationMap.replace(id, accommodation);
    }

    @DELETE
    @Path("/{id}")
    public void deleteAccommodation(@PathParam("id") Integer position) {
        accommodationMap.remove(position);
    }
}