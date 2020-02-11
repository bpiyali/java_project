package basic_algo;

/**
 * Created by piyal on 24-02-2017.
 */
public class BinarySearch {

    public int search(int searchVal, int[] listVal){
        int lo = 0;
        int mid = -1;
        int len = listVal.length;
        int hi = len - 1;

        while (lo <= hi) {
            mid = lo + (hi - lo)/2;
            if(searchVal < listVal[mid])
                hi = mid - 1 ;
            else if (searchVal > listVal[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
