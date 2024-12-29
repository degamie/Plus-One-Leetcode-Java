class Solution {
    public int[] plusOne(int[] digits) {
        //T(C(N)=O(N) and S(C(N)=O(N)) as it requires contigous Memory space allocation in interative Time 
        for(int i=digits.length-1;i>=0;i--){//reversing the Array
            // if(digits[i]+1!=10){
            if(digits[i]<9){//Incrementing the array from Last digit till 9
                digits[i]++;
                return digits;
            }digits[i]=0;//initializing the array
            }
            int[] res=new int[digits.length+1];//Array result declare
            res[0]=1;//Initzinaling the Result's Index in a unity
            return res;//Printing the resultant val
        }
    }
