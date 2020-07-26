public class Solution {
    public static int myAtoi(String str) {
        /**str.replace(" ","");
        if(str.length()==0)return 0;
        //判断转换的整数的符号
        int bol=0,i=0;
        //第一个字符为负号
        if(str.charAt(0)=='+'){
            i++;
            bol=1;
        }
        //第一个字符为正号
        else if(str.charAt(0)=='-'){
            i++;
            bol=-1;
        }
        //第一个字符为数字

        else if(Integer.valueOf(String.valueOf(str.charAt(0)))>0&&Integer.valueOf(String.valueOf(str.charAt(0)))<=9){
            bol=1;
        }
        //第一个字符为字母
        else {
            return 0;
        }
        long res=0;
        while(i<str.length()){
            int temp=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(temp>=0&&temp<=9) {
                res += res * 10 + temp;//一个long类型的数与一个int类型的数相加会发生错误
                if (res >= Math.pow(2, 31)) {
                    if (bol == 1) return Integer.MAX_VALUE;
                    else return Integer.MIN_VALUE;
                }
            }else
                break;
            i++;
        }


        int result=new Long(res*bol).intValue();
        return result;**/
        String s=str.replace(" ","");
        if(s.length()==0)return 0;
        char chars[]=s.toCharArray();
        int i=0,bol=1;
        if(chars[0]=='+'){
            bol=1;
            i++;
        }
        else if(chars[0]=='-'){
            bol=-1;
            i++;
        }
        else if(!Character.isDigit(chars[0])||chars[0]=='0'){
            return 0;
        }
        int res=0;
        while(i<s.length()&&Character.isDigit(chars[i])){
            int digit=chars[i]-'0';
            if(res>(Integer.MAX_VALUE-digit)/10)return bol==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+digit;
            i++;
        }
        return res*bol;
    }

    public static void main(String[] args) {
        String str=" -42";
        int res=myAtoi(str);
        System.out.println(res);
    }
}
