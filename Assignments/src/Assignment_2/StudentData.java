package Assignment_2;

public class StudentData {
	 private int stuID;
	   private String stuName;
	   private int stuAge;
	   
	//Getters & Setters
	   public int getStuID() {
		return stuID;
		}
	   public void setStuID(int stuID) {
		this.stuID = stuID;
		}
	   public String getStuName() {
		return stuName;
		}
	   public void setStuName(String stuName) {
		this.stuName = stuName;
		}
	   public int getStuAge() {
		return stuAge;
		}
	   public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
		}


	 //default constructor
	StudentData(){
		   stuID=1001;
		   stuName="Basanta Babu Ghimire";
		   stuAge=20;		   
	   }
	
	//parameterized constructor
	StudentData(int stuID, String stuName, int stuAge){
		   this.stuID=stuID;
		   this.stuName=stuName;
		   this.stuAge=stuAge;		   
	   }
	
	


	public static void main(String args[])
	   {
	       //This object creation would call the default constructor
		System.out.println("Default Constructor Output:");
		
		StudentData myobj = new StudentData();
	    System.out.println("Student Name is: "+myobj.getStuName());
	    System.out.println("Student Age is: "+myobj.getStuAge());
	    System.out.println("Student ID is: "+myobj.getStuID());
	       
	    System.out.println("");
	    
	       /*This object creation would call the parameterized
	        * constructor StudentData(int, String, int)*/
	    System.out.println("Parameterized Constructor Output:");
	    
	    StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
	    System.out.println("Student Name is: "+myobj2.getStuName());
	    System.out.println("Student Age is: "+myobj2.getStuAge());
	    System.out.println("Student ID is: "+myobj2.getStuID());
	  }

}
