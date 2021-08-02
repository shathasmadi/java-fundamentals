package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int numberOfDollarSigns;
    private ArrayList<Review> Reviews;
    private double summation=0;
    private double stars;

    public Shop(String name , String description , int numberOfDollarSigns) {
        this.name=name;
        this.description=description;
        this.numberOfDollarSigns=numberOfDollarSigns;
        this.Reviews=new ArrayList<Review>();
    }

    public  void shopesRev(String auther ,String body ,double stars){
       Review newRev = new Review (auther , body , stars);
      this.Reviews.add(newRev);
        this.summation = this.summation+newRev.getStars();
        this.stars=this.summation/this.Reviews.size();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfDollarSigns() {
        return String.valueOf(numberOfDollarSigns);
    }

    public void setNumberOfDollarSigns(int numberOfDollarSigns) {
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop" +""+
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stars=" + stars +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", Reviews=" + Reviews +
                " ";
    }
}
