package zharkyn.map1_test;

import com.digital_nomads.zharkyn.map1.MapBully;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MapBullyTest {


    @Test(dataProvider = "mapBullyDataProvider")
    public void mapBullyTest(Map<String, String> map, Map<String, String> expected){
        MapBully mapBully = new MapBully();
        Map<String, String> result = mapBully.mapBully(map);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "mapBullyDataProvider")
    public Object[][] mapBullyDataProvider() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");

        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "");
        expected1.put("b", "candy");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");

        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "");
        expected2.put("b", "candy");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");

        Map<String, String> expected3 = new HashMap<>();
        expected3.put("a", "");
        expected3.put("b", "candy");
        expected3.put("c", "meh");

        return new Object[][] {
                { map1, expected1 },
                { map2, expected2 },
                { map3, expected3 }
        };
        };
    }


