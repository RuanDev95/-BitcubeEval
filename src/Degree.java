
public class Degree {

	/**
	 * Creating variables needed
	 */
	String degreeName;
	int durationInYears;
	String listOfCourses;
	String responsibleLecturer;
	
	/**
	   * Creating constructor
	   */
	   public Degree(String degreeName,int durationInYears, String listOfCourses, String responsibleLecturer ) {
	      
	       this.degreeName = degreeName;
	       this.durationInYears = durationInYears;
	       this.listOfCourses = listOfCourses;
	       this.responsibleLecturer = responsibleLecturer;
	       
	       }
	   /**
		   * Creating setters for editing purposes
		   */
		   public void setDegreeName(String degreeName) {
			   this.degreeName = degreeName;      
		   }
		   
		  
			public void setDurationInYears (int durationInYears) {
				   this.durationInYears = durationInYears;      
			   }
			
			public void setListOfCourses(String listOfCourses) {
				   this.listOfCourses = listOfCourses;      
			   }
			
			public void setResponsibleLecturer(String responsibleLecturer) {
				   this.responsibleLecturer = responsibleLecturer;      
			   }
			
			/**
			   * Creating toString method
			   */
			   public String toString() {
				   
			       String output = "";
			       output += "\nDegree Name : " + degreeName;
			       output += "\nDuration In Years: " + durationInYears;
			       output += "\nList Of Courses: " + listOfCourses;
			       output += "\nResponsible Lecturer : " + responsibleLecturer;
			       
			       return output;
			   }
			
			
}
