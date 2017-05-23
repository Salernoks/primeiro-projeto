
import java.util.Random;


public class teste1 {
    static int aleatorio1(){
     int numero = 0;
        int[] num = new int[5];
        Random r = new Random();
        for(int i=0; i<num.length; i++){
             numero = r.nextInt(20) + 1;
             for(int j=0; j<num.length; j++){
                   if(numero == num[j] && j != i){
                         numero = r.nextInt(100) + 1;
                   }else{
                        num[i] = numero;
                   }
             }
        }
       
        return numero;
}
    public static void main(String[] args) {
       int n = aleatorio1();
        System.out.println(n);
    
   
      
    }
}

    


