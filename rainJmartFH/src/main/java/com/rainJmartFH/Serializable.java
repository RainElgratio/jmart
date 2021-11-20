package rainJmartFH;


import java.util.HashMap;

/**
 * Write a description of class Serializable here.
 *
 * @author rain
 * @version (a version number or a date)
 */
abstract class Serializable
{
    // instance variables - replace the example below with your own
    public final int id;
    private static HashMap<Class<?>, Integer> mapCounter;

    //constructor
    protected Serializable(int id){
        Integer counter = mapCounter.get(getClass());
        counter = counter == null ? 0 : counter + 1;
        mapCounter.put(getClass(), counter);
        this.id = counter;

    }


    public static <T> int getClosingId(Class<T> clazz){
        return mapCounter.get(clazz);
    }
    public static <T> int setClosingId(Class<T> clazz, int id) {
        return mapCounter.put(clazz, id);
    }


    public boolean equals(Object other){
        return other instanceof Serializable && ((Serializable) other).id == id;
    }
    public boolean equals(Serializable other){
        return other.id == id;
    }


    public int compareTo(Serializable id){
        return Integer.compare(this.id, other.id);
    }


    
}
