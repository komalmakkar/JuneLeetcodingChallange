/* TDD cases
 * ["h","e","l","l","o"]
 * ["h"]
 * ["h","e"]
 * []
 */

class Solution {
    // Utility method for swaping two characters
    private void swapCharacters(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    
    public void reverseString(char[] s) {
        if(s.length <= 1) return;
        for (int i = 0; i < s.length/2; i++)
        {
            swapCharacters(s,i,s.length-i-1);
        } 
    }
}
