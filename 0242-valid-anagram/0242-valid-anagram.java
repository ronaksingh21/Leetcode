class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc= s.toCharArray();
        char[] tc= t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
if(new String(sc).equals(new String(tc)))
            return true;
        return false;
    }
}