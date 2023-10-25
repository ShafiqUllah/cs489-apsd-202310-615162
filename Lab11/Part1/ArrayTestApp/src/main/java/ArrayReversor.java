import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class ArrayReversor {

    private ArrayFlatter arrayFlatterService;

    public Integer[] reverseArray(Integer[][] inputArray) {
        Integer[] flattenedArray = arrayFlatterService.flattenArray(inputArray);
        if (flattenedArray == null) {
            return null;
        }
        List<Integer> list = Arrays.asList(flattenedArray);
        Collections.reverse(list);
        return list.toArray(new Integer[0]);
    }
}
