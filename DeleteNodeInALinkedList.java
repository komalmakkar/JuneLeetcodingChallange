/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
    * TDD: The constraints are pretty basic, 
    * The node will not be the tail and list will be at least of two nodes,
    * so can test for the exception being thrown for that. 
    * If someone has any tests written for the same, please leave a comment. 
    */ 
     public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
    }
}
