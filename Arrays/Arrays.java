
// This is a demo for 2-Dimension Array
//  int[][] arr = new int[3][6]; -->> Means I want 3 1-D arrays with 6 elements each.
public class Arrays {
    public static void main(String[] args) {

        int[][] worldPopulation = {
                //    0,  1,  2,  3,  4
                {100, 200, 300, 400, 500},                            // 0
                {213, 254, 354, 656, 766, 766},                        // 1
                {232, 8676, 9767, 54, 2232, 23232, 5343, 54656},         // 2
                {43243, 434, 4342, 655, 3212, 6767, 22323}              // 3
        };
        System.out.println("The wordPopulation of cities are: " + worldPopulation[1] + " and length is: " + worldPopulation[1].length);  //6
        System.out.println("The wordPopulation of cities are: " + worldPopulation[2] + " and length is: " + worldPopulation[2].length);  //8
        System.out.println("The wordPopulation of cities are: " + worldPopulation[3] + " and length is: " + worldPopulation[3].length);    //7

        // Read single element
        System.out.println("wordlPopulation[0][0] " + worldPopulation[1][2]);  //354

        // Update/Write
        worldPopulation[0][3] = 1000;
        System.out.println("wordlPopulation[0][0] " + worldPopulation[0][3]);  // 1000

        // Read All
        for (int i = 0; i < worldPopulation.length; i++) {
            for (int j = 0; j < worldPopulation[i].length; j++) {
                System.out.print(worldPopulation[i][j] + " ");
            }
            System.out.println();
        }
    }
}




// add a 3x3 matrix

public class Playground {
    public static void main(String[] args) {

        int[][] a = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int[][] b = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };

        System.out.println("=======MATRIX a ===============");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        System.out.println("=======MATRIX b ===============");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        int[][] c = new int[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }

        System.out.println("=======MATRIX c ===============");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
