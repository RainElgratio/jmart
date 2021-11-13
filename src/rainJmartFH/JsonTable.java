package rainJmartFH;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Vector;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

public class JsonTable<T>{
    public final String filepath;
    private static Gson gson;

    public JsonTable(Class<T> clazz, String filepath) {

        this.filepath = filepath;
        Gson gson = new Gson();

    }

    public static <T> T readJson(Class<T> clazz, String filepath) throws FileNotFoundException{
        final JsonReader jsonread = new JsonReader(new FileReader(filepath));
        return gson.fromJson(jsonread, clazz);
    }

    public void writeJson() throws IOException{
        writeJson(this, this.filepath);
    }

    public static void writeJson(Object object, String filepath) throws IOException{
        final FileWriter writer = new FileWriter(filepath);
        writer.write(gson.toJson(object));
        writer.close();
    }


}
