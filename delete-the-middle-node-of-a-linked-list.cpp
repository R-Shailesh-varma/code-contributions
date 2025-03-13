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
    ListNode* deleteMiddle(ListNode* head) {
        // ListNode* dummy = new ListNode(0);
        // dummy->next = head;
        if(head == nullptr || head->next == nullptr ){
            return nullptr;
        }
        ListNode *slow = head, *fast = head, *prev = nullptr;
        while(fast!= nullptr && fast->next != nullptr){
            prev = slow;
            slow = slow->next;
            fast = fast->next->next;
        }
        prev->next = slow->next;
        delete slow;
        // delete next;
        return head;
    }
};