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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode* dummyhead = new ListNode(0);
        dummyhead->next = head;

        ListNode* temp = dummyhead;
        for(int i=1; i< left; i++){
            temp = temp->next;
        } 
        ListNode* temp2 = temp->next;
        ListNode* current = temp2->next;
        for(int i = left; i < right; i++){
            temp2->next = current->next;
            current->next = temp->next;
            temp->next = current;
            current = temp2->next;
        }return dummyhead->next;
    }
};