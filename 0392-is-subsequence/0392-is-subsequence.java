class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0; 
        int tIndex = 0; 

     
        while (tIndex < t.length() && sIndex < s.length()) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++; 
            }
            tIndex++;
        }

        
        return sIndex == s.length();
    }
}