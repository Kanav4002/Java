public class SetMatrix {
    public static void main(String[] args) {
        int[][] booleanMatrix = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        int row = -1, col = -1;

        for(int i = 0; i < booleanMatrix.length; i++) {
          for(int j = 0; j < booleanMatrix[i].length; j++) {
            if(booleanMatrix[i][j] == 1) {
              row = i;
              col = j;
            }
          }
        }

        for(int i = 0; i < booleanMatrix[row].length; i++) {
          booleanMatrix[row][i] = 1;
        }

        for(int i = 0; i < booleanMatrix.length; i++) {
          booleanMatrix[i][col] = 1;
        }


        for(int i = 0; i < booleanMatrix.length; i++) {
          for(int j = 0; j < booleanMatrix[i].length; j++) {
            System.out.print(booleanMatrix[i][j] + " ");
          }
          System.out.println();
        }
    }
}