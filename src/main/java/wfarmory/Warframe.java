package wfarmory;

public class Warframe extends BuildableBase implements Equippable {

    public Warframe(String name, boolean prime, Requirements requirements) {

        super(name, prime, requirements);
    }

    @Override
    public String toString() {

        return "Warframe{" +
                "requirements=" + requirements +
                ", name='" + name + '\'' +
                ", prime=" + prime +
                '}';
    }
}
