package main.Chapter1;

public class Chapter1 {
    public static int sumOddNumbers(int limit) {
        int result = 0;
        for(int i = 0; i<limit; i++) {
            if (i % 2 != 0) {
                result = result + i;
            }
        }
        return result;
    }

}
