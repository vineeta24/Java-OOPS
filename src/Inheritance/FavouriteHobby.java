package Inheritance;

public class FavouriteHobby extends Student {
    String hobby;

    FavouriteHobby() {
        this.hobby = "yet to be decided";
    }
    FavouriteHobby(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    public void displayHobby() {
        System.out.println(super.name + "'s favourite hobby is " + hobby);
    }
}
