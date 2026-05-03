class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        int n=0;
        for(int c=0;c<sArr.length;c++){
            if(sArr[c]==tArr[c]){
                n++;
            }
        }
        if(n==sArr.length){
            return true;
        }
        else{
            return false;
        }
    }
}