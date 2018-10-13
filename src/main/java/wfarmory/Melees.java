package wfarmory;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

public final class Melees {

    public static final Set<Weapon> weapons;

    private static final String weaponNames = "Ack & Brunt\n" +
            "Amphis\n" +
            "Anku\n" +
            "Ankyros\n" +
            "Ankyros Prime\n" +
            "Arca Titron\n" +
            "Atterax\n" +
            "Bo\n" +
            "Bo Prime\n" +
            "Boltace\n" +
            "Broken Scepter\n" +
            "Broken War\n" +
            "Cadus\n" +
            "Cassowar\n" +
            "Caustacyst\n" +
            "Ceramic Dagger\n" +
            "Cerata\n" +
            "Cronus\n" +
            "Dakra Prime\n" +
            "Dark Dagger\n" +
            "Dark Split-Sword (Dual Swords)\n" +
            "Dark Split-Sword (Heavy Blade)\n" +
            "Dark Sword\n" +
            "Destreza\n" +
            "Destreza Prime\n" +
            "Dex Dakra\n" +
            "Diwata\n" +
            "Dragon Nikana\n" +
            "Dual Cleavers\n" +
            "Dual Ether\n" +
            "Dual Heat Swords\n" +
            "Dual Ichor\n" +
            "Dual Kamas\n" +
            "Dual Kamas Prime\n" +
            "Dual Keres\n" +
            "Dual Raza\n" +
            "Dual Skana\n" +
            "Dual Zoren\n" +
            "Endura\n" +
            "Ether Daggers\n" +
            "Ether Reaper\n" +
            "Ether Sword\n" +
            "Exalted Blade\n" +
            "Falcor\n" +
            "Fang\n" +
            "Fang Prime\n" +
            "Fragor\n" +
            "Fragor Prime\n" +
            "Furax\n" +
            "Furax Wraith\n" +
            "Galatine\n" +
            "Galatine Prime\n" +
            "Gazal Machete\n" +
            "Glaive\n" +
            "Glaive Prime\n" +
            "Gram\n" +
            "Gram Prime\n" +
            "Guandao\n" +
            "Gunsen\n" +
            "Halikar\n" +
            "Hate\n" +
            "Heat Dagger\n" +
            "Heat Sword\n" +
            "Heliocor\n" +
            "Hirudo\n" +
            "Iron Staff\n" +
            "Jat Kittag\n" +
            "Jat Kusar\n" +
            "Jaw Sword\n" +
            "Kama\n" +
            "Karyst\n" +
            "Kesheg\n" +
            "Kestrel\n" +
            "Kogake\n" +
            "Kogake Prime\n" +
            "Krohkur\n" +
            "Kronen\n" +
            "Kronen Prime\n" +
            "Lacera\n" +
            "Lecta\n" +
            "Lesion\n" +
            "MK1-Bo\n" +
            "MK1-Furax\n" +
            "Machete\n" +
            "Machete Wraith\n" +
            "Magistar\n" +
            "Mios\n" +
            "Mire\n" +
            "Nami Skyla\n" +
            "Nami Skyla Prime\n" +
            "Nami Solo\n" +
            "Nikana\n" +
            "Nikana Prime\n" +
            "Ninkondi\n" +
            "Obex\n" +
            "Ohma\n" +
            "Okina\n" +
            "Orthos\n" +
            "Orthos Prime\n" +
            "Orvius\n" +
            "Pangolin Sword\n" +
            "Paracesis\n" +
            "Plasma Sword\n" +
            "Prisma Dual Cleavers\n" +
            "Prisma Machete\n" +
            "Prisma Obex\n" +
            "Prisma Skana\n" +
            "Prova\n" +
            "Prova Vandal\n" +
            "Pupacyst\n" +
            "Rakta Dark Dagger\n" +
            "Reaper Prime\n" +
            "Redeemer\n" +
            "Ripkas\n" +
            "Sancti Magistar\n" +
            "Sarpa\n" +
            "Scindo\n" +
            "Scindo Prime\n" +
            "Scoliac\n" +
            "Secura Lecta\n" +
            "Serro\n" +
            "Shaku\n" +
            "Sheev\n" +
            "Sibear\n" +
            "Sigma & Octantis\n" +
            "Silva & Aegis\n" +
            "Silva & Aegis Prime\n" +
            "Skana\n" +
            "Skana Prime\n" +
            "Skiajati\n" +
            "Sydon\n" +
            "Synoid Heliocor\n" +
            "Tekko\n" +
            "Telos Boltace\n" +
            "Tipedo\n" +
            "Tonbo\n" +
            "Twin Basolk\n" +
            "Twin Krohkur\n" +
            "Valkyr Talons\n" +
            "Vaykor Sydon\n" +
            "Venka\n" +
            "Venka Prime\n" +
            "Volnus\n" +
            "War\n" +
            "Zenistar\n";

    static {

        Set<Weapon> weaponSet = new HashSet<>();

        for (String name : Splitter.on('\n').split(weaponNames)) {
            if (name.trim().length() > 0) {

                boolean prime = name.contains("Prime");
                weaponSet.add(new Weapon(name, Weapon.Type.MELEE, prime, null));
            }
        }


        weapons = ImmutableSet.copyOf(weaponSet);
    }

    public static void main(String[] args) {

        System.out.println(weapons.size());
        weapons.stream().sorted((w1, w2) -> w1.name().compareTo(w2.name)).forEach(System.out::println);

    }
}
