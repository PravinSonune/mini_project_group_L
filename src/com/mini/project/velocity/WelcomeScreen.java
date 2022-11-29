package com.mini.project.velocity;


	import java.util.List;
	import java.util.Scanner;


	public class WelcomeScreen {

			static Scanner input = new Scanner(System.in);

			public static void main(String[] args) {
				welcomeScreen();
			}

			public static String validateForRegistration(int stud_id){
				String msg=null;
				Student stud = StudentRegistration.validate_student(stud_id);
			if(stud_id==stud.getSid()) {
				 msg="You are already Registred Student !!!Use your Login Id for Quiz...";
			}
			return msg;
			
			}
			public static String validateStudent(int stud_id) {
				String msg=null;
				Student stud = StudentRegistration.validate_student(stud_id);
			if(stud_id==stud.getSid()) {
				 msg="Lets start Java Quiz !!!!!!!";
				 
				 List<Questions> quizQuestions = QuizRecords.getQuizQuestions();
				
				 System.out.println(quizQuestions.get(0).getQuestion()+" \n"
						 +  " a.6  b.7.  c.8  d.9 ");
				 String option = input.next();
				 if(option.equals(quizQuestions.get(2).getAnswer())) {
					 System.out.println("Your answer is correct");
				 }else {
					 System.out.println("Wrong answer !!!!");
				 }
				 
				 
			}else {
				msg="you are not registered student. first then login again .........";
			}
			return msg;
		}
			public static void welcomeScreen() {
				System.out.println();
				System.out.println("Welcome to Quiz Compitition  !!!!!!!!!!!!!!!!");
				System.out.println("Press-1 start quiz for Register students");
				System.out.println("Press-2 if not register,Plz Register first.");
			
				int number = input.nextInt();

				switch (number) {

				case 1:
					System.out.println("Plz enter valid Id :");
					int stud_id = input.nextInt();
					// StudentRegistration sr= new StudentRegistration();

					String msg = validateStudent(stud_id);
					System.out.println(msg);
					break;
			
				case 2:
					System.out.println("Plz enter Id :");
					int sid=input.nextInt();
				
					String msg1 = validateForRegistration(sid);
					//System.out.println(msg1);
					if(msg1!=null) {
						welcomeScreen();
					}else {
						System.out.println("Plz enter Name :");
						String sname=input.next();
						
						int registerStudent = StudentRegistration.registerStudent(sid,sname);
						if(registerStudent!= 0) {
							System.out.println("Registration Done !!!");
							System.out.println("Login using Id....");
							welcomeScreen();
				}
					
			}
		}
			}
			}

}
