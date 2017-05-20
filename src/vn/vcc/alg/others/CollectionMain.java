package vn.vcc.alg.others;

import java.util.*;

/**
 * Created by phuongdv on 5/19/17.
 */
public class CollectionMain {



    public static void main(String[] args){

//        testMethod3();

//        HashMap makes absolutely no guarantees about the iteration order. It can (and will) even change completely when new elements are added.
        Map m1 = new HashMap();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hyden");
        m1.put("schildt", "java2s");
        System.out.println(m1.keySet());
        System.out.println(m1.values());



//        TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator).
//                Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.
        System.out.println("-------------------");
        SortedMap sm = new TreeMap();
        sm.put("map", "TreeMap");
        sm.put("schildt", "java2");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "java2s");
        System.out.println(sm.keySet());
        System.out.println(sm.values());


//        LinkedHashMap will iterate in the order in which the entries were put into the map
        System.out.println("LinkedHashMap will iterate in the order in which the entries were put into the map");

        LinkedHashMap lm = new LinkedHashMap();
        lm.put("map", "LinkedHashMap");
        lm.put("schildt", "java2");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2s");
        System.out.println(lm.keySet());
        System.out.println(lm.values());

    }


    public static void testMethod3(){

        System.out.println("Test HashSet");
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("d");
        set.add("c");
        set.forEach(obj->{
            System.out.println(obj);
        });

        // view method 2
        System.out.println("-----");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }

    public static void testMethod2(){
        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("c","c");

        // looping through the map set
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry);
        }

        // method 2

        Iterator<Map.Entry<String,String>> it =  map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> pair = it.next();
            System.out.println(pair.getKey()+"="+ pair.getValue());

        }
    }


    public static void testMethod1(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(4,"ABC"));
        books.add(new Book(2,"DEF"));
        books.add(new Book(3,"CDF"));
        books.add(new Book(1,"MHD"));

        // sort by name

        System.out.println("Sorting by name");
        Collections.sort(books,new SortByName());

        books.forEach(s ->{
            System.out.println(s);
        });

        System.out.println("Sorting by id");
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getId() - o2.getId();
            }
        });

        books.forEach(s ->{
            System.out.println(s);
        });

        System.out.println("Sorting by name");
        Collections.sort(books);

        books.forEach(s ->{
            System.out.println(s);
        });

    }
}

class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2){
        return o1.getName().compareTo(o2.getName());
    }

}