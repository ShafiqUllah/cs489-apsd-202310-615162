import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.Arrays;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithValidInput() {
        ArrayFlatter serviceMock = Mockito.mock(ArrayFlatter.class);
        Mockito.when(serviceMock.flattenArray(Mockito.argThat(array -> Arrays.deepEquals(array, new Integer[][]{{1, 2}, {3}, {4, 5, 6}}))))
                .thenReturn(new Integer[]{1, 2, 3, 4, 5, 6});


        ArrayReversor reversor = new ArrayReversor(serviceMock);
        Integer[] result = reversor.reverseArray(new Integer[][]{{1, 2}, {3}, {4, 5, 6}});
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, result);

    }

    @Test
    public void testReverseArrayWithNull() {
        ArrayFlatter serviceMock = Mockito.mock(ArrayFlatter.class);
        Mockito.when(serviceMock.flattenArray(null)).thenReturn(null);

        ArrayReversor reversor = new ArrayReversor(serviceMock);
        Integer[] result = reversor.reverseArray(null);
        Assertions.assertNull(result);

        Mockito.verify(serviceMock).flattenArray(null);
    }
}
