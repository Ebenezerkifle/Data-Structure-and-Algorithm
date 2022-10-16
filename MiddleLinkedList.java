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
    public ListNode middleNode(ListNode head) {
         ListNode tempHead=head;
        int counter=0;// a variable to counte the number of nodes
        while(tempHead!=null){
            counter++;
            tempHead=tempHead.next;
        }
        for(int i=0;i<counter/2;i++){
            head=head.next;
        }
        return head;
    }
}
