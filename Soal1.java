package soal1;

public class Soal1 {
    public void gambar(int panjang){
        if(panjang%2==1){
            for (int i = 0; i < panjang; i++) {
                for (int j = 0; j < panjang; j++) {
                    if (j==0) {
                        System.out.print("* ");
                    }else if(j==panjang-1){
                        System.out.print("* ");
                    }else if(i==(panjang/2)){
                        System.out.print("* ");
                    }else{
                        System.out.print("= ");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.println("Parameter harus bernilai ganjil");
        }
    }
    public static void main(String[] args) {
        Soal1 test = new Soal1();
        test.gambar(5);
    }
    
}
