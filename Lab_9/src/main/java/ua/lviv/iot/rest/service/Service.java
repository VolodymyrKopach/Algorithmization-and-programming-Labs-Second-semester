package ua.lviv.iot.rest.service;

import ua.lviv.iot.model.Accommodation;
import ua.lviv.iot.persistence.dao.AccommodationDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.persistence.Table;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/accommodations")
@Table(name = "accommodations")
@SessionScoped
public class Service implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private AccommodationDao dao;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Accommodation getAccommodation(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createAccommodation(Accommodation accommodation) {
        dao.persist(accommodation);
        return Response.status(200).entity("Ok").build();
    }

    @DELETE
    @Path("/{id}")
    public  Response deleteAccommodation(@PathParam("id") Integer id) {
        dao.delete(id);
        return Response.status(200).entity("Ok").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateAccommodation(Accommodation accommodation) {
        dao.update(accommodation);
        return Response.status(200).entity("Ok").build();
    }
}
