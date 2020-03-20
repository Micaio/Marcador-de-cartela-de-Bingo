package cartela2;
import java.util.Scanner;
public  class metodosct2{
     static  int vamos[] = new int[10];
    //quantas cartelas.
     byte quantas(){
        Scanner input = new Scanner(System.in);
        System.err.println("Quantas cartelas vc  deseja marca?");
        byte x = input.nextByte();
      
        
        return x;
    }
    //colocar  os nomes
    String[] nomescartelas(byte x){
       Scanner input = new Scanner(System.in);
        byte z =0;
        String nomes[] = new String[x];
        for(byte y =0;y<x;++y){
            System.err.println("Informe o nome da " + (z+1) + "º cartela.");
            nomes[y] = input.nextLine();
            z++;
        }
        
        
      return nomes;  
    }
    
    void mostravS(String[] x,byte y){
        
        for(int h =0;h<y;++h){
            System.err.println("->" + x[h] );   
        }
        
        
    }
    //pegar  os numeros das   cartelas.
    int[][] preencherNum(int[][] cartelasEn,byte Qt,int Qt2,String[] nomes){
        Scanner input = new Scanner(System.in);
        int z =0;
        for(byte x =0;x<Qt;x++){
            for(int y =0;y<Qt2;y++){
                System.err.println("Informe a " + (z+1) + "º pedra da  cartela " + nomes[x] + ".");
                cartelasEn[x][y] = input.nextInt();
               z++;
            }z =0;
        }
        
        
        return cartelasEn;
    }
    //mostra nomes com  numeros das  cartelas.
    void mostracartelas(int[][] cartelasEn,byte Qt,int Qt2,String[] nomes){
        int z=0;
        for(int x = 0;x<Qt;x++){
            System.err.print("\nCartela " + nomes[x] + ":\n");
            for(int y=0;y<Qt2;++y){
                 System.err.print(cartelasEn[x][y] + "\t");
                
                
            }z=0;
        }
        
        
    }
    //marcar  cartela
    void marcacartela(int[][] cartelasEn,byte Qt,int Qt2,String[] nomes){
        Scanner input = new Scanner(System.in);
        int z=0,PD =0,ju=0;
        for(int g =0;g<=75;++g){
        System.err.println("Informe a " + (z+1) + "º pedra chamada.");
        PD = input.nextInt();
        for(byte x =0;x<Qt;++x){
            for(int y =0;y<Qt2;++y){
                if(cartelasEn[x][y] == PD){
                  ju = soma(x,nomes,Qt2);
                    if(ju != 0){
                        g = ju;
                    }
                }
            }
        }z++;
       }
    }
    //informa quando uma  cartela estiver preenchida.
  int soma(int y,String[] kk,int z){
        int x=0;
        
        y=y+1;
       
        switch(y){
           
              case 1:
                  vamos[0]++;
                  System.err.println("A  cartela " + kk[0] + " marcou " + vamos[0] + " vez.");
               if(vamos[0]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[0] + " bateu!========");
                   x=76;
               }
                break;
              case 2:
                 vamos[1]++;
                  System.err.println("A  cartela " + kk[1] + " marcou " + vamos[1] + " vez.");
               if(vamos[1]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[1] + " bateu!========");
                   x=76;
               }
                break;
              case 3:
                vamos[2]++;
                  System.err.println("A  cartela " + kk[2] + " marcou " + vamos[2] + " vez.");
               if(vamos[2]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[2] + " bateu!========");
                   x=76;
               }
                break;
              case 4:
                 vamos[3]++;
                  System.err.println("A  cartela " + kk[3] + " marcou " + vamos[3] + " vez.");
               if(vamos[3]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[3] + " bateu!========");
                   x=76;
               }
                break;
              case 5:
                  vamos[4]++;
                  System.err.println("A  cartela " + kk[4] + " marcou " + vamos[4] + " vez.");
               if(vamos[4]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[4] + " bateu!========");
                   x=76;
               }
                break;  
              case 6:
                  vamos[5]++;
                  System.err.println("A  cartela " + kk[5] + " marcou " + vamos[5] + " vez.");
               if(vamos[5]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[5] + " bateu!========");
                   x=76;
               }
                break;
              case 7:
                  vamos[6]++;
                  System.err.println("A  cartela " + kk[6] + " marcou " + vamos[6] + " vez.");
               if(vamos[6]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[6] + " bateu!========");
                   x=76;
               }
                break; 
              case 8:
                  vamos[7]++;
                  System.err.println("A  cartela " + kk[7] + " marcou " + vamos[7] + " vez.");
               if(vamos[7]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[7] + " bateu!========");
                   x=76;
               }
                break;
              case 9:
                  vamos[8]++;
                  System.err.println("A  cartela " + kk[8] + " marcou " + vamos[8] + " vez.");
               if(vamos[8]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[8] + " bateu!========");
                   x=76;
               }
                break;
              case 10:
                  vamos[9]++;
                  System.err.println("A  cartela " + kk[9] + " marcou " + vamos[9] + " vez.");
               if(vamos[9]==z){
                   System.err.println("======Parabéns,  a  cartela " + kk[9] + " bateu!========");
                   x=76;
               }
                break;
              default:
        }
        
        
        return x;
    }
    
    
}