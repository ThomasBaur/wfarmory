package wfarmory;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Set;

@Accessors(fluent = true)
public class Requirements {

    @Getter
    private final Set<Requirement> requirementSet;

    public Requirements(Requirement r1, Requirement r2, Requirement r3, Requirement r4) {

        requirementSet = ImmutableSet.of(r1, r2, r3, r4);
    }

    public Requirements(Resource r1, Resource r2, Resource r3, Resource r4) {

        this(new Requirement(r1), new Requirement(r2), new Requirement(r3), new Requirement(r4));
    }

    public Requirements() {

        requirementSet = ImmutableSet.of();
    }

    @Override
    public String toString() {

        return "Requirements{" +
                "requirementSet=" + requirementSet +
                '}';
    }
}
