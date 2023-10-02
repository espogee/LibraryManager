public class DramaPrintedBook extends DramaBook implements PrintedBook{
    public String dimension;
    public String weight;

    public DramaPrintedBook(String title, String author, int yearPublished, String time, String place, String dimension, String weight){
        super(title, author, yearPublished, time, place);
        this.dimension = dimension;
        this.weight = weight;
    }

    public String getDimension(){
        return dimension;
    }
    public  String getWeight(){
        return weight;
    }

    public void print(){
        super.print();
        System.out.println("Weight: "+ getWeight() + "\n" + "Dimension: " + getDimension());
    }
}
