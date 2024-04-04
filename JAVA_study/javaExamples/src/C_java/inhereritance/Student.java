package C_java.inhereritance;

public class Student extends Person{
    public String studentId;
	public String major;
	
	public Student() {
		
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, String studentId, String major) {
		this(name,age);
		height = 179.6f;  //부모의 멤버중 protected 멤버 변수... 
//		weight = 100.0f;  WW// default로 참조가 되지 않아요...
		this.studentId = studentId;
		this.major = major;
    }
	
	@Override
	public String getDetails() {
		return "[이름: "+name+"\t나이: "+age+"\t학번: "+studentId+"\t전공: "
				+major+"]";
	}

	public void study(){
		System.out.println(name +"is study ");
	}
	public String getName() {
		return this.name;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
