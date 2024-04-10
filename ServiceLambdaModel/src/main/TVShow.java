package main;

import java.util.ArrayList;
import java.util.Date;

public class TVShow extends Movie {

    public TVShow(String title, int year, ArrayList director, ArrayList cast) {
        super(title, year, director, cast);
    }

    public TVShow(String title, int year, ArrayList director, ArrayList cast,
                  int numOfSeasons, int seasonNum, Date seasonAired, ArrayList<String> seasonCast,
                  int episodeNum, String episodeName, Date episodeAired) {
        super(title, year, director, cast);
        this.numOfSeasons = numOfSeasons;
        this.seasonNum = seasonNum;
        this.seasonAired = seasonAired;
        this.seasonCast = seasonCast;
        this.episodeNum = episodeNum;
        this.episodeName = episodeName;
        this.episodeAired = episodeAired;
    }

    private int numOfSeasons;
    private int seasonNum;
    private Date seasonAired;
    private ArrayList<String> seasonCast;
    private int episodeNum;
    private String episodeName;
    private Date episodeAired;

    public int getNumOfSeasons() {return numOfSeasons;}
    public void setNumOfSeasons(int numOfSeasons) {this.numOfSeasons = numOfSeasons;}
    public int getSeasonNum() {return seasonNum;}
    public void setSeasonNum(int seasonNum) {this.seasonNum = seasonNum;}
    public Date getSeasonAired() {return seasonAired;}
    public void setSeasonAired(Date seasonAired) {this.seasonAired = seasonAired;}
    public ArrayList<String> getSeasonCast() {return seasonCast;}
    public void setSeasonCast(ArrayList<String> seasonCast) {this.seasonCast = seasonCast;}
    public int getEpisodeNum() {return episodeNum;}
    public void setEpisodeNum(int episodeNum) {this.episodeNum = episodeNum;}
    public String getEpisodeName() {return episodeName;}
    public void setEpisodeName(String episodeName) {this.episodeName = episodeName;}
    public Date getEpisodeAired() {return episodeAired;}
    public void setEpisodeAired(Date episodeAired) {this.episodeAired = episodeAired;}
}
