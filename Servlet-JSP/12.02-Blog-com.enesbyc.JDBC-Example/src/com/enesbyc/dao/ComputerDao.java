package com.enesbyc.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.enesbyc.model.Computer;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ComputerDao {

	public ArrayList<Computer> getComputerFromByID(int id){
		
		ArrayList<Computer> arrayList = new ArrayList<>();
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani","root", "39352675");
				String query="Select * from Computer Where CategoryID="+id;
				PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
				ResultSet resultSet=pstmt.executeQuery();
				while (resultSet.next()) {
					Computer computer=new Computer(resultSet.getString("ComputerName"),resultSet.getString("ComputerPrice"));
					arrayList.add(computer);
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return arrayList;
			
		
	}
}
