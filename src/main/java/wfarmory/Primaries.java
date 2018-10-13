package wfarmory;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

public final class Primaries {

    public static final Set<Weapon> weapons;

    private static final String weaponNames = "Amprex\n" +
            "Arca Plasmor\n" +
            "Argonak\n" +
            "Artemis Bow\n" +
            "Astilla\n" +
            "Attica\n" +
            "Baza\n" +
            "Boar\n" +
            "Boar Prime\n" +
            "Boltor\n" +
            "Boltor Prime\n" +
            "Braton\n" +
            "Braton Prime\n" +
            "Braton Vandal\n" +
            "Burston\n" +
            "Burston Prime\n" +
            "Buzlok\n" +
            "Carmine Penta\n" +
            "Cernos (Uncharged)\n" +
            "Cernos (Charged)\n" +
            "Cernos Prime (Uncharged)\n" +
            "Cernos Prime (Charged)\n" +
            "Convectrix\n" +
            "Corinth\n" +
            "Daikyu\n" +
            "Dera\n" +
            "Dera Vandal\n" +
            "Dex Sybaris\n" +
            "Drakgoon\n" +
            "Dread (Uncharged)\n" +
            "Dread (Charged)\n" +
            "Ferrox\n" +
            "Flux Rifle\n" +
            "Glaxion\n" +
            "Gorgon\n" +
            "Gorgon Wraith\n" +
            "Grakata\n" +
            "Grinlok\n" +
            "Harpak\n" +
            "Hek\n" +
            "Hema\n" +
            "Hind\n" +
            "Ignis\n" +
            "Ignis Wraith\n" +
            "Javlok\n" +
            "Karak\n" +
            "Karak Wraith\n" +
            "Kohm\n" +
            "Lanka\n" +
            "Latron\n" +
            "Latron Prime\n" +
            "Latron Wraith\n" +
            "Lenz\n" +
            "MK1-Braton\n" +
            "MK1-Paris\n" +
            "MK1-Strun\n" +
            "Miter\n" +
            "Mutalist Cernos\n" +
            "Mutalist Quanta\n" +
            "Ogris\n" +
            "Opticor\n" +
            "Panthera\n" +
            "Paracyst\n" +
            "Paris (Uncharged)\n" +
            "Paris (Charged)\n" +
            "Paris Prime (Uncharged)\n" +
            "Paris Prime (Charged)\n" +
            "Penta\n" +
            "Phage\n" +
            "Phantasma\n" +
            "Prisma Gorgon\n" +
            "Prisma Grakata\n" +
            "Prisma Tetra\n" +
            "Quanta\n" +
            "Quanta Vandal\n" +
            "Quartakk\n" +
            "Rakta Cernos (Uncharged)\n" +
            "Rakta Cernos (Charged)\n" +
            "Rubico\n" +
            "Rubico Prime\n" +
            "Sancti Tigris\n" +
            "Scourge\n" +
            "Secura Penta\n" +
            "Simulor\n" +
            "Snipetron\n" +
            "Snipetron Vandal\n" +
            "Sobek\n" +
            "Soma\n" +
            "Soma Prime\n" +
            "Stradavar\n" +
            "Strun\n" +
            "Strun Wraith\n" +
            "Supra\n" +
            "Supra Vandal\n" +
            "Sybaris\n" +
            "Sybaris Prime\n" +
            "Synapse\n" +
            "Synoid Simulor\n" +
            "Telos Boltor\n" +
            "Tenora\n" +
            "Tetra\n" +
            "Tiberon\n" +
            "Tiberon Prime\n" +
            "Tigris\n" +
            "Tigris Prime\n" +
            "Tonkor\n" +
            "Torid\n" +
            "Vaykor Hek\n" +
            "Vectis\n" +
            "Vectis Prime\n" +
            "Veldt\n" +
            "Vulkar\n" +
            "Vulkar Wraith\n" +
            "Zarr\n" +
            "Zenith\n" +
            "Zhuge\n";

    static {

        Set<Weapon> weaponSet = new HashSet<>();

        for (String name : Splitter.on('\n').split(weaponNames)) {
            if (name.trim().length() > 0) {

                boolean prime = name.contains("Prime");
                weaponSet.add(new Weapon(name, Weapon.Type.PRIMARY, prime, null));
            }
        }


        weapons = ImmutableSet.copyOf(weaponSet);
    }

    public static void main(String[] args) {

        System.out.println(weapons.size());
        weapons.stream().sorted((w1, w2) -> w1.name().compareTo(w2.name)).forEach(System.out::println);

    }
}
