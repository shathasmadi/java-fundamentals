package inheritance;

public class Review {
    private String author;
    private String body;
    private double stars;

    public Review( String author ,  double stars){
        this.author=author;
        setStars(stars);

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
    public String toString(){
        return "Review" +" "+
                "author='" + author + '\'' +
                ", stars=" + stars +
                " ";
    }
}
