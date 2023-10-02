public class Main {
    public static void main(String[] args) {
        Book book1 = new ScienceFictioneAudioBook("Lone Survivor Vol 5", "Pierce Morgan", 2012, "Time Travel", 12, "10mb");
        book1.print();

        System.out.println();

        DramaPrintedBook book2 = new DramaPrintedBook("Twilight Breaking Bad", "Stephanie Meyer", 2016, "Medieval", "Europe", "5.6 x 2.8 x 8.3 inches", "1.7 pounds");
        book2.print();
    }
}