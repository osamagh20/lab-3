import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedList;
    private List<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        // Add items from shopping cart to purchased list and update stock
        for (Media media : shoppingCart) {
            purchasedList.add(media);

             // Assuming a method to decrease stock in the Media class
        }
        shoppingCart.clear(); // Clear the shopping cart after checkout
    }


    public void addToPurchasedList(Book book) {
        purchasedList.add(book);
    }

    public ArrayList<Media> getPurchasedList() {
        return new ArrayList<>(purchasedList);
    }
    public ArrayList<Media> getShoppingCart() {
        return new ArrayList<>(shoppingCart);
    }
}