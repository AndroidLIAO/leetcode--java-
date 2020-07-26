public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode cur=root;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int sumVal=val1+val2+carry;
            carry=sumVal/10;
            ListNode sumNode=new ListNode(sumVal%10);
            cur.next=sumNode;
            cur=sumNode;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return root.next;
    }
}
