package com.javarush.task.task14.task1414;

/*
MovieFactory
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        Movie movie = MovieFactory.getMovie(film);
        while (movie != null) {
            System.out.println(movie.getClass().getSimpleName());
            film = scanner.nextLine();
            movie = MovieFactory.getMovie(film);
        }


    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}

