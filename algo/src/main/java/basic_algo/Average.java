package basic_algo;

/**
 * Created by piyal on 24-02-2017.
 */
public class Average {
    public double avg(int[] avgList){
        double avgVal, sum = 0.0;
        int len = avgList.length;
        for(int i=0; i<=len;i++)
            sum = sum + avgList[i];
        avgVal = sum / len;
        return avgVal;
    }
}
