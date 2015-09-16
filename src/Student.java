public class Student {
	
		private String studentID;
		private String firstName;
		private String lastName;
		private int[] testScores;
		
		public Student() {
			this(null, null, null, null);
		}
	    
		public Student(String studentId, String firstName, String lastName, int[] testScores)
		{ 
			setStudentID(studentID);
			setFirstName(firstName);
			setLastName(lastName);
			setTestScores(testScores);
			
			
			
			
		}
		
		@Override
	    public String toString() {	
	       return (this.studentID + " " + this.firstName + " " + this.lastName + " " + Double.toString(getAverage()));
	    }


		    Double getAverage() {
		    	Double sum= (double)0;
		    	for(int i = 0; i < this.testScores.length; i++) {
		    		sum += this.testScores[i];
		    	
		    	}
		   	
		    	return (sum / this.testScores.length);
		    	
		
		}

			public String getStudentID() {
			return studentID;
		}

		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int[] getTestScores() {
			return testScores;
		}

		public void setTestScores(int[] testScores) {
			this.testScores = testScores;
		}
	}

