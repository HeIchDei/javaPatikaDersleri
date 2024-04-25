public class Employee {
	String name;
	double salary;
	int workHour;
	int hireYear;

	Employee(String name, double salary, int workHour, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHour = workHour;
		this.hireYear = hireYear;
	}

	double tax() {
		if (this.salary < 1000.0) {
			return 0;
		}
		return this.salary * 0.03;
	}

	double bonus() {
		if (this.workHour > 40) {
			return (this.workHour - 40) * 30;
		}
		return 0;
	}

	double raiseSalary() {
		if (this.hireYear < 10) {
			return this.salary * 0.05;
		}
		else if (this.hireYear > 9 && this.hireYear < 20) {
			return this.salary * 0.1;
		}
		return this.salary * 0.15;
	}

	void printToString() {
		System.out.println("Adi: " + this.name);
		System.out.println("Maasi: " + this.salary);
		System.out.println("Calisma saati: " + this.workHour);
		System.out.println("Baslangic Yili: " + this.hireYear);
		System.out.println("Vergi: " + this.tax());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Maas Artisi: " + this.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maas: " + (this.salary - this.tax() + this.bonus()));
		System.out.println("Toplam maas: " + (this.salary - this.tax() + this.bonus() + this.raiseSalary()));
	}

}