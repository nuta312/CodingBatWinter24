package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.HelloName;
import com.digital_nomads.zafura.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {
    @Test(dataProvider = "Tages")
    public void testMakeTags(String name,String tags, String expected) {
        MakeTags makeTags = new MakeTags();
        Assert.assertEquals(makeTags.makeTags(name, tags),expected);
    }
    @DataProvider
    public Object[][]Tages(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello","<i>Hello</i>" },
                {"cite", "Yay","<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"},
                {"body", "Heart","<body>Heart</body>"},
                {"i", "i","<i>i</i>"},
};
    }}