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
        mapCounter = new HashMap<>();
        mapCounter.put(getClass(), id);
        this.id = id;
    }


    public static <T> int getClosingId(Class<T> clazz){
        if(clazz.isAssignableFrom(Serializable.class)){
            return 0;
        }else{
            return 1;
        }
    }
    public static <T> int setClosingId(Class<T> clazz, int id) {
        if(clazz.isAssignableFrom(Serializable.class)){
            return 0;
        }else{
            return 1;
        }
    }


    public boolean equals(Object other){
        if(!(other instanceof Serializable)){
            Serializable checked = (Serializable)other;
            return checked.id == this.id;
        }
        return false;
    }
    public boolean equals(Serializable other){
        return this.id == other.id;
    }


    public int compareTo(Serializable id){
        return 0;
    }


    
}
