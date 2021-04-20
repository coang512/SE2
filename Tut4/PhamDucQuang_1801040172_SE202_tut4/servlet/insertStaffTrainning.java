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
 * Servlet implementation class insertStaffTrainning
 */
public class insertStaffTrainning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertStaffTrainning() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("fullName");
		String trainPro = request.getParameter("trainningPro");
		int spMoney = Integer.parseInt(request.getParameter("supportMoney"));
		String description = request.getParameter("description");
		staffInTrainning staffTrain = new staffInTrainning(name, trainPro, spMoney, description,0);
		int check = new TrainingProgramDAO().insertTrainingProgram(staffTrain);
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
