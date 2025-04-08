/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if(!headA || !headB){return NULL;}
        ListNode *temp1 = headA, *temp2 = headB, *node = nullptr;
        int len1 = 0 , len2 = 0;
        while(temp1!= nullptr){
            len1++;
            temp1=temp1->next;
        }
        while(temp2 != nullptr){
            len2++;
            temp2 = temp2->next;
        }ListNode *t1 = headA, *t2 = headB;
        if(len1 > len2){
            for(int i=0; i < len1-len2; i++){
                t1 = t1->next;
            }
        }else if(len2 > len1){
            for(int i=0; i < len2-len1; i++){
                t2 = t2->next;
            }
        }
        while(t1 != t2 && t1 != nullptr && t2 != nullptr){
            t1 = t1->next;
            t2 = t2->next;
        }
    return t1;
    }
};