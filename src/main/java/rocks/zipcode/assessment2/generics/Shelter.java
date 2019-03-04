package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterable<T>{
    private List<T> list;

    public Shelter() {
        list = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(T object) {
        list.add(object);
    }

    public Boolean contains(T object) {
        return list.contains(object);
    }

    public void remove(T object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    public Integer getIndexOf(T ageable) {
        return list.indexOf(ageable);
    }

    @Override
    public Iterator<T> iterator() {
        return list.listIterator();
    }
}