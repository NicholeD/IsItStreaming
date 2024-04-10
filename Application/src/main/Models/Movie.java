package main.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie {
    private String title;
    private String length;
    private int year;
    private ArrayList director;
    private ArrayList cast;
    private String streamingPlatform;

    public Movie(String title, int year, ArrayList director, ArrayList cast) {

    }

    public String getTitle(){return this.title;}
    public void setTitle(String title){this.title = title;}
    public String getLength(){return this.length;}
    public void setLength(String length){this.length = length;}
    public int getYear(){return this.year;}
    public void setYear(int year){this.year = year;}
    public ArrayList<String> getDirector(){return this.director;}
    public void setDirector(ArrayList<String> director) {this.director = director;}
    public ArrayList<String> getCast(){return this.cast;}
    public void setCast(ArrayList<String> cast){this.cast = cast;}
    public String getStreamingPlatform(){return this.streamingPlatform;}
    public void setStreamingPlatform(String streamingPlatform){this.streamingPlatform = streamingPlatform;}


}
