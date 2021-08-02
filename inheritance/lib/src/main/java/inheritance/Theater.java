package inheritance;

import java.util.ArrayList;


  public class Theater {
    String name;
    private ArrayList<String> movie=new ArrayList<String>();
    private ArrayList<String> Reviews = new ArrayList<String>();
    private double summation=0;
    private double stars;

    public Theater(String name, String movie) {
        this.name = name;
        this.movie.add(movie);
    }

    // I got this point of making two constructors with different number of parameters from Humam Mkzoumi

      public  void theatersRev(String auther ,String body ,double stars){
          Review newRev = new Review (auther , body , stars);
          String movieReview = newRev+" ";
          this.Reviews.add(movieReview);
          this.summation = this.summation+newRev.getStars();
          this.stars=this.summation/this.Reviews.size();

      }

      public  void theatersRev(String auther ,String body ,double stars,String movieName){

          Review newRev = new Review (auther , body , stars , movieName);
          String movieReview = newRev+newRev.getMovieName();
          this.Reviews.add(movieReview);
          this.summation = this.summation+newRev.getStars();
          this.stars=this.summation/this.Reviews.size();

      }



    public void addMovie(String name) {
        this.movie.add(name);
    }

    public void removeMovie(String name) {
        this.movie.remove(name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public void setMovie(ArrayList<String> movie) {
          this.movie = movie;
      }

      public ArrayList<String> getMovie() {
          return movie;
      }



      @Override
    public String toString() {
        return "Theater" +" "+
                "name='" + name + '\'' +
                ", movie=" + movie +
                ", reviews=" + Reviews +
                " ";
    }
}
