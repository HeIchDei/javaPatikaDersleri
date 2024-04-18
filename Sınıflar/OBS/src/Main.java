public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut", "TRH", "0123 456 78 90");
		Teacher t2 = new Teacher("Graham Bell", "FZK","0000");
		Teacher t3 = new Teacher("Kulyutmaz", "BIO", "123");

		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);

		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);

		Course biyo = new Course("Biyoloji", "101", "BIO");
		biyo.addTeacher(t3);

		Student s1 = new Student("Inek Sabah", "123", "4", tarih, fizik, biyo);
		s1.addBulkExamNote(100,0,50);
		s1.isPass();

		Student s2 = new Student("Guduk necmi", "444", "4", tarih, fizik, biyo);
		s2.addBulkExamNote(50,30,70);
		s2.isPass();

	}
}