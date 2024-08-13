import java.lang.Math;
class Solution {
    public int reverse(int n) {
        long r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(r>Integer.MAX_VALUE || r < Integer.MIN_VALUE)
         return 0; 
        else
         return (int)r;
    }
}