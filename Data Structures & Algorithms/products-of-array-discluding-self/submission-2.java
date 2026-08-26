class Solution {
    public int[] productExceptSelf(int[] nums) {
        int LENGTH = (nums.length);
        int[] output = new int[LENGTH];
        int[] prefix = new int[LENGTH];
        int[] postfix = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            if (i == 0)  {
                System.out.println("Here" + nums[i] + i);
                prefix[i] = nums[i];
                 System.out.println("Here" + prefix[i] + i);
            } else {
               prefix[i] = nums[i] * prefix[i-1];
            }
        }

        for (int i = LENGTH-1; i >= 0; i--) {
            if (i+1 > LENGTH-1) {
                System.out.println("Here" + nums[LENGTH-1] + i);
                postfix[i] = nums[LENGTH-1];
            } else {
                postfix[i] = nums[i] * postfix[i+1]; 
            }
        } 

        System.out.println("Prefix array");
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(prefix[i]+",");
        }

        System.out.println("Postfix array");
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(postfix[i]+",");
        }


        for (int i = 0; i < LENGTH; i++) {
            if (i == 0) {
                output[i] = 1 * postfix[i+1];
            } else if (i != LENGTH-1){
                output[i] = postfix[i+1] * prefix[i-1];
            } else {
                output[i] = 1 * prefix[i-1];
            }
            
        }

        return output;
    }
}  
