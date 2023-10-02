// All kinds of book
public class Book {
    public String title, author;
    public int yearOfPublication;

    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearPublished;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void print(){
        System.out.println("Title: " + getTitle()+ "\n" + "Author: "+ getAuthor()+ "\n" + "Year of Publication: "+ getYearOfPublication());
    }

}
