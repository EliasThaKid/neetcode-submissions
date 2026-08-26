class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int R = 0;
        int L = numbers.length - 1;
        int[] result = new int[2];

        while (R < L) {
            System.out.println("looping..");
            
            
            if(numbers[R] + numbers[L] == target) {
                System.out.println("Entered condition");
                result[0] = R+1;
                result[1] = L+1;
                break;
            }

            if(numbers[R] + numbers[L] > target) {
                L--;
            }

            if(numbers[R] + numbers[L] < target) {
                R++;
            }

            
            
        }

        return result;

    }
}
