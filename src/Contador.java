import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        //TODO: coletar primeiro e segundo numero
        System.out.println("Me de o primeiro número");
        int numero1 = sc.nextInt();

        System.out.println("me de o segundo número");
        int numero2 = sc.nextInt();

        contar(numero1, numero2);
    }catch(ParametroInvalidoException e){
        System.out.println("ops.. o primeiro número deve ser menor que o segundo");
    }

        //criar classe de exceçao;
        //caso o primeiro número for maior que o segundo  printar exeção
    }

    static void contar(int numero1, int numero2) throws ParametroInvalidoException{
        if(numero1>=numero2){
            throw new ParametroInvalidoException();
        }
       int  contador = numero2 -numero1;

       for(int i = 0; i < contador; i++){
        System.out.println("contando:" + i);
        
        try{
            Thread.sleep(1000);
       }catch(InterruptedException e){
        System.out.println("contagem interrompida");
       }

       
       }

    }
}


