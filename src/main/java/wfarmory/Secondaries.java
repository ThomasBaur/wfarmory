package wfarmory;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

public final class Secondaries {

    public static final Set<Weapon> weapons;

    private static final String weaponNames = "Acrid\n" +
            "Afuris\n" +
            "Akbolto\n" +
            "Akbolto Prime\n" +
            "Akbronco\n" +
            "Akbronco Prime\n" +
            "Akjagara\n" +
            "Aklato\n" +
            "Aklex\n" +
            "Aklex Prime\n" +
            "Akmagnus\n" +
            "Aksomati\n" +
            "Akstiletto\n" +
            "Akstiletto Prime\n" +
            "Akvasto\n" +
            "Akzani\n" +
            "Angstrum\n" +
            "Arca Scisco\n" +
            "Atomos\n" +
            "Azima\n" +
            "Ballistica\n" +
            "Ballistica Prime\n" +
            "Bolto\n" +
            "Brakk\n" +
            "Bronco\n" +
            "Bronco Prime\n" +
            "Castanas\n" +
            "Cestra\n" +
            "Cycron\n" +
            "Despair\n" +
            "Detron\n" +
            "Dex Furis\n" +
            "Dex Pixia\n" +
            "Dual Cestra\n" +
            "Dual Toxocyst\n" +
            "Embolist\n" +
            "Euphona Prime\n" +
            "Furis\n" +
            "Fusilai\n" +
            "Gammacor\n" +
            "Hikou\n" +
            "Hikou Prime\n" +
            "Hystrix\n" +
            "Knell\n" +
            "Kohmak\n" +
            "Kraken\n" +
            "Kulstar\n" +
            "Kunai\n" +
            "Lato\n" +
            "Lato Prime\n" +
            "Lato Vandal\n" +
            "Lex\n" +
            "Lex Prime\n" +
            "MK1-Furis\n" +
            "MK1-Kunai\n" +
            "Magnus\n" +
            "Mara Detron\n" +
            "Marelok\n" +
            "Nukor\n" +
            "Pandero\n" +
            "Pox\n" +
            "Prisma Angstrum\n" +
            "Prisma Twin Gremlins\n" +
            "Pyrana\n" +
            "Pyrana Prime\n" +
            "Rakta Ballistica\n" +
            "Regulators\n" +
            "Sancti Castanas\n" +
            "Secura Dual Cestra\n" +
            "Seer\n" +
            "Sicarus\n" +
            "Sicarus Prime\n" +
            "Sonicor\n" +
            "Spectra\n" +
            "Spira\n" +
            "Spira Prime\n" +
            "Staticor\n" +
            "Stubba\n" +
            "Stug\n" +
            "Synoid Gammacor\n" +
            "Talons\n" +
            "Telos Akbolto\n" +
            "Twin Grakatas\n" +
            "Twin Gremlins\n" +
            "Twin Kohmak\n" +
            "Twin Rogga\n" +
            "Twin Vipers\n" +
            "Twin Vipers Wraith\n" +
            "Tysis\n" +
            "Vasto\n" +
            "Vasto Prime\n" +
            "Vaykor Marelok\n" +
            "Viper\n" +
            "Viper Wraith\n" +
            "Zakti\n" +
            "Zylok\n";

    static {

        Set<Weapon> weaponSet = new HashSet<>();

        for (String name : Splitter.on('\n').split(weaponNames)) {
            if (name.trim().length() > 0) {

                boolean prime = name.contains("Prime");
                weaponSet.add(new Weapon(name, Weapon.Type.SECONDARY, prime, null));
            }
        }


        weapons = ImmutableSet.copyOf(weaponSet);
    }

    public static void main(String[] args) {

        System.out.println(weapons.size());
        weapons.stream().sorted((w1, w2) -> w1.name().compareTo(w2.name)).forEach(System.out::println);

    }
}
