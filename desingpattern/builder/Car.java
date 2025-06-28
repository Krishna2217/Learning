package desingpattern.builder;

public class Car {
    String name;
    int door;
    boolean hasSunRoof;
    boolean isElectric;
    String color ;

    public Car() {
    }

    public Car(String name, int door, boolean hasSunRoof, boolean isElectric, String color) {
        this.name = name;
        this.door = door;
        this.hasSunRoof = hasSunRoof;
        this.isElectric = isElectric;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", door=" + door +
                ", hasSunRoof=" + hasSunRoof +
                ", isElectric=" + isElectric +
                ", color='" + color + '\'' +
                '}';
    }
}
