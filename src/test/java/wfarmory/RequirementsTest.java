package wfarmory;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class RequirementsTest {

    @Test
    public void resources() {

        Requirements r = new Requirements(new Requirement(new Warframe("T1", false, null)),
                                          new Requirement(new Warframe("T2", false, null)),
                                          new Requirement(new Warframe("T3", false, null)),
                                          new Requirement(new Warframe("T4", false, null)));

        assertThat(r.requirementSet(), notNullValue());
        Set<Requirement> requirementSet = r.requirementSet();
        assertThat(requirementSet.size(), equalTo(4));
        assertThat(requirementSet.iterator().next().resource().name(), equalTo("T1"));
    }
}