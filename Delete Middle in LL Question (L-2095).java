class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return head.next;
        }
        int size = getSize(head);
        ListNode deleteNode = head;
        int n = size/2 +1;
        while(n>0){
            n--;
            deleteNode = deleteNode.next;
        }
        size = size/2;
        ListNode nextNode = head;
        ListNode ans = nextNode;
        while(size >1){
            size--;
            nextNode = nextNode.next;
        }
        nextNode.next = deleteNode;
        return ans;
    }
    
    
    
    public int getSize(ListNode head){
        ListNode node = head;
        int size =0;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
    }
}