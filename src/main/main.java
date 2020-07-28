class main {
    public static void main(String[] args) {
        int totalNum;
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        totalNum = 7;
        int expectedNumSum = totalNum * ((totalNum + 1) / 2);
        int numSum = 0;
        for (int i : numbers) {
            numSum += i;
        }
        System.out.print(expectedNumSum - numSum);
        System.out.print("\n");
    }
}


