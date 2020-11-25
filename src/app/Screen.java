package app;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void down() {
        System.out.println(description + " going down");
    }

    public void up() {
        System.out.println(description + " going up");
    }


    public String toString() {
        return description;
    }
}
