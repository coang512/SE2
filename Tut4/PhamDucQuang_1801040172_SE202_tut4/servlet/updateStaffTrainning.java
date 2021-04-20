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
 * Servlet implementation class updateStaffTrainning
 */
public class updateStaffTrainning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStaffTrainning() {
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
			int id = Integer.parseInt(request.getParameter("sit_id"));
			staffInTrainning staffTrain = new staffInTrainning(name, trainPro, spMoney, description,id);
			int check = new TrainingProgramDAO().updateTrainningProgram(staffTrain);
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
