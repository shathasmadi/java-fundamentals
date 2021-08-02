package inheritance;

public class Review {
    private String author;
    private String body;
    private double stars;
    private String movieName;

    public Review( String author , String body, double stars){
        this.author=author;
        setStars(stars);
        this.body=body;

    }

    public Review( String author , String body, double stars,String movieName){
        this.author=author;
        setStars(stars);
        this.body=body;
        this.movieName=movieName;

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getBody() {

        return body;
    }

    public void setBody(String body) {

        this.body = body;
    }

    public double getStars() {

        return stars;
    }

    public void setStars(double stars) {
        if (stars > 5) {
           this.stars=5;
        } else if (stars < 0) {
            this.stars= 0;
        } else {
            this.stars= stars;
        }

    }

    @Override
    public String toString() {
        return "Review" +" "+
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + stars +
                " ";
    }
}
