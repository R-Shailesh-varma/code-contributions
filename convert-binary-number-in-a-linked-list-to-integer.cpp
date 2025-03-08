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
    int getDecimalValue(ListNode* head) {
        int count = 0;
        ListNode* temp2 = head;
        while(temp2!= nullptr){
            count++;
            temp2 =temp2->next;
        }
        count = count-1;
        int value = 0;
        ListNode* temp = head;
        while(temp != nullptr){
            value = value + pow(2, count)*temp->val;
            temp = temp->next;
            count--;
        }return value;
    }
};