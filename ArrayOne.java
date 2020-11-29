public class ArrayOne {
    public static void main(String args[]) {
        
        // array
        int[] numArray = {1, 2, 3, 4, 10, 11};
        // defaultkan nilai 0
        int sum = 0;
     
    //  gunakan perulangan for
      
      for( int num : numArray) {
          sum += num;
      }
      System.out.println("hasilnya adalah "+sum);
    }
}