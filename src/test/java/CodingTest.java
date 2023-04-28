import javamaster.programmers.lv2.최댓값과_최솟값;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class CodingTest {
    
    @Nested
    class ProblemTest {
        @Test
        void case1() {
            최댓값과_최솟값 problem = new 최댓값과_최솟값();
            String result = "1 4";
            Assertions.assertEquals(problem.solution("1 2 3 4"), result);
        }
    }
}
