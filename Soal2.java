
package soal2;

public class Soal2 {
    public int[] reverse(int data[]){
        int temp = 0;
        for (int i = 0; i < data.length/2; i++) {
            temp = data[i];
            data[i]=data[data.length-i-1];
            data[data.length-i-1]=temp;
        }
        return data;
    }
    public static void main(String[] args) {
        Soal2 test = new Soal2();
        int dataArray[] = {19,22,3,28,26,17,18,4,28,0};

        test.reverse(dataArray);
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i]+",");
        }
    }
    
}
