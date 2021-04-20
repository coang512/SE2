package restful;

import java.util.List;

import dao.TeacherService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Teacher;

@Path("/listteacher")
public class ReturnListTeacher {
	TeacherService service  = new TeacherService()	;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teacher> getTeachers() {
		return service.getAllTeachers();
	}
}
