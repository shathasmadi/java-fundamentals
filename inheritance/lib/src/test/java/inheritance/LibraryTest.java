/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
   @Test void testRestaurant(){
       Restaurant testRes = new Restaurant("Mac",7);
        assertEquals("Mac",testRes.getName());
        assertEquals(7,testRes.getPriceCategory());

        assertEquals("Restaurant name='Mac', priceCategorys=7.0, stars=0.0, Rev=[]",testRes.toString());
   }

   @Test void testReview(){
       Review testRev = new Review("shatha",5);
       assertEquals("shatha",testRev.getAuthor());
       assertEquals(5,testRev.getStars());

       assertEquals("Review" +" "+
               "author='" + testRev.getAuthor() + '\'' +
               ", stars=" + testRev.getStars() +
               " ",testRev.toString());
   }
   @Test void testAddReview(){
       Restaurant restaurant = new Restaurant("shatha",4);
       restaurant.addReview("shatha",5);
       assertEquals( "Restaurant" +" "+
               "name='" + restaurant.getName() + '\'' +
               ", priceCategorys=" + restaurant.getPriceCategory() +
               ", stars=" + restaurant.getStars() +
               ", Rev=" +restaurant.getRev(),restaurant.toString());
   }

}
