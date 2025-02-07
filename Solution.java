class ListNode {
int val;
ListNode next;
ListNode(int val) {
this.val = val;
}

ListNode (int val, ListNode next) {
  this.next = next;
  this.val = val;
}
}
class Solution {
private static ListNode IntersectionListNode(ListNode l1, ListNode l2) {
  ListNode li1 = l1;
  ListNode li2 = l2;
  while(li1!=l2){
    li1 = li1==null?l2:li1.next;
    li2 = li2==null?l1:li2.next;
  }
return li1;

}
    public static void main(String[] manu) {
        ListNode l1 = new ListNode(4,new ListNode(1,new ListNode(8,new ListNode(4,new ListNode(5)))));
        ListNode l2 = new ListNode(5,new ListNode(0,new ListNode(1,new ListNode(8,new ListNode(4,new ListNode(5))))));
        l2.next.next.next.next.next = l1.next.next;
        ListNode res = IntersectionListNode(l1,l2);
        while(res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
