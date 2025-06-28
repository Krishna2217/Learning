package desingpattern.builder;

public class CarBuilder {
    String name;
    int door;
    boolean hasSunRoof;
    boolean isElectric;
    String color ;

    public CarBuilder door(int x) {
        this.door = x;
        return this;
    }
    public CarBuilder name(String name){
        this.name = name;
        return this;
    }
    public CarBuilder hasSunRoof(boolean x){
        this.hasSunRoof = x;
        return this;
    }
    public CarBuilder isElectric(boolean x){
        this.isElectric=x;
        return this;
    }
    public CarBuilder color(String c){
        this.color=c;
        return this;
    }
    public Car build(){
        return new Car(name,door,hasSunRoof,isElectric,color);
    }

}
