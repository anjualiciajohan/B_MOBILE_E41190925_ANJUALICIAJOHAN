package com.example.jsonmoviedb;

import java.io.Serializable;

public class ModelMovie implements Serializable {
    private int Id;
    private String Title;
    private double VoteAverage;
    private String Overview;
    private String RealeseDate;
    private String PosterPath;
    private String BackdropPath;
    private String Popularity;

    public ModelMovie(){
    }

    public int getId(){
        return Id;
    }
    public void setId(int id){
        Id = id;
    }
    public String getTitle(){
        return Title;
    }
    public void setTitle(String title){
        Title = title;
    }
    public double getVoteAverage(){
        return VoteAverage;
    }
    public void setVoteAverage(double voteAverage){
        VoteAverage = voteAverage;
    }
    public String getOverview(){
        return Overview;
    }
    public void setOverview(String overview){
        Overview = overview;
    }
    public String getRealeseDate(){
        return RealeseDate;
    }
    public void setRealeseDate(String realeseDate){
        RealeseDate = realeseDate;
    }
    public String getPosterPath(){
        return PosterPath;
    }
    public void setPosterPath(String posterPath){
        PosterPath = posterPath;
    }
    public String getBackdropPath(){
        return BackdropPath;
    }
    public void setBackdropPath(String backdropPath){
        BackdropPath = backdropPath;
    }
    public String getPopularity(){
        return Popularity;
    }
    public void setPopularity(String popularity){
        Popularity = popularity;
    }
}
