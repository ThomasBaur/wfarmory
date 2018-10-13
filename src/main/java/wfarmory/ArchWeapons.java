package wfarmory;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

public final class ArchWeapons {

    public static final Set<Weapon> weapons;

    private static final String weaponNames = "Corvas\n" +
            "Cyngas\n" +
            "Dual Decurion\n" +
            "Fluctus\n" +
            "Grattler\n" +
            "Imperator\n" +
            "Imperator Vandal\n" +
            "Phaedra\n" +
            "Velocitus\n" +
            "Agkuza\n" +
            "Centaur\n" +
            "Kaszas\n" +
            "Knux\n" +
            "Onorix\n" +
            "Prisma Veritux\n" +
            "Rathbone\n" +
            "Veritux\n";

    static {

        Set<Weapon> weaponSet = new HashSet<>();

        for (String name : Splitter.on('\n').split(weaponNames)) {
            boolean prime = name.contains("Prime");
            weaponSet.add(new Weapon(name, Weapon.Type.ARCHWING, prime, null));
        }

        weapons = ImmutableSet.copyOf(weaponSet);
    }

    public static void main(String[] args) {

        System.out.println(weapons.size());
        weapons.stream().sorted((w1, w2) -> w1.name().compareTo(w2.name)).forEach(System.out::println);

    }
}
