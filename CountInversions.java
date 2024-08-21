import java.util.Arrays;

public class CountInversions {

    public Result countInversions(int[] arr) {
    if (arr.length <= 1) {
        return new Result(arr, 0);
    }

    int middle = arr.length / 2;

    Result left = countInversions(Arrays.copyOfRange(arr, 0, middle));

    Result right = countInversions(Arrays.copyOfRange(arr, middle, arr.length));

    Result result = mergeAndCountInversions(left.sorted, right.sorted);

    return new Result(result.sorted, left.inversions + right.inversions + result.inversions);

}


private Result mergeAndCountInversions(int[] left, int[] right) {
    int[] merged = new int[left.length + right.length];
    int i = 0, j = 0;
    long inversions = 0;

    for(int k = 0; k < merged.length; k++) {
        if (i < left.length && (j >= right.length || left[i] <= right[j])) {
            merged[k] = left[i++];
        } else {
            merged[k] = right[j++];
            inversions += left.length - i;
        }
    }
    return new Result(merged, inversions);
}
}

class Result {
    public int[] sorted;
    public long inversions;

    public Result(int[] sorted, long inversions) {
        this.sorted = sorted;
        this.inversions = inversions;
    }
}