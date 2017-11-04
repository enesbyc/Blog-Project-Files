package com.enesbyc.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.enesbyc.model.Category;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CategoryDao {


public ArrayList<Category> getCategory(){
	
	ArrayList<Category> arrayList = new ArrayList<>();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani","root", "39352675");
			String query="Select * from Category";
			PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(query);
			ResultSet resultSet=pstmt.executeQuery();
			while (resultSet.next()) {
				Category category=new Category(resultSet.getInt("CategoryID"),resultSet.getString("CategoryName"));
				arrayList.add(category);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		return arrayList;
		
}
	
}
