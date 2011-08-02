package pl.marchwicki.service.ejb.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/Users")
public interface UsersServiceLocal {

	@GET
	@Path(value="/Data/{personId}")
	public String getUser(@PathParam("personId") Integer personId);

	
}
