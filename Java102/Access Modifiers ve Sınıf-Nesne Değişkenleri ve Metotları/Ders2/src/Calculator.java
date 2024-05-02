public class Calculator {

	public static void calcAve(Course[] notes){
		double total = 0;
		for (Course c : notes) {
			total += c.note;
		}

		double ave = total/notes.length;

		System.out.println("Ortalamaniz: " + ave);

	}
}
