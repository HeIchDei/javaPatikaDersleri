public class Main {
	public static void main(String[] args){

		Student st1 = new Student("Mustafa", "Cetindag", 123, "aa", 85);
		Student st2 = new Student("Patika", "Dev", 2312, "bb", 85);
		Student st3 = new Student("Kodluyoruz", "Java102", 3333, "cc", 85);

		Instructor teacher = new Instructor("Mahmut","Cetindag","CENG");

		// Composition, Aggretation
		// Course has an Instructor
		Course mat = new Course("MAT101", "MAT", teacher);
		System.out.println(mat.getInstructor().getName());

		// Student[] stu = {st1,st2,st3};

		// System.out.println(mat.calcAvarage(stu));



	}
}
