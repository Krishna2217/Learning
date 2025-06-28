package desingpattern.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        CarBuilder builder1 = new CarBuilder();
       Car c1 = builder.name("honda").color("black").isElectric(false).hasSunRoof(true).door(2).build();
       Car c2 = builder1.name("maruti").color("white").isElectric(false).build();
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
