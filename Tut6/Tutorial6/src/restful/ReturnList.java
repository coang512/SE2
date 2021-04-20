package restful;

import java.util.List;

import dao.StudentService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Student;

@Path("/returnlist")
public class ReturnList {
	StudentService studentService = new StudentService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getList(){
		return studentService.getAllStudent();
	}
}
