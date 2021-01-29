
public class STUDENT{
	/**
	   * Creating person class
	   */
	   String forenames;
	   String surname;
	   String emailAddress;
	   int dateOfBirth;
	   String degree;
	   String firstname;
	   String fullname;
	  
	   /**
	   * Creating constructor
	   */
	   public STUDENT(String forenames,String surname, String emailAddress,int dateOfBirth, String degree, String firstname, String fullname) {
	      
	       this.forenames = forenames;
	       this.surname = surname;
	       this.emailAddress = emailAddress;
	       this.dateOfBirth = dateOfBirth;
	       this.degree = degree;
	       this.firstname = firstname;
	       this.fullname = fullname;
	       
	      
	   }
	   /**
	   * Creating setters for editing purposes
	   */
	   public void setForname (String forenames) {
		   this.forenames = forenames;      
	   }
	   
	  public void setSurname (String surname) {
		  this.surname = surname;
		  
	  }
	   public void setEmailAddress (String emailAddress){
	       this.emailAddress = emailAddress;
	      
	   }
	   
	   public void dateOfBirth (int dateOfBirth){
	       this.dateOfBirth = dateOfBirth;
	      
	   }
	   
	   public void degree (String degree){
	       this.degree = degree;
	      
	   }
	   public void firstname(String firstname){
	       this.firstname= firstname;
	      
	   }
	   
	   public void fullname(String fullname){
	       this.fullname = fullname;
	      
	   }
	  
	   /**
	   * Creating toString method
	   */
	   public String toString() {
	       String output = "";
	       output += "\nForenames : " + forenames;
	       output += "\nSurname : " + surname;
	       output += "\nEmail Address: " + emailAddress;
	       output += "\nDate of Birth : " + dateOfBirth;
	       output += "\nDegree enrolled in " + degree;
	       output += "\nFirst name , based of forenames" + firstname;
	       output += "\nFull name " + forenames + surname;
	       return output;
	       }
}
