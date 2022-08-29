import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o parametro numero 1");
        int p1 = s.nextInt();

        System.out.println("Digite o parametro numero 2");
        int p2 = s.nextInt();

        try{
            contar(p1,p2);
        }catch(ParametrosInvalidosExeption e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar( int p1, int p2)throws ParametrosInvalidosExeption{
        
        if(p1 > p2){
            throw new ParametrosInvalidosExeption();
        }
        
        for(int i = p1; i <= p2; i++){
            System.out.println("Imprimindo o numero: " + i);
        }
    }

}
