package tc.pokedex;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    Long id;
    String num;
    String name;
    String img;
    Set<String> type = new HashSet<>();

    String height;
    String weight;
    String candy;
    Integer candy_count;
    String egg;
    Float spawn_chance;
    Float avg_spawns;
    String spawn_time;
    Set<Float> multipliers = new HashSet<>();
    Set<String> weaknesses = new HashSet<>();
    Set<Evolution> prev_evolution = new HashSet<>();
    Set<Evolution> next_evolution = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Set<String> getType() {
        return type;
    }

    public void setType(Set<String> type) {
        this.type = type;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCandy() {
        return candy;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public Integer getCandy_count() {
        return candy_count;
    }

    public void setCandy_count(Integer candy_count) {
        this.candy_count = candy_count;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public Float getSpawn_chance() {
        return spawn_chance;
    }

    public void setSpawn_chance(Float spawn_chance) {
        this.spawn_chance = spawn_chance;
    }

    public Float getAvg_spawns() {
        return avg_spawns;
    }

    public void setAvg_spawns(Float avg_spawns) {
        this.avg_spawns = avg_spawns;
    }

    public String getSpawn_time() {
        return spawn_time;
    }

    public void setSpawn_time(String spawn_time) {
        this.spawn_time = spawn_time;
    }

    public Set<Float> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(Set<Float> multipliers) {
        this.multipliers = multipliers;
    }

    public Set<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(Set<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public Set<Evolution> getPrev_evolution() {
        return prev_evolution;
    }

    public void setPrev_evolution(Set<Evolution> prev_evolution) {
        this.prev_evolution = prev_evolution;
    }

    public Set<Evolution> getNext_evolution() {
        return next_evolution;
    }

    public void setNext_evolution(Set<Evolution> next_evolution) {
        this.next_evolution = next_evolution;
    }

    @Override
    public String toString() {
        return "[avg_spawns=" + avg_spawns + ", candy=" + candy + ", candy_count=" + candy_count + ", egg="
                + egg + ", height=" + height + ", id=" + id + ", img=" + img + ", multipliers=" + multipliers
                + ", name=" + name + ", next_evolution=" + next_evolution + ", num=" + num + ", prev_evolution="
                + prev_evolution + ", spawn_chance=" + spawn_chance + ", spawn_time=" + spawn_time + ", type=" + type
                + ", weaknesses=" + weaknesses + ", weight=" + weight + "]";
    }

}
