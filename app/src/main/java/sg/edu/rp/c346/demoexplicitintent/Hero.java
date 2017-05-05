package sg.edu.rp.c346.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 15056215 on 5/5/2017.
 */

public class Hero implements Serializable{
    private String name;
    private int strength;
    private int techicalProwess;

    public String getName(){
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechicalProwess() {
        return techicalProwess;
    }

    public Hero(String name, int strength, int techicalProwess){
        this.name = name;
        this.strength = strength;
        this.techicalProwess = techicalProwess;
    }
}
