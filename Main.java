import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("java", "john", "1212", 20.0, 10);
        Book book2 = new Book("php", "mangus", "3434", 15.0, 5);
        Movie movie1 = new Movie("crime", "mark", "5566", 25.0, 120);
        Music music1 = new Music("the life", "mohammed", "0101", 10.0);


        List<Media> availableMediaList = new ArrayList<>();
        availableMediaList.add(book1);
        availableMediaList.add(book2);
        availableMediaList.add(movie1);
        availableMediaList.add(music1);


        User user1 = new User("osama", "osama00@gmail.com");

        user1.addToCart(book1);
        System.out.println(user1.getShoppingCart());
        user1.addToCart(movie1);
        System.out.println(user1.getShoppingCart());
        System.out.println(book1.getMediaType());

        user1.removeFromCart(movie1);

        user1.checkout();

        Review r1 = new Review("anas","good",5);
        ArrayList<Review>  r2 = new ArrayList<>();
        Review r3 = new Review("yasser","very good",5);

        book1.addReview(r1);
        book1.addReview(r3);
        System.out.println("Average Rating for " + book1.getTitle() + " : " + book1.getAverageRating());

        System.out.println(book1.getMediaType());
        System.out.println(movie1.getMediaType());


        System.out.println("User1 Purchased List: " + user1.getPurchasedList());
        System.out.println("User1 Shopping Cart: " + user1.getShoppingCart());
        System.out.println("Available Media List: " + availableMediaList);
        book1.restock(20);
        System.out.println(book1.toString());

    }
}