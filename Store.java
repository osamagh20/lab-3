import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> medias;

    public Store() {

        this.users = new ArrayList<>();
        this.medias = new ArrayList<>();
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public void addMedia(Media media){
        this.medias.add(media);
    }
    public ArrayList<User> displayUsers(){
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
        return users;
    }
    public ArrayList<Media> displayMedia(){
        for (int i = 0; i < medias.size(); i++) {
            System.out.println(medias.get(i));
        }
        return medias;
    }
    public Book searchBook(String title){

        for (int i = 0; i < medias.size(); i++) {
            if(medias.get(i).getTitle().equals(title)){
                return (Book) medias.get(i);
            }
        }
        return null;
    }

}
