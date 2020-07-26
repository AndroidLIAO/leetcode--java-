public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        int len=s.length();
        int start=0,end=0;
        int result=0;
        int size=0;
        // 使用滑动窗口
        while(end<len){
            for(int i=start;i<end;i++){
                if(s.charAt(i)==s.charAt(end)){
                    start=i+1;
                    break;//因为滑动窗口中所有的字符都不相同，所以当尾元素与字符中的某个元素相同时，它与后面的字符肯定不会相同
                }
            }
            size=end-start+1;
            result=Integer.max(result,size);
            end++;
        }
        return result;
    }
}
