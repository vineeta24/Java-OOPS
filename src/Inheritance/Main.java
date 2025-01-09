package Inheritance;

public class Main {
    public static void main(String[] args) {
        FavouriteHobby hobby1 = new FavouriteHobby();
        FavouriteHobby hobby2 = new FavouriteHobby("Vineeta", "Swimming");

        hobby1.displayName();
        hobby1.displayHobby();

        hobby2.displayName();
        hobby2.displayHobby();
    }
}
