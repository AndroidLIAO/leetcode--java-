public class Solution {
    public String longestPalindrome(String s) {
        if(s.isEmpty())return "";
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            int val1=longGest(i,i,s);  //假设回文串的中间为单个字符
            int val2=longGest(i,i+1,s);   //假设回文串的中间为相连的两个字符
            int len=Math.max(val1,val2);
            if(len>right-left){
                left=i-(len-1)/2;
                right=i+len/2;
            }
        }
        return s.substring(left,right+1);
    }
    public int longGest(int left,int right,String s){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
