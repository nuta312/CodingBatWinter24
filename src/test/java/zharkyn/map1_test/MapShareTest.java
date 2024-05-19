package zharkyn.map1_test;

import com.digital_nomads.zharkyn.map1.MapShare;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MapShareTest {

    @Test(dataProvider = "mapShareDataProvider")
    public void mapShareTest(Map<String, String> map, Map<String, String> expected){
        MapShare mapShare = new MapShare();
        Map<String, String> result = mapShare.mapShare(map);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "mapShareDataProvider")
    public Object[][] mapShareDataProvider() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");

        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "aaa");
        expected1.put("b", "aaa");

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");

        Map<String, String> expected2 = new HashMap<>();
        expected2.put("b", "xyz");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");

        Map<String, String> expected3 = new HashMap<>();
        expected3.put("a", "aaa");
        expected3.put("b", "aaa");
        expected3.put("d", "hi");

        return new Object[][] {
                { map1, expected1 },
                { map2, expected2 },
                { map3, expected3 }
        };
    };
}
