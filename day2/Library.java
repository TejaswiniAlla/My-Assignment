package week1.day2;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book Name" +bookTitle+" added successfully");
		return bookTitle;
		}
	public void issueBook() {
		System.out.println("book issued successfully");
	}
	public static void main(String[] args) {
		Library lib = new Library();
				lib.addBook("LOVE STORY");
				lib.issueBook();
	}
	
	
	
	

}
