class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sub= new StringBuilder();
        int length=0;
        int finalLength=0;
        for(int i=0; i < s.length(); i++){
            
            if(!sub.toString().contains((Character.toString(s.charAt(i))))){
                sub.append(s.charAt(i));
                length++;
            }
            else{
                int index = sub.toString().indexOf(s.charAt(i));
                    sub.append(s.charAt(i));
                    sub.delete(0,index+1);
                    length=sub.length();
            }
            if(length > finalLength) finalLength=length;
        }
        return finalLength;
    }
}
