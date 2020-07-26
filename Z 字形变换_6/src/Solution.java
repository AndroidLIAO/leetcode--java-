public class Solution {
    /**
     * 1、起始下标都是行号
     * 2、第0层和第numRows-1层的间隔为step（2*numRows-2）
     * 3、中间层的间隔为：step-2*i和2*i相互交替
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if(numRows<2)return s;
        int index=0;
        int step=2*numRows-2;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            index=i;
            int add=i*2;
            while(index<s.length()){
                res.append(s.charAt(index));
                add=step-add;    //中间层就是step-2*i和2*i相互交替
                index+=(i==0||i==numRows-1)?step:add;
            }
        }
        return res.toString();
    }
}
