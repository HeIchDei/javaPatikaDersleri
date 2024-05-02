public class Student {
	private String name;
	private String surname;
	private int id;
	private String address;
	private int note;


	public Student(String name, String surname, int id, String address, int note){
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.address = address;

		if(note > 100 || note < 0){
			note = 0;
		}
		this.note = note;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getSurname(){
		return this.surname;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		if(note > 100 || note < 0){
			note = 0;
		}
		this.note = note;
	}
}
