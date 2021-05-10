package Block5.Property.Sorting;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        double[] darr = {7.4,2.5,10.5};

        System.out.println(Arrays.toString(darr));

        Arrays.sort(darr);
        System.out.println(Arrays.toString(darr));
    }
}
