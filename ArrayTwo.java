// mini max sum

public class ArrayTwo {
    static void miniMaxSum(int[] arr) {
        long[] m = new long[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j != i){
                    m[i]+=arr[j];
                }
            }
        }
        long min = m[0];
        long max = m[0];
        for(int k=1;k<arr.length;k++){
            if(m[k]<min){
                min=m[k];
            }
            if(m[k]>max){
                max=m[k];
            }
        }
        System.out.print(min + " " + max);

    }
}