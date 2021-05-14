package staticClass;

class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String dept;
	
	public Student(String name) {
		super(name);
	}
}

public class UpDownCasting {
	
	public static void main(String[] args) {
		//업캐스팅 진행
		Person person = new Student("MadPlay");
		System.out.println(person.name);
		//다운캐스팅
		Student student = (Student) person;
		System.out.println(student.name);
		//Okay!
		student.name = "Kimtaeng";
		
		//Okay!
		student.dept = "Computer Eng";
	}

}
