package rainJmartFH;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

class Jmart
{
    class Country
    {
        public String name;
        public int population;
        public List<String> listOfStates;
    }


    public static List<Product> filterByCategory(List<Product> list, ProductCategory category){
        return null;
    }
    public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice){
        if(minPrice == 0.0){
            return null;
        }else if(maxPrice == 0.0){
            return null;
        }else{
            return null;
        }
    }


    public static void main(String[] args)
    {
        String filepath = "D:\\jsonFiles\\city.json";
        Gson gson = new Gson();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            Country input = gson.fromJson(br, Country.class);
            System.out.println("name: " + input.name);
            System.out.println("population: " + input.population);
            System.out.println("states:");
            input.listOfStates.forEach(state -> System.out.println(state));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static List<Product> read(String filepath){
        try{
            JsonReader jsonReader = new JsonReader(new FileReader(filepath));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
 }
