package wfarmory;

import lombok.Getter;
import lombok.experimental.Accessors;

public class ResourceBase implements Resource {

    @Accessors(fluent = true)
    @Getter
    private final String name;

    @Accessors(fluent = true)
    @Getter
    private final boolean prime;


    public ResourceBase(String name, boolean prime) {

        this.name = name;
        this.prime = prime;
    }
}
