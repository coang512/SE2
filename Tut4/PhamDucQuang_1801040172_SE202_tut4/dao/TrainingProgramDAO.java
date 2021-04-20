package sad.humanresourcemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import sad.humanresourcemanagementsystem.daoi.TrainingProgramDAOI;
import sad.humanresourcemanagementsystem.db.DBConnection;
import sad.humanresourcemanagementsystem.model.staffInTrainning;
import sad.humanresourcemanagementsystem.model.TrainingProgram;
public class TrainingProgramDAO implements TrainingProgramDAOI {

	@Override
	public int insertTrainingProgram(staffInTrainning staffTrain) {
		DBConnection dbConnection = DBConnection.getInstance();
		PreparedStatement pstmt;
		ResultSet rs;
		Connection con = dbConnection.getConnection();
		try {
			pstmt = con.prepareStatement("insert into staffInTrainning values(?,?,?,?,0)");
			pstmt.setString(1, staffTrain.getFullName());
			pstmt.setString(2, staffTrain.getTrainningPro());
			pstmt.setInt(3, staffTrain.getSupportMoney());
			pstmt.setString(4, staffTrain.getDescription());
			int i = pstmt.executeUpdate();
			if(i>0) return 1;
			}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return 0;
	}

	@Override
	public boolean updateTrainingProgram(TrainingProgramDAOI program) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTrainingProgramStatus(int id, int status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TrainingProgramDAOI> getTrainingProgramByStatus(int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<staffInTrainning> getAllInfor() {	
			List<staffInTrainning> list = new ArrayList<staffInTrainning>();
			DBConnection dbConnection = DBConnection.getInstance();
			PreparedStatement pstmt;
			ResultSet rs;
			Connection con = dbConnection.getConnection();
			try {
				pstmt = con.prepareStatement("select*from staffInTrainning");
				rs = pstmt.executeQuery();
				while (rs.next()) {
					staffInTrainning staffTrain = new staffInTrainning();
					staffTrain.setFullName(rs.getString("fullName"));
					staffTrain.setTrainningPro(rs.getString("trainningPro"));
					staffTrain.setSupportMoney(rs.getInt("supportMoney"));
					staffTrain.setDescription(rs.getString("description"));
					staffTrain.setSit_id(rs.getInt("sit_id"));
					list.add(staffTrain);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;		
	}

	@Override
	public int deleteTrainningProgram(int id) {
		DBConnection dbConnection = DBConnection.getInstance();
		PreparedStatement pstmt;
		ResultSet rs;
		Connection con = dbConnection.getConnection();
		try {
			pstmt = con.prepareStatement("delete from staffInTrainning where sit_id=?");
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if(i>0) return 1;
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
}

	@Override
	public int updateTrainningProgram(staffInTrainning staffTrain) {
		DBConnection dbConnection = DBConnection.getInstance();
		PreparedStatement pstmt;
		ResultSet rs;
		Connection con = dbConnection.getConnection();
		try {
			pstmt = con.prepareStatement("update staffInTrainning set fullName=?, trainningPro=?, supportMoney=?, description=? where sit_id=?");
			pstmt.setString(1, staffTrain.getFullName());
			pstmt.setString(2, staffTrain.getTrainningPro());
			pstmt.setInt(3, staffTrain.getSupportMoney());
			pstmt.setString(4, staffTrain.getDescription());
			pstmt.setInt(5, staffTrain.getSit_id());
			int i = pstmt.executeUpdate();
			if(i>0) return 1;
			}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return 0;
	}

	@Override
	public List<staffInTrainning> filterTrainPro(String trainPro) {
		List<staffInTrainning> list = new ArrayList<staffInTrainning>();
		DBConnection dbConnection = DBConnection.getInstance();
		PreparedStatement pstmt;
		ResultSet rs;
		Connection con = dbConnection.getConnection();
		try {
			pstmt = con.prepareStatement("select*from staffintrainning where trainningPro like ?");
			pstmt.setString(1, trainPro);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				staffInTrainning staffTrain = new staffInTrainning();
				staffTrain.setFullName(rs.getString("fullName"));
				staffTrain.setTrainningPro(rs.getString("trainningPro"));
				staffTrain.setSupportMoney(rs.getInt("supportMoney"));
				staffTrain.setDescription(rs.getString("description"));
				staffTrain.setSit_id(rs.getInt("sit_id"));
				list.add(staffTrain);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}

	@Override
	public List<TrainingProgram> getAllTrainningInfor() {
		List<TrainingProgram> list = new ArrayList<TrainingProgram>();
		DBConnection dbConnection = DBConnection.getInstance();
		PreparedStatement pstmt;
		ResultSet rs;
		Connection con = dbConnection.getConnection();
		try {
			pstmt = con.prepareStatement("select*from trainingprogram");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				TrainingProgram tp = new TrainingProgram();
				tp.setId(rs.getInt("id"));
				tp.setName(rs.getString("name"));
				tp.setTime(rs.getInt("time"));
				tp.setDescription(rs.getString("description"));
				tp.setStatus(rs.getInt("status"));
				list.add(tp);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}
}
