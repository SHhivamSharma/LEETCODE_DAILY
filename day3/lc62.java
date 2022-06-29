// 62. Unique Paths

class Solution {
    public int uniquePaths(int m, int n) {
        
        if (m < n) {
            return uniquePaths(n, m);
        }
        
        /* invariant now: m >= n */
        
        if (n == 1) {
            return 1;  // if height or width of grid is 1, then there is only 1 path
        }

        // use aliases for readability        
        int p = m - 1;
        int q = n - 1;
        
        long res = 1L;
        long from1ToQ = 1;

        for (long curFactor = p + 1; curFactor <= p + q; ++curFactor) {
            res *= curFactor;
            res /= from1ToQ++;
        }
            
        return (int) res;
    }
}        
