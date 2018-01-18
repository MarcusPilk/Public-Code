package Revision;

import java.util.*;

/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class Revision6 {
    public static int sum(Collection<String> c){
        int sum = 0;
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
           sum += it.next().length();
        }
        return sum;}

    public static int length(Collection<String> c){
        int sum = 0;
        for ( String i : c){
            sum += i.length();
        }
        return sum;
    }

    public static void printMap(Map<String,Integer> m){
        Iterator<Map.Entry<String,Integer>> it = m.entrySet().iterator();
        while(it.hasNext()){
            String str = it.next().getKey();
            System.out.println("name: " + str + " mark " + m.get(str));
        }
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("ten");
        al.add("six");

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Bob",10);
        hm.put("Obo",01);
        printMap(hm);
        System.out.println(sum(al));
        System.out.println(length(al));
    }
}
