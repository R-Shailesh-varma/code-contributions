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
    bool isPalindrome(ListNode* head) {
        if(head == nullptr || head->next == nullptr){
            return true;
        }
        ListNode *slow = head, *fast =head, *temp = head;
        while(fast != nullptr && fast->next != nullptr){
            slow = slow->next;
            fast = fast->next->next;
        }
        ListNode *prev = nullptr, *next;
        while(slow!= nullptr){
            next = slow->next;
            slow->next = prev;
            prev = slow;
            slow = next;
        }
        while(prev!= nullptr){
            if(temp->val != prev->val){
                return false;
            }prev = prev->next;
            temp = temp->next;
        }
        return true;
    }
};