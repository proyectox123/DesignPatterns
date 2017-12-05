package creationalpatterns.prototypepattern.example2.concreteprototype;

import org.jetbrains.annotations.NotNull;
import creationalpatterns.prototypepattern.example2.prototype.Animal;

public class Sheep implements Animal {
    public Sheep(){
        System.out.println("Sheep is made");
    }

    @NotNull
    public Sheep makeCopy() {
        System.out.println("Sheep is being made");
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("CloneNotSupportedException");
            return new Sheep();
        }
    }

    public String toString(){
        return "Dolly is my Hero, Baaaaa";
    }
}