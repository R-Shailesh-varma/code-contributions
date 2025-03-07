// struct ListNode {
//     int val;
//     ListNode *next;
//     ListNode() : val(0), next(nullptr) {}
//     ListNode(int x) : val(x), next(nullptr) {}
//     ListNode(int x, ListNode *next) : val(x), next(next) {}
//     int lsittonum(){
//         int num=0;
//         ListNode* temp = this;
//         while(temp != nullptr){
//             num = num*10 + temp->value;
//             temp = temp->next;
//         }return num;
//     }
// };
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummyhead = new ListNode(0);
        ListNode* current = dummyhead;
        int carry =0 ,sum = 0; 
        while (l1 != nullptr || l2 != nullptr || carry != 0 ){
            sum = carry;

            if(l1 != nullptr){
                sum += l1->val;
                l1 = l1->next;
            }

            if(l2 != nullptr){
                sum += l2->val;
                l2 = l2->next;
            }

            carry = sum/10;
            current->next = new ListNode(sum%10);
            current = current->next;

        }
        return dummyhead->next;
    }
    
};