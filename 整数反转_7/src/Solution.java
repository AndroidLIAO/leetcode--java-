public class Solution {
    public int reverse(int x) {
        long res=0;
        while(x!=0){
            res=res*10+x%10;
            x=x/10;
        }
        int result=new Long(res).intValue();
        if(result!=res)return 0;
        return result;
    }
}
