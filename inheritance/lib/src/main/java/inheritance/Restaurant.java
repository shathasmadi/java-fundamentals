package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double priceCategorys;
    private double stars;
    private ArrayList<Review> Rev;
    private double summation=0;

    public Restaurant(String name, double priceCategorys ){
        this.name=name;
        this.priceCategorys=priceCategorys;
        this.Rev=new ArrayList<Review>();
    }

    public void addReview(String author ,  double stars) {
        Review reviews = new Review(author , stars);
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
        return priceCategorys;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategorys = priceCategory;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getRev() {
        return Rev;
    }

    public void setRev(ArrayList<Review> Rev) {
       this.Rev = Rev;
    }

    @Override
    public String toString() {
        return "Restaurant" +" "+
                "name='" + name + '\'' +
                ", priceCategorys=" + priceCategorys +
                ", stars=" + stars +
                ", Rev=" + Rev
                ;
    }
}
