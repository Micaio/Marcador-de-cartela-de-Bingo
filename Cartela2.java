package cartela2;
import java.util.Scanner;
public class Cartela2{
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        metodosct2 micaio = new metodosct2();
           String nomes[];
           byte Qt,Qt2;
  
        Qt= micaio.quantas();
        nomes=micaio.nomescartelas(Qt);
       // micaio.mostravS(nomes, Qt);
        System.err.println("Quantos numeros tem a sua  cartela?");
        Qt2 = input.nextByte();
        int cartelasEn[][] = new int[Qt][Qt2];
        micaio.preencherNum(cartelasEn, Qt, Qt2, nomes);
        micaio.mostracartelas(cartelasEn, Qt, Qt2, nomes);
        System.err.println("\n");
        micaio.marcacartela(cartelasEn, Qt, Qt2, nomes);
    }
          
    
}