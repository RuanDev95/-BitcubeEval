
public class Course {
	
	/**
	 * Creating variables needed
	 */
	String courseName;
	int durationInMonths;
	String listOfCourses;
	String degreeCourselinkedTo;
	
	/**
	   * Creating constructor
	   */
	   public Course(String courseName,int durationInMonths, String listOfCourses, String degreeCourselinkedTo ) {
	      
	       this.courseName = courseName;
	       this.durationInMonths = durationInMonths;
	       this.listOfCourses = listOfCourses;
	       this.degreeCourselinkedTo = degreeCourselinkedTo;
	       
	       }
	   /**
		   * Creating setters for editing purposes
		   */
		   public void setcourseName(String courseName) {
			   this.courseName = courseName;      
		   }
		   
		  
			public void setdurationInMonths (int durationInMonths) {
				   this.durationInMonths = durationInMonths;      
			   }
			
			public void setListOfCourses(String listOfCourses) {
				   this.listOfCourses = listOfCourses;      
			   }
			
			public void setdegreeCourselinkedTo(String degreeCourselinkedTo) {
				   this.degreeCourselinkedTo = degreeCourselinkedTo;      
			   }
			
			/**
			   * Creating toString method
			   */
			   public String toString() {
				   
			       String output = "";
			       output += "\nCourse Name : " +courseName;
			       output += "\nDuration In Months: " + durationInMonths;
			       output += "\nList Of Courses: " + listOfCourses;
			       output += "\nDegree Course linked To: " + degreeCourselinkedTo;
			       
			       return output;
			   }

}
