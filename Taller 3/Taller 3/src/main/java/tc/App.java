package tc;

import java.io.FileNotFoundException;

import io.reactivex.rxjava3.core.Observable;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        findWeakerAdversaries("Bulbasaur").subscribe(n -> System.out.println(n)); // Debe imprimir Squirtle Wartortle Blastoise Sandshrew Sandslash Diglett Dugtrio Psyduck Golduck Poliwag Poliwhirl Poliwrath Geodude Graveler Golem Slowpoke Slowbro Seel Dewgong Shellder Cloyster Onix Krabby Kingler Cubone Marowak Rhyhorn Rhydon Horsea Seadra Goldeen Seaking Staryu Starmie Magikarp Lapras Vaporeon Omanyte Omastar Kabuto Kabutops Paras Parasect Exeggcute Exeggutor Tangela
    }

    /**
     * Este método retorna un observable con los nombres de todos los pokemones
     * que son más débiles que el pokemon cuyo nombre se entrega como parámetro.
     * Se entiende que un pokemon A es más débil que un pokemon B si el listado de
     * debilidades (atributo weaknesses) de A contiene al menos un elemento que esté en 
     * el listado de tipos de B (atributo type)
     * TIPS:
     * Utilice el método {@link tc.pokedex.Pokedex#getData()} para recuperar el listado completo de pokemones
     */
    public static Observable<String> findWeakerAdversaries(String pokeName) throws FileNotFoundException {
        /*
        IMPORTANTE:
        * Solo puede escribir código dentro de este método.
        * Este método debe ser una función PURA, eso significa que
        * no debe tener ningún tipo de efecto lateral ni utilizar ciclos. 
        * Lo anterior aplica también a todos los lambdas que Ud. defina dentro de este método
        ESTÁ PROHIBIDO: 
        * Escribir código en cualquier otro lugar
        * Modificar otras clases de este proyecto
        * Utilizar librerías adicionales a lo que se entregan en este proyecto
        * Modificar valores de cualquier variable declarada en el código
            * Esto también incluye llamar métodos que modifiquen el valor del objeto al cual pertenencen
        * Utilizar ciclos
        */

        tc.pokedex.Pokedex.getData()                                             //Llama la lista del pokedex
                .filter(n -> n.getName().contains(pokeName))                     //Filtra para encontrar el pokemon que llega como parametro
                .flatMap(x -> Observable.fromIterable(x.getType())               //Convierte  la lista de type en un observable que se recorrera
                        .flatMap(g -> tc.pokedex.Pokedex.getData()               //Llega como parametro el typo y se filtra la lista del pokedex
                                .filter(k -> k.getWeaknesses().contains(g))))    //Compara cada Weaknesses del pokemon B con cada typo del tipo del pokemon A
                .subscribe(h -> System.out.println(h.getName()));                //si el typo del Pokemon A esta en el Weaknesses del pokemon B se imprime

        return null;
    }


}
