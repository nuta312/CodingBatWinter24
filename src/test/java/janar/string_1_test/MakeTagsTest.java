package janar.string_1_test;

import org.testng.annotations.DataProvider;

public class MakeTagsTest {

        @DataProvider(name = "tagWordData")
        public Object[][] tagWordData() {
            return new Object[][] {
                    {"i", "Yay", "<i>Yay</i>"},
                    {"i", "Hello", "<i>Hello</i>"},
                    {"cite", "Yay", "<cite>Yay</cite>"}
            };
        }

}
