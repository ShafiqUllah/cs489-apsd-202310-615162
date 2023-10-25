import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArrayWithNull() {
        Integer[][] input = null;
        Integer[] result = ArrayFlatter.flattenArray(input);
        MatcherAssert.assertThat(result, Matchers.nullValue());
    }

    @Test
    public void testFlattenArrayWithValidInput() {
        Integer[][] input = {{1, 2}, {3}, {4, 5, 6}};
        Integer[] expected = {1, 2, 3, 4, 5, 6};
        Integer[] actual = ArrayFlatter.flattenArray(input);
        MatcherAssert.assertThat("Test fails: Result does not match",
                actual, CoreMatchers.is(CoreMatchers.equalTo(expected)));
    }


}
