package wfarmory;

public class Weapon extends BuildableBase implements Equippable {

    public static enum Type {
        PRIMARY,
        SECONDARY,
        MELEE,
        ARCHWING,
        SENTINEL
    }

    private final Type type;

    public Weapon(String name, Type type, boolean prime, Requirements requirements) {

        super(name, prime, requirements);
        this.type = type;
    }
}
