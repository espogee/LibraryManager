public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook, eBook {
    public String size;
    public int numberOfTracks;

    public ScienceFictioneAudioBook(String title, String author, int yearPublished, String subject, int numOfTracks, String size){
        super(title, author, yearPublished, subject);
        this.numberOfTracks = numOfTracks;
        this.size = size;
    }

    public int getNumberOfTracks(){
        return numberOfTracks;
    }
    public String getSize(){
        return size;
    }

    public void print(){
        super.print();
        System.out.println("Number of Tracks: "+ getNumberOfTracks() + "\n" + "Size: " + getSize());
    }

}
