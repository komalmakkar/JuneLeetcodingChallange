/* TDD
 * 1
 * 0
 * -2
 * 18
 * 32
*/
class Solution {
    private boolean isDivisibleBy2(int n){
        return (n % 2 == 0) ? true : false;
    }
    public boolean isPowerOfTwo(int n) {
        while ( n > 0 && n != 1 && isDivisibleBy2(n)){
            n /= 2; 
        }
        return n == 1 ;
    }
}
