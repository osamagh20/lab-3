public class Review {
    private String username;
    private String comment;
    private int rating;

    public Review(String username, String comment, int rating) {
        this.username = username;
        this.comment = comment;
        this.rating = rating;
    }
    public String getUsername() {
        return username;
    }
    public String getComment() {
        return comment;
    }
    public int getRating() {
        return rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
