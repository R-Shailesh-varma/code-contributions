class Solution {
public:
    string addBinary(string a, string b) {
        string c= "";
        int carry = 0;
        while(a.length()> 0 || b.length() > 0 || carry != 0){
            int sum = carry;
            if(a.length()>0){
                sum += (a.back() - '0');
                a.pop_back();
            }if(b.length() > 0){
                sum += (b.back() - '0');
                b.pop_back();
            }carry = sum/2;
            c += (sum%2 + '0');
        }reverse(c.begin(), c.end());
        return c;
    }
};