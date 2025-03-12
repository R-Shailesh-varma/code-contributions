/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        if(!head || !head->next){
            return head;
        }
        ListNode *left = head, *right = head->next;
        while(right!= nullptr){
            ListNode *gcdf = new ListNode(gcd(left->val, right->val));
            left->next = gcdf;
            gcdf->next = right;
            left = right;
            right = right->next;
        }
        return head;
    }
};int gcd(int a, int b){
    int i = 1, gcd;
    if(a < b){
        i = a;
    }else{
        i = b;
    }for(int j =i; j > 0; j--){
        if(a%j== 0 && b%j==0){
            return j;
        }
    }return i;
}