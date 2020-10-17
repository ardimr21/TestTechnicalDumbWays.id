package soal3;

public class Soal3 {
    public String removeDuplicate(String kata){
        char[] charKata = new char[kata.length()];
        String hasil="";
        int index = 0;
        //Mengubah String menjadi char
        for (int i = 0; i < kata.length(); i++) {
            charKata[i] = kata.charAt(i);
        }
        
        for (int i = 0; i < kata.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
               if (charKata[i] == charKata[j]) {
                   break;
               }
            }
            if(j==i){
//                charKata[index++] = charKata[i];
                hasil = hasil+charKata[j];
            }
         }
        
        return hasil;
    }
    
    public static void main(String[] args) {
        Soal3 test = new Soal3();
        String kata = "ccbabaccffpgkkklll";
        System.out.println(kata);
        String cek = test.removeDuplicate(kata);
        System.out.println(cek);
    }
    
}
