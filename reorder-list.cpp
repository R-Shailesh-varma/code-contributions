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
    void reorderList(ListNode* head) {
        if (!head || !head->next) return;
        ListNode *slow = head, *fast = head;
        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next->next;
        }
        ListNode *h1 = head;
        ListNode *h2 = slow->next;
        slow->next = nullptr;
        ListNode *prev = nullptr;
        while(h2){
            ListNode *n = h2->next;
            h2->next = prev;
            prev = h2;
            h2 = n;
        }h2 = prev;
        while(h1 && h2){
            ListNode* n1 = h1->next;
            ListNode* n2 = h2->next;
            
            h1->next = h2;
            if (!n1) break;
            h2->next = n1;

            h1 = n1;
            h2 = n2;
        }
    }
};