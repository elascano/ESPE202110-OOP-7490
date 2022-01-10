package ec.edu.espe.audiovisual.view;

import com.google.gson.Gson;
import ec.edu.espe.audiovisual.model.Movie;
import ec.edu.espe.audiovisual.model.Serie;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;
/**
 *
 * @author Camila
 */
public class AudiovisualSystem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Movie movie;
        Serie serie;
        int number;
        int option;
        String name = "";
        String director = "";
        String gender = "";
        int releaseYear = 0;
        String author = "";
        int season = 0;

        System.out.println("HW12 --> Camila Teca <--");
        System.out.println("--> Menu for the Audiovisual System <--");
        System.out.println("Do you want to open the menu? --> Yes(1) / No (0)");
        number = teclado.nextInt();
        while (number == 1) {
            System.out.println("1.Add and Save Movies \n2.Add and Save Series \n3.Exit");
            option = teclado.nextInt();

            if (option == 1) {
                System.out.println("--> Enter data of the movie <-- ");
                System.out.println("Name --> ");
                name = teclado.next();
                System.out.println("Director --> ");
                director = teclado.next();
                System.out.println("Gender --> ");
                gender = teclado.next();
                System.out.println("Release Year --> ");
                releaseYear = teclado.nextInt();
                System.out.println("\n");

                movie = new Movie(name, director, gender, releaseYear);
                System.out.println("Movies: -> ");
                System.out.println("name -> " + movie.getName());
                System.out.println("director -> " + movie.getDirector());
                System.out.println("gender -> " + movie.getGender());
                System.out.println("release year -> " + movie.getReleaseYear());
                System.out.println("\n");

                Gson gson;
                gson = new Gson();
                movie = new Movie(name, director, gender, releaseYear);
                String jsonMovies = gson.toJson(movie);
                FileManager.save("data/movies.json", jsonMovies);
                
                
                System.out.println("List of my movies");
                String fileName = ("data/movies.json");
                jsonMovies = FileManager.read(fileName);
                System.out.println(" --> MOVIES \n" + "Name;Director;Gender;ReleaseYear -> " + jsonMovies);
            }

            if (option == 2) {
                System.out.println("--> Enter data of the serie <-- ");
                System.out.println("Name --> ");
                name = teclado.next();
                System.out.println("Author --> ");
                author = teclado.next();
                System.out.println("Gender --> ");
                gender = teclado.next();
                System.out.println("Release Year --> ");
                releaseYear = teclado.nextInt();
                System.out.println("Number of  Seasons --> ");
                season = teclado.nextInt();
                System.out.println("\n");

                serie = new Serie(name, author, gender, releaseYear, season);
                System.out.println("Series: -> ");
                System.out.println("name -> " + serie.getName());
                System.out.println("author -> " + serie.getAuthor());
                System.out.println("gender -> " + serie.getGender());
                System.out.println("release year -> " + serie.getReleaseYear());
                System.out.println("it have -> " + serie.getSeason() + " seasons");
                System.out.println("\n");
                
                Gson gson;
                gson = new Gson();
                serie = new Serie(name, author, gender, releaseYear, season);
                String jsonSeries = gson.toJson(serie);
                FileManager.save("data/series.json", jsonSeries);
                
                
                System.out.println("List of my series");
                String fileName = ("data/series.json");
                jsonSeries = FileManager.read(fileName);
                System.out.println(" --> SERIES \n" + "Name;Author;Gender;ReleaseYear;Seasons -> " + jsonSeries);
            }
            if (option == 3) {
                break;
            }
        }
        }
    }
        
