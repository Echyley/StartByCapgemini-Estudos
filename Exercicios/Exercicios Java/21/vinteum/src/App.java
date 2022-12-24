<<<<<<< HEAD
<<<<<<< HEAD
package VinteUm;

import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
           
        String nome, sexo;
        int idade, saude, total;
        
        total = 0;

        for(int i = 0; i <= 2; i++){
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual o seu sexo?");
        sexo = sc.nextLine();
        System.out.println("Qual o sua idade?");
        idade = sc.nextInt();
        System.out.println("Qual o sua saúde? Apenas diga 1 para boa ou 2 para má.");
        saude = sc.nextInt();
        sc.nextLine();

        if ((idade >= 18) || (saude == 1)) {
           System.out.println("Você está apto para o serviço militar :C");
           total += 1;
           System.out.println("Total Aptos: "+ total);
        } else {
           System.out.println("Você não está apto para o serviço militar :D");           
        }
      }      
    }
=======
package VinteUm;

import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
           
        String nome, sexo;
        int idade, saude, total;
        
        total = 0;

        for(int i = 0; i <= 2; i++){
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual o seu sexo?");
        sexo = sc.nextLine();
        System.out.println("Qual o sua idade?");
        idade = sc.nextInt();
        System.out.println("Qual o sua saúde? Apenas diga 1 para boa ou 2 para má.");
        saude = sc.nextInt();
        sc.nextLine();

        if ((idade >= 18) || (saude == 1)) {
           System.out.println("Você está apto para o serviço militar :C");
           total += 1;
           System.out.println("Total Aptos: "+ total);
        } else {
           System.out.println("Você não está apto para o serviço militar :D");           
        }
      }      
    }
>>>>>>> c0d2189e076aab68af073ee55219ee639f9a5db6
=======
package VinteUm;

import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
           
        String nome, sexo;
        int idade, saude, total;
        
        total = 0;

        for(int i = 0; i <= 2; i++){
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual o seu sexo?");
        sexo = sc.nextLine();
        System.out.println("Qual o sua idade?");
        idade = sc.nextInt();
        System.out.println("Qual o sua saúde? Apenas diga 1 para boa ou 2 para má.");
        saude = sc.nextInt();
        sc.nextLine();

        if ((idade >= 18) || (saude == 1)) {
           System.out.println("Você está apto para o serviço militar :C");
           total += 1;
           System.out.println("Total Aptos: "+ total);
        } else {
           System.out.println("Você não está apto para o serviço militar :D");           
        }
      }      
    }
>>>>>>> deebbbfb64118bec7d3f89ae9d216116d04f9b27
}