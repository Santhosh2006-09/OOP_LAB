import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected Date publishDate;
    protected boolean isAvailable;
    protected ArrayList<String> borrowerHistory;
    
    public Book(String title, String author, String isbn, Date publishDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.isAvailable = true;
        this.borrowerHistory = new ArrayList<>();
    }
    
    public void checkOut(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            borrowerHistory.add(borrowerName + " (" + new Date() + ")");
            System.out.println(title + " has been checked out by " + borrowerName);
        } else {
            System.out.println(title + " is not available.");
        }
    }
    
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
    
    public void displayDetails() {
        System.out.println("\n=== Book Details ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Published: " + publishDate);
        System.out.println("Status: " + (isAvailable ? "Available" : "Checked Out"));
    }
    
    public void showBorrowerHistory() {
        System.out.println("\nBorrower History for " + title + ":");
        if (borrowerHistory.isEmpty()) {
            System.out.println("No borrowing history available.");
        } else {
            for (String record : borrowerHistory) {
                System.out.println("- " + record);
            }
        }
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
}

class Textbook extends Book {
    private String subject;
    private int edition;
    private boolean hasSolutionsManual;
    private boolean isReserved;
    
    public Textbook(String title, String author, String isbn, Date publishDate,
                   String subject, int edition, boolean hasSolutionsManual) {
        super(title, author, isbn, publishDate);
        this.subject = subject;
        this.edition = edition;
        this.hasSolutionsManual = hasSolutionsManual;
        this.isReserved = false;
    }
    
    public void requestSolutionsManual() {
        if (hasSolutionsManual) {
            System.out.println("Solutions manual for " + title + " is available.");
        } else {
            System.out.println("No solutions manual available for this textbook.");
        }
    }
    
    public void reserveForClass(String className) {
        isReserved = true;
        System.out.println(title + " reserved for " + className);
    }
    
    @Override
    public void checkOut(String borrowerName) {
        if (isReserved) {
            System.out.println(title + " is reserved and cannot be checked out.");
            return;
        }
        super.checkOut(borrowerName);
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Textbook");
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
        System.out.println("Solutions Manual: " + (hasSolutionsManual ? "Yes" : "No"));
        System.out.println("Reserved: " + (isReserved ? "Yes" : "No"));
    }
    
    public void updateEdition(int newEdition) {
        this.edition = newEdition;
        System.out.println(title + " updated to edition " + newEdition);
    }
}

public class BookLibrary {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date pubDate = sdf.parse("2020-01-15");
        Textbook calculus = new Textbook("Calculus: Early Transcendentals", 
                                       "James Stewart", 
                                       "978-1305270339", 
                                       pubDate,
                                       "Mathematics", 
                                       8, 
                                       true);

        calculus.displayDetails();
        calculus.checkOut("John Smith");
        calculus.checkOut("Alice Johnson"); 
        calculus.returnBook();
        calculus.requestSolutionsManual();
        calculus.updateEdition(9);
        calculus.reserveForClass("Math 101");
        calculus.checkOut("Bob Brown"); 
        calculus.showBorrowerHistory();

        Date novelDate = sdf.parse("2019-05-21");
        Book novel = new Book("The Testaments", "Margaret Atwood", "978-0385543781", novelDate);
        
        novel.displayDetails();
        novel.checkOut("Emma Wilson");
        novel.checkOut("David Lee"); 
        novel.returnBook();
        novel.checkOut("David Lee"); 
        novel.showBorrowerHistory();
    }
}