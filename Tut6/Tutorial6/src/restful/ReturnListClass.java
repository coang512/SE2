package restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import dao.ClassService;
import jakarta.ws.rs.Produces;

@Path("/listclass")
public class ReturnListClass {
	ClassService service = new ClassService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<model.Class> getList(){
		return service.getAllClasses();
	}
}
