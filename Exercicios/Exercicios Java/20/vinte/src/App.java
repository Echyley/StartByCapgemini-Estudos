import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
       
        double desconto, total;
        int anoCarro, valor, calculo;

        System.out.println("Digite 1 para Sim.");
        System.out.println("Digite 2 para Não.");
        System.out.println("Deseja calcular o valor dos carros com o desconto?");
        calculo = sc.nextInt();

        for(int i = 0; i <= 5; i++){
        switch (calculo){           
            case 1:
                System.out.println("Qual o ano do carro?");
                anoCarro = sc. nextInt();
                System.out.println("Qual o valor inicial do carro?");
                valor = sc. nextInt();
            
            if (anoCarro >= 2001){
                desconto = valor * 0.7;
                total = valor - desconto;
                System.out.println("O valor total do carro com o desconto é:");
                System.out.println(valor-desconto);

            } else if (anoCarro <= 2000){
                desconto = valor * 0.12;
                total = valor - desconto;
                System.out.println("O valor total do carro com o desconto é:");
                System.out.println(valor-desconto);
            }
        }
    }
}
}
