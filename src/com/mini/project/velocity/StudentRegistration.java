package com.mini.project.velocity;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRegistration {
	
	static Student stud= new Student();
	
	public static Student validate_student(int stud_id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "root");
			
			PreparedStatement stmt = con.prepareStatement("select * from student where sid=?");
			stmt.setInt(1, stud_id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int sid=rs.getInt(1);
				String sname=rs.getString("sname");
				
				stud.setSid(sid);
				stud.setSname(sname);	
			}
		
			} catch (SQLException |ClassNotFoundException e) {
			
				e.printStackTrace();
			} 
				return stud;
	
		}

	
	public static int registerStudent(int sid, String sname){
		int number=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "root");
			
			PreparedStatement stmt = con.prepareStatement("insert into student values (?,?)");
			
			stmt.setInt(1, sid);
			stmt.setString(2, sname);
			number = stmt.executeUpdate();
			
			} catch (SQLException |ClassNotFoundException e) {
			
				e.printStackTrace();
			} 
				return number;
		
		}


public static void getStudentId() {
	
}
}
