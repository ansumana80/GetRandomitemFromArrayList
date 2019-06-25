import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String [] args)
    {

       // Random rand=new Random();
        ArrayList<String>movie=new ArrayList<>();
        movie.add("Star Wars");
        movie.add("Ben Hur");
        movie.add("Fantasia");
        movie.add("Casino Royale");
        movie.add("Harry Potter");
        movie.add("Captain America");
        movie.add("The Godfather");
        movie.add("Forrest Gump");

        String Randommovie= movie.get((int) (Math.random()* movie.size()));

        System.out.println(Randommovie);
    }
}
