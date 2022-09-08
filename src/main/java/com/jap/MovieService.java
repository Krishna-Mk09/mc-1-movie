package com.jap;

import java.util.*;

public class MovieService {

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map<Movie, Integer> map = movieService.getMovieWithRating();
        System.out.println(map);
        Set<String> set = movieService.getMovieNameWithRating4(map, 4);
        System.out.println("Rating 4" + set);
        //  Map<String, String> map1 = movieService.getAllMoviesWithComedy(map);
        // System.out.println("Comedy Movie " + map1);
        List<String> list = movieService.getMovieWithHighestRating(map);
        System.out.println("--------------");
        System.out.println("Highest Rating " + list);
    }

    public Map<Movie, Integer> getMovieWithRating() {
        //create five movie object by calling Movie class parameterized constructor
        Movie movie1 = new Movie(101, "A Beautiful Mind", "economic", "11/1/2001");
        Movie movie2 = new Movie(102, "Boiler Room", "Crime", "1/1/2000");
        Movie movie3 = new Movie(103, "Buy and Cell", "comedy", "13/4/1988");
        Movie movie4 = new Movie(104, "Corsair", "Crime", "11/11/1997");
        Movie movie5 = new Movie(105, "Diamond Necklace", "comedy", "10/11/2021");
        //create HashMap object and add all the Movie object inside it
        Map<Movie, Integer> movieRate = new HashMap<Movie, Integer>();
        movieRate.put(movie1, 1);
        movieRate.put(movie2, 2);
        movieRate.put(movie3, 3);
        movieRate.put(movie4, 4);
        movieRate.put(movie5, 5);
        //Key will be movie object and value will be rating ranging from 1 to 5
        //return the HashMap object
        return movieRate;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie, Integer> map, int rating) {
        //Create a TreeSet object
        TreeSet<String> set = new TreeSet<String>();
        //Use entrySet() method to iterate through the map object
        Map<Movie, Integer> newMap = new HashMap<>();
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            Movie movie = entry.getKey();
            Integer value = entry.getValue();
            //retrieve all the movies name having rating as 4
            if (value == rating) ;
            //Store the movie name in TreeSet object
            set.add(movie.getMovieName());
        }
        //return the TreeSet object

        return set;
    }

    public List<String> getMovieWithHighestRating(Map<Movie, Integer> map) {
        //Create a ArrayList object of type String
        ArrayList<String> list = new ArrayList<String>();
        //get the first value from the map and store it in the variable max
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            Movie movie = entry.getKey();
            Integer value = entry.getValue();
            // Use entrySet().iterator().next() method to retrieve the first value of Map object
            //get the name of the movie with the highest rating and add it in the List created
            list.add(movie.getMovieName());
            //return the List object
            //  return list;
        }
        return list;
    }


    public Map<String, String> getAllMoviesWithComedy(Map<Movie, Integer> map) {
        //Create a Map object
        HashMap<String, String> comedy = new HashMap<String, String>();
        //use entrySet to iterate through the Map object
        String b = "comedy";
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            Movie movie = entry.getKey();
            if (Objects.equals(movie.getGenre(), b)) {
                comedy.put(movie.getMovieName(), movie.getReleaseDate());
            }
            //get all the movies name and their released date for the movie of genre "comedy"
            //store movie name with release date in the above created Map object and return the Map object


        }
        return comedy;
    }
}
