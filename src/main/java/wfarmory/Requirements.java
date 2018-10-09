package wfarmory;

import com.google.common.collect.ImmutableList;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.List;

public class Requirements {

    @Accessors(fluent=true)
    @Getter
    private final List<Resource> resources;

    public Requirements(Resource r1, Resource r2, Resource r3, Resource r4) {

        resources = ImmutableList.of(r1, r2, r3, r4);
    }


}
