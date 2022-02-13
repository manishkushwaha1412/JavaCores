package com.string.problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MostOccurance {

    public static void main(String[] args) {
        String value = "Being in your arms makes me feel as though I am truly in heaven showered in an endless rain of happiness for eternity, so just be with me forever";
        String value2 = "Java's primary motivation was platform independence and not internet. Platform independence means the ability to write a program on one platform and run it on any other platform without worrying about the platform specific features. If it works on one platform, it should work on all other platforms.";

        MostOccurance mostOccurance = new MostOccurance();
        mostOccurance.findMostOccurance(value2);
    }

    public void findMostOccurance(String value){

        Map<String, Integer> occur = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");
        while (stringTokenizer.hasMoreTokens()){
            String tocken = stringTokenizer.nextToken();
            if(occur.containsKey(tocken)){
                occur.put(tocken, occur.get(tocken)+1);
            }else{
                occur.put(tocken, 1);
            }
        }

        System.out.println("Going to Print Most occured word");
        List<Map.Entry<String, Integer>> str = occur.entrySet().stream().filter(a->a.getValue()==occur.entrySet().stream().mapToInt(d->d.getValue()).max().getAsInt()).collect(Collectors.toList());
        str.stream().map(a->a.getKey()).forEach(System.out::println);
    }
}
