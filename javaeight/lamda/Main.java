package javaeight.lamda;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Lamdas can be used as reference of anonymously implemented function;
        //functional interface is interface having SAM single abstract Method

        // predicate and biPredicate
        Predicate<Integer> predicate = x->x%5==0;
        System.out.println(predicate.test(100));
        BiPredicate<Integer,Integer> biPredicate = (x,y)->(x+y)%2==0;
        System.out.println(biPredicate.test(6,4));

        //consumer and biConsumer
        Consumer<String> consumer = (s)-> System.out.println("Hi i am " + s);
        consumer.accept("Krishna");
        BiConsumer<String,String> biConsumer = (x,y)-> System.out.println(x+" "+y);
        biConsumer.accept("krishna","Kumar");

        //supplier
        Supplier<Boolean> supplier = ()-> false;
        System.out.println(supplier.get());


        //function and biFunction
        Function<Integer,String> function = (i)->"The age of person is " + i;
        System.out.println(function.apply(2));
        BiFunction<Integer,Integer,String > biFunction = (x,y)->"The sum of two number is " +(x+y);
        System.out.println(biFunction.apply(2,3));
    }
}
