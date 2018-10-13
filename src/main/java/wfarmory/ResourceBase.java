package wfarmory;

import lombok.Getter;
import lombok.experimental.Accessors;

public class ResourceBase implements Resource {

    @Accessors(fluent = true)
    @Getter
    protected final String name;

    @Accessors(fluent = true)
    @Getter
    protected final boolean prime;


    public ResourceBase(String name, boolean prime) {

        this.name = name;
        this.prime = prime;
    }

    @Override
    public String toString() {

        return "ResourceBase{" +
                "name='" + name + '\'' +
                ", prime=" + prime +
                '}';
    }
}
