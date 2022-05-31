package BFS;

import utils.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GatherColumns {


    int SIZE = 300;
    int LEN = SIZE / 2;

    public List<List<Integer>> verticalTraversal(Node root) {
        int[][][] coordinates = new int[SIZE][LEN][2];
        int[] cnt = new int[SIZE];
        int[] cur = new int[2];
        order(root, cur, coordinates, cnt);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                List<Integer> tmp = new ArrayList<>();
                int[][] r = Arrays.copyOf(coordinates[i], cnt[i]);
                Arrays.sort(r, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o2[1] == o1[1]) {
                            return o1[0] - o2[0];
                        }
                        return o2[1] - o1[1];
                    }
                });
                for (int j = 0; j < cnt[i]; j++) {
                    tmp.add(r[j][0]);
                }
                ret.add(tmp);
            }
        }
        return ret;
    }

    public void order(Node root, int[] cur, int[][][] coordinates, int[] cnt) {
        if (root == null) {
            return;
        }
        int index = cur[0] + LEN;
        coordinates[index][cnt[index]][0] = root.data;
        coordinates[index][cnt[index]][1] = cur[1];
        cnt[index]++;
        int[] tmp = new int[2];
        tmp[0] = cur[0] - 1;
        tmp[1] = cur[1] - 1;
        order(root.left, tmp, coordinates, cnt);
        tmp[0] = cur[0] + 1;
        tmp[1] = cur[1] - 1;
        order(root.right, tmp, coordinates, cnt);
    }
}
