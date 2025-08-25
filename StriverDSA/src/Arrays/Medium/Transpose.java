package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        matrix.add(new ArrayList<>(Arrays.asList(13, 14, 15, 16)));
        int n = matrix.size();

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = i + 1; j < matrix.get(0).size(); j++) {
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }

        for (ArrayList<Integer> row : matrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
