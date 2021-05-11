


// Problema 1 (20%). Implemente la siguiente función
function buscarPorTipo(pokemones, tipo) { 
    // Retorna una lista con los nombres 
    // de todos los pokemones que tengan el tipo 
    // indicado por parámetros (revisar atributo `type`)
   let names = pokemones.filter(pokemon=>pokemon.type.reduce((a,b)=>a + b).match(tipo)).map(pokemon => pokemon.name);
   return names;

}


console.log(buscarPorTipo(pokemones, "Ice")); // Debe retornar ["Dewgong", "Cloyster", "Jynx",  ...]














 //Problema 2 (30%). Implemente la siguiente función
function buscarEvoluciones(pokemones, nombre) { 
    // retorna la lista con los nombres de todas
    // las evoluciones del pokemon, cuyo nombre
    // se pasa como parámetro
    evolutions = [];
    let names = pokemones.find(pokemon => pokemon.name == nombre);
    if(names.hasOwnProperty('prev_evolution')){
        evolutions.push(names.prev_evolution.map(no => no.name));
    }
    if(names.hasOwnProperty('next_evolution')){
        evolutions.push(names.next_evolution.map(no => no.name));
    }
    return evolutions;

}


console.log(buscarEvoluciones(pokemones, "Ivysaur")); // Debe retornar ["Bulbasaur", "Venusaur"]
console.log(buscarEvoluciones(pokemones, "Charmander")); // Debe retornar ["Charmeleon", "Charizard"]

