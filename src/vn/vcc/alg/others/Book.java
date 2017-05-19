package vn.vcc.alg.others;

/**
 * Created by phuongdv on 5/19/17.
 */
public class Book implements Comparable<Book> {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }
}
