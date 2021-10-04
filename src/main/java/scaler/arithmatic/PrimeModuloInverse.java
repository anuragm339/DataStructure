package scaler.arithmatic;

public class PrimeModuloInverse {
    public int solve(int A, int B) {
        long MOD = (long) (1e9 + 7);
        return  powerLL(A,B,MOD);
    }
    static int powerLL(int x, int n,long MOD)
    {
        long result = 1;
        while (n > 0)
        {
            if (n % 2 == 1)
            {
                result = result * x % MOD;
            }
            n = n / 2;
            x = (int) (x * x % MOD);
        }
        return (int) result;
    }
}
