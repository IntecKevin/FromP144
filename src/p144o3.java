public class p144o3 {
    public static void main(String[] args) {

        //initialisatie
        int[][] dimension4 = new int[4][6];

        //declaratie
        for (int i = 0; i < dimension4.length; i++) {
            for (int y = 0; y < dimension4[i].length; y++) {
                dimension4[i][y] = i * y;
            }
        }

        //print
        for (int[] r : dimension4) {
            for (int k : r) {
                System.out.print(k + " ");
            }
        }
    }
}
