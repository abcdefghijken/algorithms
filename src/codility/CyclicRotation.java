package codility;

public class CyclicRotation {

    public int[] testCase1 = {5, 8, 9, 3};

    public int[] doCyclicRotation(int[] array, int N) {
        int[] output = new int[array.length];

        return output;
    }

    public int[] sampleCyclicRotation(int[] array, int N) {
        int[] output = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            output[(i + N) % array.length] = array[i];
        }

        for (int i : output) System.out.print(i);
        return output;
    }
}
