package wfarmory;


import lombok.Getter;
import lombok.experimental.Accessors;

public class BuildableBase extends ResourceBase implements Buildable {

    @Accessors(fluent = true)
    @Getter
    protected final Requirements requirements;


    public BuildableBase(String name, boolean prime, Requirements requirements) {

        super(name, prime);
        this.requirements = requirements != null ? requirements : new Requirements();
    }

    @Override
    public String toString() {

        return "BuildableBase{" +
                "requirements=" + requirements +
                ", name='" + name + '\'' +
                ", prime=" + prime +
                '}';
    }
}
