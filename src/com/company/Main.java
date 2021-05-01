package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*Map<String,Integer> ageOfFriends = Map.of("Serban",25,"Vlad",30,"Andrei",20);



        for(Map.Entry<String,Integer> entry: ageOfFriends.entrySet()){
            String friend = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(friend + " is " + age + " years old ");
        }*/

        List<String> stringList = Arrays.asList("P", "O", "P", "E", "S", "C", "U");

        String result = stringList.stream().collect(Collectors.joining());
        System.out.println(result);
        /////last modify

        Map<String, Double> weightOfFriends = Map.of("Vlad", 55.4, "Serban", 84.2);

        for (Map.Entry<String, Double> entry: weightOfFriends.entrySet()) {
            String friend = entry.getKey();
            Double greutate = entry.getValue();
            System.out.println(friend + " are " + greutate + "kg" );
        }
    }
}
