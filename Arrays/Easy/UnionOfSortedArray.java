import java.util.ArrayList;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int a1[] = { 1, 2, 4, 7, 7, 9 };
        int a2[] = { 3, 6, 9 };
        int i = 0, j = 0;
        int l1 = a1.length, l2 = a2.length;

        while (i < l1 && j < l2) {
            if (a1[i] < a2[j]) {
                if (ar.size() == 0 || ar.get(ar.size() - 1) != a1[i]) {
                    ar.add(a1[i]);
                }
                i++;
            } 
            else if (a1[i] > a2[j]) {
                if (ar.size() == 0 || ar.get(ar.size() - 1) != a2[j]) {
                    ar.add(a2[j]);
                }
                j++;
            } 
            else { 
                if (ar.size() == 0 || ar.get(ar.size() - 1) != a1[i]) {
                    ar.add(a1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < l1) {
            if (ar.size() == 0 || ar.get(ar.size() - 1) != a1[i]) {
                ar.add(a1[i]);
                
            }
            i++;
        }
        while (j < l2) {
            if (ar.size() == 0 || ar.get(ar.size() - 1) != a2[j]) {
                ar.add(a2[j]);
               
            }
            j++;
        }

        for(int val : ar){
            System.out.print(val+" ");
        }

    }
}
