class Solution {
    public boolean isPalindrome(int x) {
       if(x==rev(x)&&x>=0)
       return true;
       return false; 
    }
    static int rev(int n){
        int r=0;
        while(n!=0){
           int d=n%10;
           r=r*10+d;
           n/=10; 
        }
        return r;
    }
}