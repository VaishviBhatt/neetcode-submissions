class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length -1;

        int[] result = new int[2];

        while(i<j){
            while( i<j && numbers[i] + numbers[j] > target){
                j--;
            }while (i <j && numbers[i] + numbers[j] < target){
                i++;
            }while (i <j && numbers[i] + numbers[j] == target){
            result[0] = i +1;
            result[1] = j +1;
            return result;
            }
        }
        return result;
        
    }
}
