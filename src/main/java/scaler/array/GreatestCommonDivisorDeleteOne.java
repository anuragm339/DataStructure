package scaler.array;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorDeleteOne {
    public int solve(List<Integer> A) {
        int arr[] =new int[A.size()];
       for(int i=0;i<A.size();i++){
           arr[i]=A.get(i);
       }
        return MaxGCD(arr,arr.length);
    }
     int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    // from the given array
     int MaxGCD(int a[], int n)
    {

        // Prefix and Suffix arrays
        int Prefix[] = new int[n + 2];
        int Suffix[] = new int[n + 2] ;

        // Single state dynamic programming relation
        // for storing gcd of first i elements
        // from the left in Prefix[i]
        Prefix[1] = a[0];
        for (int i = 2; i <= n; i += 1)
        {
            Prefix[i] = gcd(Prefix[i - 1], a[i - 1]);
        }

        // Initializing Suffix array
        Suffix[n] = a[n - 1];

        // Single state dynamic programming relation
        // for storing gcd of all the elements having
        // greater than or equal to i in Suffix[i]
        for (int i = n - 1; i >= 1; i -= 1)
        {
            Suffix[i] = gcd(Suffix[i + 1], a[i - 1]);
        }

        // If first or last element of
        // the array has to be removed
        int ans = Math.max(Suffix[2], Prefix[n - 1]);

        // If any other element is replaced
        for (int i = 2; i < n; i += 1)
        {
            ans = Math.max(ans, gcd(Prefix[i - 1], Suffix[i + 1]));
        }

        // Return the maximized gcd
        return ans;
    }
}
