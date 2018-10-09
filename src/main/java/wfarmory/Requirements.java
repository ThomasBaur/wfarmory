package wfarmory;
/*
 ******************************************************************************
 *      Worldline Germany GmbH             Security Solutions
 *      Pascalstrasse 19                   Phone +49 (0) 2408/148-0
 *      D-52076 Aachen
 *
 *      All rights reserved
 *
 ******************************************************************************
 */

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
