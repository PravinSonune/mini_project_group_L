package com.mini.project.velocity;

public class Question {


		private int q_id;
		
		private String question;
		
		private String answer;

		public int getQ_id() {
			return q_id;
		}

		public void setQ_id(int q_id) {
			this.q_id = q_id;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		public Questions(int q_id, String question, String answer) {
			super();
			this.q_id = q_id;
			this.question = question;
			this.answer = answer;
		}

		public Questions() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Questions [q_id=" + q_id + ", question=" + question + ", answer=" + answer + "]";
		}
		
		
	}


