public class Book {
	private String name;
	private int pageNumber;

	public Book(String name, int pageNumber){
		this.name = name;
		if (pageNumber < 0){
			pageNumber = 0;
		}
		this.pageNumber = pageNumber;
	}


	//set-get page number
	public int getPageNumber(){
		return this.pageNumber;
	}

	public void setPageNumber(int pageNumber){
		if (pageNumber < 0){
			pageNumber = 0;
		}
		this.pageNumber = pageNumber;
	}

	//set-gate name
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}


}
