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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int len = 0;
        ListNode* temp = head;
        while(temp!= nullptr){
            len++;
            temp = temp->next;
        }
        int n2 = len-(n);
        if(n2 == 0){
            ListNode* k1 = head;
            head = k1->next;
            delete k1;
            return head;
        }
        temp = head;
        for(int i = 0; i < n2-1; i++){
            temp = temp->next;
        }ListNode* k1 = temp->next;
        temp->next = k1->next;
        delete k1;
        return head;
    }
};