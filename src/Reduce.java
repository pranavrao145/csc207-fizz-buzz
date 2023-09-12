public class Reduce {
    public static int main(int n) {
        int stepsCount = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }

            stepsCount++;
        }

        return stepsCount;
    }
}
