package br.com.emprel.dao;

import br.com.emprel.factory.ConnectionFactory;
import br.com.emprel.model.Complaint;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class ComplaintDao {
	public void save(Complaint complaint) throws SQLException {
		String sql = "insert into reclamacoes(address,city,complement,description,mail,name,phone,province,state,zip_code,observations) values(?,?,?,?,?,?,?,?,?,?,?)";

		Connection con = null;
		PreparedStatement p = null;

		try {
			con = ConnectionFactory.createConnection();
			p = (PreparedStatement) con.prepareStatement(sql);
			p.setString(0, complaint.getAddress());
			p.setString(1, complaint.getCity());
			p.setString(2, complaint.getComplement());
			p.setString(3, complaint.getDescription());
			p.setString(4, complaint.getMail());
			p.setString(5, complaint.getName());
			p.setString(6, complaint.getPhone());
			p.setString(7, complaint.getProvince());
			p.setString(8, complaint.getState());
			p.setString(9, complaint.getZipCode());
			p.setString(10, complaint.getObservations());
			p.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				p.close();
		}
	}

	public ArrayList<Object> search(Complaint complaint) throws SQLException {
		String sql = "select * from reclamacoes";

		ArrayList<Object> reclamacoes = new ArrayList<Object>();
		
		Connection con = null;
		PreparedStatement p = null;
		ResultSet result = null;

		try {
			con = ConnectionFactory.createConnection();
			p = (PreparedStatement) con.prepareStatement(sql);
			result = p.executeQuery();
			int i = 0;
			while (result.next()) {
				Object obj = result.getObject(i++);
				reclamacoes.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				p.close();
		}
		return reclamacoes;
	}

	public void delete(Complaint complaint) throws SQLException {
		String sql = "delete reclamacoes where(id = ?)";

		Connection con = null;
		PreparedStatement p = null;

		try {
			con = ConnectionFactory.createConnection();
			p = (PreparedStatement) con.prepareStatement(sql);
			p.setInt(1, complaint.getId());
			p.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				p.close();
		}
	}

	public void update(Complaint complaint) throws SQLException {
		String sql = "update reclamacoes set(address = ?,city = ?,complement = ?,description = ?,mail = ?,name = ?,phone = ?,province = ?,state = ?,zip_code = ?,observations = ?) where(id = ?)";

		Connection con = null;
		PreparedStatement p = null;

		try {
			con = ConnectionFactory.createConnection();
			p = (PreparedStatement) con.prepareStatement(sql);
			p.setInt(11, complaint.getId());
			p.setString(0, complaint.getAddress());
			p.setString(1, complaint.getCity());
			p.setString(2, complaint.getComplement());
			p.setString(3, complaint.getDescription());
			p.setString(4, complaint.getMail());
			p.setString(5, complaint.getName());
			p.setString(6, complaint.getPhone());
			p.setString(7, complaint.getProvince());
			p.setString(8, complaint.getState());
			p.setString(9, complaint.getZipCode());
			p.setString(10, complaint.getObservations());
			p.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				p.close();
		}
	}
}
