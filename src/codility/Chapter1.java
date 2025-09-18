package codility;

public class Chapter1 {

    // Iterations

    public void doTriangle() {
        for (int i = 0; i < 5; i++) {
            System.out.print("-");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }
}
