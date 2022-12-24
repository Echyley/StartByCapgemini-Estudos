package objetos;

/*SE QUISER ENTENDER MELHOR LEIA O CÓDIGO JUNTO COM AS ANOTAÇÕES EM WORD NA PARTE DE P.O.O NA PÁGINA 9!!! */

import java.util.Scanner;
/*modificador de acesso
 *👇 , public deixa o código aberto publicamente.
*/
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* "new (+ class)" tranforma essa variável em não primitiva */
        Pessoa objetoPessoa = new Pessoa();

        System.out.println("Digite o peso.");
        objetoPessoa.setPeso = sc.nextFloat();
        System.out.println("Digite sua altura.");
        objetoPessoa.setaltura = sc.nextFloat();

        

        System.out.println("IMC:" + objetoPessoa.calcularImc());
    }
}