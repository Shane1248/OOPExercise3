public class Subject{
	private String sched;
	private Teacher teacher;
	
	public Subject(String sched){
		this.sched=sched;
		teacher= new Teacher();
	}
	
	public Subject(String sched, Teacher teacher){
		this.sched=sched;
		this.teacher=teacher;
	}
	
	public String getSchedule(){
		return sched;
	}
	
	public void setSchedule(String sched){
		this.sched=sched;
	}
	
	public void setTeacher(Teacher t){
		teacher=t;
	}
	
	public String present(){
		return teacher.presentTeacher();
	}
}
