public class Teacher{
	private String name;
	
	public Teacher(){
		name="unknown";
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String presentTeacher(){
		return "The teacher is present.";
	}
	
	public String absentTeacher(){
		return "The teacher is absent.";
	}
}
