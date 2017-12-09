package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CityMappingTest {

    CityMapping cityMapping = new CityMapping();

    @Test
    public void testCityMapping() throws Exception {
        assert (cityMapping.getCode("Phra Nakhon") == 1001);
        assert (cityMapping.getCode("Khlong San") == 1018);
        assert (cityMapping.getCode("Phasi Charoen") == 1022);
        assert (cityMapping.getCode("Prawet") == 1032);
        assert (cityMapping.getCode("Lak Si") == 1041);
    }
}
