class ListNode{
    int val;
    ListNode prev;
    ListNode next;
    ListNode(int v){
        val = v;
        prev = null;
        next = null;
    }
}

class MyCircularDeque {
    
    ListNode head;
    ListNode tail;
    int qty;
    int maxQty;


    public MyCircularDeque(int k) {
        maxQty = k;
        qty = 0;
        head = null;
        tail = null;    
    }
    
    public boolean insertFront(int value) {
        ListNode cur = new ListNode(value);
        if(qty == maxQty) return false;
        if(head == null){
            head = cur;
            tail = cur;
        }else{
            head.prev = cur;
            cur.next = head;
            head = cur;
        }
        qty++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(qty == maxQty) return false;
        ListNode cur = new ListNode(value);
        if(tail == null){
            head = tail = cur;
        }else{
            tail.next = cur;
            cur.prev = tail;
            tail = cur;
        }
        qty++;
        return true;
    }
    
    public boolean deleteFront() {
        if(qty == 0) return false;
        if(qty == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        qty--;
        return true;
    }
    
    public boolean deleteLast() {
        if(qty == 0) return false;
        if(qty == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }qty--;
        return true;
    }
    
    public int getFront() {
        if(qty == 0) return -1;
        return head.val;
    }
    
    public int getRear() {
        if(qty == 0) return -1;
        return tail.val;
    }
    
    public boolean isEmpty() {
        return qty == 0;
    }
    
    public boolean isFull() {
        return qty == maxQty;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */