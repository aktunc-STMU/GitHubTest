
public class EngStudent extends Student {
	
	Grade grade;
int id;

	public EngStudent(int id, String name, Grade grade) {
		super(id, name);
		
	}

	
	public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "EngStudent [grade=" + grade.calculateGrade() + "]";
	}
	
	

}
