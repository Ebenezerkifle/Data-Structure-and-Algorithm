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
    public ListNode deleteDuplicates(ListNode head) {
        //Two pointer problem.
        // let's use two pointers pointer1 & pointer2.
        // new nodes are created:
        // newNode:- a node which points to the head of a given node.
        // pointer1:- a node which is equals to the given node.
        // pointer2:- a node that creates a path to non duplicated elements.
        ListNode newNode=new ListNode(0), pointer1=head, pointer2=newNode;
        pointer2.next=pointer1;
        // pointer 2 which is newNode has next node head(the given one).
        
        while(pointer1!=null){
            while(pointer1.next!=null && pointer1.val==pointer1.next.val){
                pointer1=pointer1.next;
                // pointer 1 moves until there is no duplicate element found.
            }
            if(pointer1!=pointer2.next){
                //duplicate found!
                pointer2.next=pointer1.next;
                // pointer 1 is currently points at one of duplicated element
                // so it should go forward to loose that element.
                pointer1=pointer2.next;
                // pointer 1 gets updated.
            }
            else{
                //no duplicate found!
                
                //Both pointers get updated.
                pointer2=pointer2.next;
                pointer1=pointer1.next;
            }
        }
        return newNode.next;// next is added so that initially the node points to the head.
    }
}
