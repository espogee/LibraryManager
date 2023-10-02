public class ScienceFictionBook extends Book{
    public String subject; // "technology", "time travel", "super power"

    public ScienceFictionBook(String title, String author, int yearPublished, String subject){
        super(title, author, yearPublished);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }
    public void print(){
        super.print();
        System.out.println("Subject: "+ getSubject());
    }
}
