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
    ListNode* rotateRight(ListNode* head, int k) {
        int count = 0;
        ListNode *temp = head;
        while(temp!=nullptr){
            count++;
            temp= temp->next;
        }
        if(count <= 1 || k ==0){
            return head;
        }
        temp = head;
        k = k % count;
        if (k==0){
            return head;
        }
        while(temp->next!=nullptr){
            temp = temp->next;
        }
        temp->next = head;
        ListNode *temp1 = head, *temp2 = head->next;
        for(int i=0; i< count-k-1; i++){
            temp2 = temp2->next;
            temp1 = temp1->next;
        }head = temp2;
        temp1->next = nullptr;
        return head;
    }
};