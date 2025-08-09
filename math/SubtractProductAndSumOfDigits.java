class Solution {
    public int subtractProductAndSum(int n) {
        String numStr = Integer.toString(n);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
          digits[i] = numStr.charAt(i) - '0'; // convert char digit to int
        }
        int product  =1;
        int sum = 0;
        for(int i = 0; i < digits.length; i++){
            product*= digits[i];
            sum+=digits[i];
        }
        return product-sum;
    }
}
