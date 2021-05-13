package tc.pokedex;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import io.reactivex.rxjava3.core.Observable;

public class Pokedex {
    public static Observable<Pokemon> getData() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("pokedex.json"));

        Pokemon[] data = gson.fromJson(reader, Pokemon[].class);
        return Observable.fromArray(data);

        
    }
}
