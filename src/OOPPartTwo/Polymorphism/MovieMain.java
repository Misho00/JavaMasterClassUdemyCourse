package OOPPartTwo.Polymorphism;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Movie theMovie = new Movie("Star Wars");
        theMovie.watchMovie();
        System.out.println("-------------");

        Movie theMovie2 = new Adventure("Star Wars");
        theMovie2.watchMovie();
        System.out.println("-------------");

        Movie theMovie3 = Movie.getMovie("Adventure", "Star Wars");
        theMovie3.watchMovie();
        System.out.println("-------------");

        Movie theMovie4 = Movie.getMovie("Science", "Star Wars");
        theMovie4.watchMovie();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit");

            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }

            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
