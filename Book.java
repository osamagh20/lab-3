import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int stock;
    private List<Review> reviews;


    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }


    public void addReview(Review r) {
        reviews.add(r);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0.0;
        }

        int totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }

        return (double) totalRating / reviews.size();
    }

    public void purchase(User user) {
        if (stock > 0) {
            user.addToPurchasedList(this);
            stock--;
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Book restocked by " + quantity + ". current stock: " + stock);
    }

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Stock: " + stock;
    }
}