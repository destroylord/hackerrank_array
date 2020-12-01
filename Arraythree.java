 //   Soal nomer 3 membuat tangga

public class Arraythree {
    public static void main(String args[]){

        int n = 6;
        // 
       for(int i = 0; i < n; i++) { // tinggi
            for(int j = 1; j <= n; j++) { // lebar
                System.out.print(i < n-j ? " " : "#");
            }
            System.out.print(""); // kosong
       } 

  } 
}