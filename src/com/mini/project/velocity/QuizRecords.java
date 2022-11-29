package com.mini.project.velocity;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class QuizRecords {

		public static List<Questions> getQuizQuestions() {
			Questions qs= new Questions();
			List list= new ArrayList();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb", "root", "root");
				
				PreparedStatement stmt = con.prepareStatement("select * from questions");
				
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					int id=rs.getInt(1);
					String question=rs.getString(2);
					String answer=rs.getString(3);
					list.add(new Questions(id, question, answer));
				}
				
			} catch (SQLException |ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			return list; 
			
			
			
		}
	}

}
