
public class People {

	private String name;
	private String student;
	private String school;
	
	public People(String name, String student, String school){
		this.name = name;
		this.student = student;
		this.school = school;
	}
	
	public String getName(){
		return name;
	}
	public String getStudent(){
		return student;
	}
	public String getSchool(){
		return school;
	}
	
	
	public String toString(){
		String x = name + ", " + student + ", " + school;
		return x;
	}
}
