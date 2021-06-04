public class qs {

    public static void quickSort(int[] q, int begin, int end){
        if(begin > end) {
            return;
        }
        
        int base = q[begin];
        int i = begin, j = end;
        while(i != j) {
          
            while(q[j] >= base && i < j) {
                j--;
            }

           
            while(q[i] <= base && i < j) {
                i++;
            }

           
            if(i < j) {
                int tmp = q[i];
                q[i] = q[j];
                q[j] = tmp;
            }
        }

        // 将基准数放到中间的位置（基准数归位）
        q[begin] = q[i];
        q[i] = base;

        
        quickSort(q, begin, i - 1);
        quickSort(q, i + 1, end);
    }




    public static void main(String[] args) {
        int[] q = {51,14,141, 12, 141, 21, 9, 121};
        quickSort(q, 0, q.length - 1);
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }

    }
}
