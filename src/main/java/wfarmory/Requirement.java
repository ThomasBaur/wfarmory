package wfarmory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@AllArgsConstructor
public class Requirement {

    @Getter
    private final Resource resource;
    @Getter
    private final int count;


    public Requirement(Resource resource) {

        this(resource, 1);
    }

}
