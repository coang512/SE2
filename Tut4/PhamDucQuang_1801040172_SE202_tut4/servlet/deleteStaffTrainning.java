package sad.humanresourcemanagementsystem.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sad.humanresourcemanagementsystem.dao.TrainingProgramDAO;
import sad.humanresourcemanagementsystem.model.staffInTrainning;

/**
 * Servlet implementation class deleteStaffTrainning
 */
public class deleteStaffTrainning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteStaffTrainning() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("sit_id"));
		int check = new TrainingProgramDAO().deleteTrainningProgram(id);
		if(check == 1) {
			List<staffInTrainning> list = new TrainingProgramDAO().getAllInfor();
			request.setAttribute("list",list);
			request.getRequestDispatcher("listStaffTrainning.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
