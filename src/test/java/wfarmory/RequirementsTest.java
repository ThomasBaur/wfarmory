package wfarmory;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class RequirementsTest {

    @Test
    public void resources() {

        Requirements r = new Requirements(new Warframe("T1", false, null), new Warframe("T2", false, null), new Warframe("T3", false, null), new Warframe("T4", false, null));

        assertThat(r.resources(), notNullValue());
        List<Resource> resourceList = r.resources();
        assertThat(resourceList.size(), equalTo(4));
        assertThat(resourceList.get(0).name(), equalTo("T1"));
    }
}