package Revision;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by marcuspilkington on 22/05/2017.
 */
public class Revision5 {
        int i, s, o, l, ll;
        public Revision5(Object[] objects) {
            for (int j=0; j<objects.length; j++)
                count(objects[j]);
        }
        public void count(LinkedList x) { ll++; }
        public void count(List x) { l++; }
        public void count(Double x) { i++; }
        public void count(Object x) { o++; }
        public void count(String x) { s++; }
        public String toString() {
            return ll + ", " + l + ", " + i + ", "
                    + o + ", " + s;
        }
    }
     class Count {
        static Object[] objects = {new Double(10),
                new String("Q1"), new Object(), new LinkedList()};
        public static void main(String[] args) {
            System.out.println(new Revision5(objects) );
            for (Object o : objects)
                System.out.println(o);
        }
}
