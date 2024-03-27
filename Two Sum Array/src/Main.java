class TwoSumArray {

    public int[] twoSumArray(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];
            if (sum == target) {

                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        TwoSumArray sum = new TwoSumArray();

        int[] numbers= {2,7,11,15};
        int target =18;
        int [] result = sum.twoSumArray(numbers,target);
        System.out.println("output:"+"[" + result[0]+"," +result[1] + "]");
    }

}
