package wfarmory;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

public final class Warframes {

    public static final Set<Warframe> warframes;

    private static final String weaponNames = "Ash\n" +
            "Ash Prime\n" +
            "Atlas\n" +
            "Banshee\n" +
            "Banshee Prime\n" +
            "Chroma\n" +
            "Chroma Prime\n" +
            "Ember\n" +
            "Ember Prime\n" +
            "Equinox\n" +
            "Excalibur\n" +
            "Excalibur Prime\n" +
            "Excalibur Umbra\n" +
            "Excalibur Umbra Prime\n" +
            "Frost\n" +
            "Frost Prime\n" +
            "Gara\n" +
            "Harrow\n" +
            "Hydroid\n" +
            "Hydroid Prime\n" +
            "Inaros\n" +
            "Ivara\n" +
            "Khora\n" +
            "Limbo\n" +
            "Limbo Prime\n" +
            "Loki\n" +
            "Loki Prime\n" +
            "Mag\n" +
            "Mag Prime\n" +
            "Mesa\n" +
            "Mirage\n" +
            "Mirage Prime\n" +
            "Nekros\n" +
            "Nekros Prime\n" +
            "Nezha\n" +
            "Nidus\n" +
            "Nova\n" +
            "Nova Prime\n" +
            "Nyx\n" +
            "Nyx Prime\n" +
            "Oberon\n" +
            "Oberon Prime\n" +
            "Octavia\n" +
            "Revenant\n" +
            "Rhino\n" +
            "Rhino Prime\n" +
            "Saryn\n" +
            "Saryn Prime\n" +
            "Titania\n" +
            "Trinity\n" +
            "Trinity Prime\n" +
            "Valkyr\n" +
            "Valkyr Prime\n" +
            "Vauban\n" +
            "Vauban Prime\n" +
            "Volt\n" +
            "Volt Prime\n" +
            "Wukong\n" +
            "Zephyr\n" +
            "Zephyr Prime\n";

    static {

        Set<Warframe> warframeSet = new HashSet<>();

        for (String name : Splitter.on('\n').split(weaponNames)) {
            if (name.trim().length() > 0) {
                boolean prime = name.contains("Prime");
                warframeSet.add(new Warframe(name, prime, null));
            }
        }


        warframes = ImmutableSet.copyOf(warframeSet);
    }

    public static void main(String[] args) {

        System.out.println(warframes.size());
        warframes.stream().sorted((w1, w2) -> w1.name().compareTo(w2.name)).forEach(System.out::println);

    }
}
