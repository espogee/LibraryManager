// Dramatic Stories
public class DramaBook extends Book{
    public String time;
    public String place;

    public DramaBook(String title, String author, int yearPublished, String time, String place){
        super(title, author, yearPublished);
        this.time = time;
        this.place = place;
    }

    public String getTime(){
        return time;
    }
    public String getPlace(){
        return place;
    }

    public void print(){
        super.print();
        System.out.println("Time: "+ getTime() +"\n"+ "Place: " + getPlace());
    }

}
