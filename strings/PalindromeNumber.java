class Solution {
    public boolean isPalindrome(int x) {
        String numStr = Integer.toString(x);
        int[] arr = new int[numStr.length()];
        for(int i = 0; i < numStr.length() ; i++){
            arr[i] = numStr.charAt(i) - '0';
        }
        
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            if(arr[left]!= arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
