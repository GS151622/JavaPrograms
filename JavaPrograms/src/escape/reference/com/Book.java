package escape.reference.com;

//This class if fully controlled; there is no issue where values can be updated from outside or encapsulation violates :)
public class Book {
	
	private String title;
	private String author;
	
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
