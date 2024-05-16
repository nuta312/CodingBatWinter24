package eldar_test.str1.test;

import com.digital_nomads.eldar.str1.MakeTags;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _3MakeTags {
    @Test(dataProvider = "MTT")
    public void testMakeTags (String a, String b, String e){
        MakeTags mt= new MakeTags();
        String res = mt.makeTags(a,b);
        assert res.equals(e);
    }




    @DataProvider
    public Object [][] MTT (){
        return new Object[][]{
                {"i","Yay","<i>Yay</i>"},
                {"i","Hello","<i>Hello</i>"},
                {"cite","Yay","<cite>Yay</cite>"},
        };

    }
}
