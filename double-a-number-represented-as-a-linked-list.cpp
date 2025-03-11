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
    ListNode* doubleIt(ListNode* head) {
        int carry = 0;
        ListNode *c = head, *rev = nullptr, *next;
        while(c!= nullptr){
            next = c->next;
            c->next = rev;
            rev = c;
            c = next;
        }ListNode* temp = rev;
        while(temp!= nullptr){
            int sum = carry+temp->val*2;
            carry = sum/10;
            temp->val = sum%10;
            temp = temp->next;
        }if(carry != 0 ){
            ListNode *dev = new ListNode(carry);
            temp = rev;
            while(temp->next != nullptr){
                temp = temp->next;
            }temp->next = dev;
        }c = rev; head = nullptr;
        while(c!= nullptr){
            next = c->next;
            c->next = head;
            head = c;
            c = next;
        }return head;
    }
};