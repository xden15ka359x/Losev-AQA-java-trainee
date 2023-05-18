public class MultipleOf3 {
    public static void main(String[] args) {
        int[] numbersArr = {-30, 0, 3, 5, 8, 255, 12, 99, 300, 311, -1};

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 3 == 0 && numbersArr[i] != 0) {
                System.out.println(numbersArr[i]);
            }
        }
    }
}
