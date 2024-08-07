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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
       
        while(temp!=null){
            ListNode kth = findkth(temp,k);
            if(kth==null){
                if(prevNode!=null){
                prevNode.next = temp;
                }
                break;
            }
          ListNode newNode = kth.next;
            kth.next = null;
            reverse(temp);
            if(temp==head){
                head = kth;
            }else{
                prevNode.next = kth;
            }
            prevNode = temp;
            temp = newNode;
        }
        return head;
    }
    public ListNode findkth(ListNode temp,int k){
        for(int i=1;i<k && temp!=null;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void reverse(ListNode temp){
        ListNode prev = null;
        ListNode present = temp;
        ListNode nextNode = temp.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = nextNode;
            if(nextNode!=null){
                 present = nextNode;
                 nextNode = nextNode.next;
            }else{
                break;
            } 
        }
    
    }
    }
    
