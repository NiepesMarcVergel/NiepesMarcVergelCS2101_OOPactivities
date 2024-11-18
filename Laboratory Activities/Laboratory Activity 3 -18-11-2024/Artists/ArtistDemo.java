public class ArtistDemo {
    public static void main(String[] args) {
        //Artist instance
        Artist artist = new Artist("Sabrina Carpenter", 25, "Music");
        System.out.println("Artist Name: " + artist.getName());
        System.out.println("Age: " + artist.getAge());
        System.out.println("Specialty: " + artist.getSpecialty());
        System.out.println();

        // Singer instance
        Singer singer = new Singer("Sabrina Carpenter", 25, Singer.Genre.POP);
        System.out.println(singer.getDetails());
        System.out.println();

        // Painter instance
        Painter painter = new Painter("Martha ", 45, Painter.Medium.WATERCOLOR);
        System.out.println(painter.getDetails());
        System.out.println();

        // Writer instance
        Writer writer = new Writer("Sing Shong", 35, Writer.WritingStyle.FICTION);
        System.out.println(writer.getDetails());
        System.out.println();

        // Dancer instance
        Dancer dancer = new Dancer("Anna Pavlova", 49, Dancer.DanceStyle.BALLET);
        System.out.println(dancer.getDetails());
    }
}
