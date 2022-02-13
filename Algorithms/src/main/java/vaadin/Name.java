package vaadin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Name {
    // private constructor

    private static Name name = null;

    private Name(){

    }

    public static Name getInstance(){

        // if instance is not created then create
        if(name == null){
            return new Name();
        }else{
           return name;
        }
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H");

        IntStream.range(0, names.size()).filter(s->s%2!=0).mapToObj(names::get).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(IntStream.range(0, names.size()).mapToObj(names::get));

        IntStream.range(0, names.size()).filter(f->f%3==0).mapToObj(names::get).collect(Collectors.toList()).forEach(System.out::println);


    }





}
