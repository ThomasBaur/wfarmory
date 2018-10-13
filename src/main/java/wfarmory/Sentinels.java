package wfarmory;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

public final class Sentinels {

    public static final Set<Weapon> weapons;

    private static final String weaponNames = "Artax\n" +
            "Burst Laser\n" +
            "Deconstructor\n" +
            "Deconstructor Prime\n" +
            "Deth Machine Rifle\n" +
            "Laser Rifle\n" +
            "Prime Laser Rifle\n" +
            "Prisma Burst Laser\n" +
            "Stinger\n" +
            "Sweeper\n" +
            "Sweeper Prime\n" +
            "Vulklok\n";

    static {

        Set<Weapon> weaponSet = new HashSet<>();

        for (String name : Splitter.on('\n').split(weaponNames)) {
            if (name.trim().length() > 0) {

                boolean prime = name.contains("Prime");
                weaponSet.add(new Weapon(name, Weapon.Type.SENTINEL, prime, null));
            }
        }


        weapons = ImmutableSet.copyOf(weaponSet);
    }

    public static void main(String[] args) {

        System.out.println(weapons.size());
        weapons.stream().sorted((w1, w2) -> w1.name().compareTo(w2.name)).forEach(System.out::println);

    }
}
