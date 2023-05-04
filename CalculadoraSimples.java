import java.util.Scanner;

public class CalculadoraSimples{


    public static void main(String[] args) {
        

        //Declaração de variavel
        int n1, n2, total, op;

        //Criação e instancia de objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\t\t\t -- Calculadora Simples -- \n");

            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            //Kauã Lira
            System.out.println("3. Multiplicação");
            System.out.println("4. Saída");

            System.out.print("Opção: ");
            op = entrada.nextInt();

            if(op == 1){
                //Thell
                System.out.println("\n\t\t\t -- Soma --\n");

                //Entrada
                System.out.print("Informe N1: ");
                n1 = entrada.nextInt();
                System.out.print("Informe N2: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 + n2;

                //Saída
                System.out.printf("%d + %d = %d" , n1, n2, total);

            } else if(op == 2){
                //Kauã Lira
                System.out.println("\n\t\t\t -- Subtração -- \n");

                //Entrada
                System.out.print("Informe N1: ");
                n1 = entrada.nextInt();
                System.out.print("Informe N2: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 - n2;

                //Saída
                System.out.printf("%d - %d = %d", n1, n2);
            } else if(op == 3){
                System.out.println("\n\t\t\t -- Multiplicação -- \n");

                //Entrada
                System.out.println("Informe N1: ");
                n1 = entrada.nextInt();
                System.out.println("Informe N2: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 * n2;

                //Saída
                System.out.printf("%d * %d = %d", n1, n2, total);

            } 
            else if(op == 4){
                System.out.println("Forte Abraço!");
            }else{
                System.out.println("Opção " + op + "incorreta!");
            }

        }while(op!=4);

    }


}