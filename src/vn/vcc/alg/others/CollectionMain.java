package vn.vcc.alg.others;

import java.util.*;

/**
 * Created by phuongdv on 5/19/17.
 */
public class CollectionMain {



    public static void main(String[] args){

        testMethod3();


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