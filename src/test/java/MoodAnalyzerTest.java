import com.bridgelabz.exceptions.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    static MoodAnalyzer mood;
    @Test
    public void test1AnalyzeMoodAsSad(){
        mood = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("SAD", mood.analyzeMood());
        System.out.println("Test 1.1: Test Case For Sad Mood Passed");
    }
    @Test
    public void test2AnalyzeMoodAsHappy(){
        mood = new MoodAnalyzer("I am in Happy Mood");
        Assert.assertEquals("HAPPY", mood.analyzeMood());
        System.out.println("Test 1.2: Test Case For Happy Mood Passed");
    }
    @Test
    public void testNullException(){
        mood = new MoodAnalyzer();
        Assert.assertEquals("HAPPY",mood.analyzeMood());
        System.out.println("Test 2.1: Test Case For Null Pointer Exception Handled");

    }
}
