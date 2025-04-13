public class TestProgram{
    public static void main(String[] args){
        Student student = new Student("Alice");

        LibraryResource book = new Book("Effective Java");
        LibraryResource journal = new Journal("ACM Transactions");
        LibraryResource thesis = new Thesis("AI in Education");
        LibraryResource capstone = new Capstone("Library Management System");
        LibraryResource newspaper = new Newspaper("The NEU Times");
        LibraryResource audiobook = new AudioBook("Clean Code Audio");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
        student.borrowResource(capstone);
        student.borrowResource(newspaper);
        student.borrowResource(audiobook);
    }
}
