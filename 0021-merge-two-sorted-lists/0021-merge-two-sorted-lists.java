/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode l2) {
       ListNode list3 = new ListNode(0);
       ListNode curr= list3; 

       while(list1!=null&& l2!=null){
           if (list1.val<=l2.val){
               curr.next=list1;
               list1=list1.next;
           }
           else{
               curr.next = l2;
               l2=l2.next;
           }
           curr=curr.next;
       }
       curr.next = list1!=null?list1:l2;
     return list3.next;
    }
}