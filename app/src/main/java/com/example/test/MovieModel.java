package com.example.test;

import java.util.ArrayList;

public class MovieModel {
    private static ArrayList<Movie> movies = new ArrayList<Movie>();

    {
        movies.add(new Movie("Titanic", "Drama", "19.12.1997", "https://www.imdb.com/title/tt0120338/", "Best.Movie.Ever"));
        movies.add(new Movie("Joker", "Thriller", "04.10.2019", "https://www.imdb.com/title/tt7286456/?ref_=nv_sr_srsg_0", "Good"));
    }
}
