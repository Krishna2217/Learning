package practice;

import java.util.*;
import java.util.stream.Collectors;

public class JavaEight {
    public static void main(String[] args) {
        Map<String,Integer> fruitRatings = new HashMap<>();
        fruitRatings.put("Apple", 5);
        fruitRatings.put("Banana", 3);
        fruitRatings.put("Cherry", 5);
        fruitRatings.put("Date", 3);
        fruitRatings.put("Elderberry", 2);
        fruitRatings.put("Fig", 2);
        fruitRatings.put("Grape", 2);
        fruitRatings.put("Mango", 4);
        fruitRatings.put("Litchi", 4);
        fruitRatings.put("Orange", 4);
//        fruitRatings.values().stream().collect(Collectors.groupingBy())
        Map<Integer,Integer> ratingToFreq = new HashMap<>();

        for(int value : fruitRatings.values()){
            ratingToFreq.put(value,ratingToFreq.getOrDefault(value,0)+1);
        }
        System.out.println(ratingToFreq);

        int secondMaximum = -1;
        int firstMaximum = -1;
        for(int value : ratingToFreq.values()){
            if(value > secondMaximum && value > firstMaximum){
                secondMaximum = firstMaximum;
                firstMaximum = value;
            }
            else if(value > secondMaximum && value < firstMaximum){
                secondMaximum = value;
            }
        }
        System.out.println(secondMaximum);
        List<Integer> keys = new ArrayList<>();
        for(var entrySet : ratingToFreq.entrySet() ){
            if(entrySet.getValue() == secondMaximum){
                keys.add(entrySet.getKey());
            }
        }
        System.out.println(keys);
        for(var entry : fruitRatings.entrySet()){
            if(keys.contains(entry.getValue())){
                System.out.println(entry.getKey());
            }
        }
    }
}
