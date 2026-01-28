//****************************************************
//PREFIX SUM
//****************************************************
//The Core Sliding Window Template (Memorize This)
//===============================


//----------------------------------------------------------------------
//  CORE Formula:
public class PrefixSum {
    public static int[] calculatePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
}
//---------------------------------------------------------------------------------------