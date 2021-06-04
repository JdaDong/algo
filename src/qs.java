public class qs {

    public static void quickSort(int[] q, int begin, int end){
        if(begin > end) {
            return;
        }
        // base中存放基准数
        int base = q[begin];
        int i = begin, j = end;
        while(i != j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while(q[j] >= base && i < j) {
                j--;
            }

            // 再从左往右边找，直到找到比base值大的数
            while(q[i] <= base && i < j) {
                i++;
            }

            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if(i < j) {
                int tmp = q[i];
                q[i] = q[j];
                q[j] = tmp;
            }
        }

        // 将基准数放到中间的位置（基准数归位）
        q[begin] = q[i];
        q[i] = base;

        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
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
