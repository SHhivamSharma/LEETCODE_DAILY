// 50. Pow(x, n)
class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        //long nn = Math.abs((long)n) ; 
        long nn = n ;
        if(nn < 0) nn = -1 * nn;
        while (nn > 0) {
            if(nn % 2 == 1){
                ans = ans * x;
                nn = nn-1;
                
            }else {
                x= x*x;
                nn = nn/2;
            }
        }
        // System.out.print(ans);
        if(n<0)
            //(double long ) ans = (double long )(1.0)/(double long )(ans);
           ans = (double)(1.0)/(double)(ans);
        
        return ans ;
        
    }
}