package com.enesbyc.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.enesbyc.model.Lesson;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LessonDao {
	
	public ArrayList<Lesson> getLessonList(){
		
		ArrayList<Lesson> arrayList = new ArrayList<>();
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani","root", "39352675");
				String query="Select * from Lesson";
				PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
				ResultSet resultSet=pstmt.executeQuery();
				while (resultSet.next()) {
					Lesson lesson=new Lesson(resultSet.getInt("LessonID"),resultSet.getString("LessonName"));
					arrayList.add(lesson);
				}
				
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
			return arrayList;
			
	}
		
}







