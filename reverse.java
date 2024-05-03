import java.util.Scanner;
class ListNode{
    int data;
    ListNode next;
    ListNode(int x){
        data=x;
    }
}
public class reverse{
    static ListNode reverseL(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        

    }
return prev;}
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
    ListNode head =new ListNode(10);
    ListNode sec=new ListNode(20);
    ListNode thr=new ListNode(30);
    head.next=sec;
    sec.next=thr;
    head=reverseL(head);

}}