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
    ListNode* removeElements(ListNode* head, int v) {
        while(head!=nullptr){
            if(head->val == v){
                ListNode* dum = head;
                head = head->next;
                delete dum;
            }else{
                break;
            }
        }
        
        ListNode* prev = nullptr;
        ListNode* temp = head;
        
        while(temp!= nullptr){
            if(temp->val == v){
                prev->next = temp->next;
                ListNode* temp2 = temp;
                temp = prev->next;
                delete temp2;
            }else{
                prev = temp;
                temp = temp->next;
            }
            
        }

        return head;

    }
};