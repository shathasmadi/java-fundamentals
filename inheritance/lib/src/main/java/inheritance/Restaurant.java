package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double priceCategories;
    private double stars;
    private ArrayList<Review> Rev;
    private double summation=0;

    public Restaurant(String name, double priceCategories){
        this.name=name;
        this.priceCategories = priceCategories;
        this.Rev=new ArrayList<Review>();
    }

    public void addReview(String author ,String body,  double stars) {
        Review reviews = new Review(author ,body, stars);
        this.Rev.add(reviews);
       this.summation = this.summation+reviews.getStars();
       this.stars=this.summation/this.Rev.size();


    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPriceCategory() {
        return priceCategories;
    }

    public void setPriceCategory(double priceCategory) {

        this.priceCategories = priceCategory;
    }

    public double getStars() {

        return stars;
    }

    public void setStars(double stars) {

        this.stars = stars;
    }

    public ArrayList<Review> getRev()
    {
        return Rev;
    }

    public void setRev(ArrayList<Review> Rev) {

        this.Rev = Rev;
    }

    @Override
    public String toString() {
        return "Restaurant" +" "+
                "name='" + name + '\'' +
                ", priceCategories=" + priceCategories +
                ", stars=" + stars +
                ", Rev=" + Rev
                ;
    }
}
