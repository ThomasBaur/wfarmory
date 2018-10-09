package wfarmory;

public class Weapon extends ResourceBase implements Equippable {

    public static enum Type {
        PRIMARY,
        SECONDARY,
        MELEE,
        ARCHWING,
        SENTINEL
    }

    private final Type type;

    public Weapon(String name, Type type, boolean prime) {

        super(name, prime);
        this.type = type;
    }
}
