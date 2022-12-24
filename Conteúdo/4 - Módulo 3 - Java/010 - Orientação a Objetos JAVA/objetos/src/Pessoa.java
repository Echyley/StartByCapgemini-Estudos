package objetos;

public class Pessoa {
    /* Atributos da classe */
    /*private deixa o modificador de acesso como privado!*/
    private float peso;
    private float altura;

    /* Método */
    /* Nome do método 👇 */
    public float calcularImc() {
        float imc = peso / (altura * altura);
        return imc;
    }

    /*Métodos acessores */
    public void setPeso (float peso) {
        this.peso = peso;
    }

    public float getPeso () {
        return peso;
    }

    public void setAltura (float altura) {
        this.altura = altura;
    }

    public float getAltura () {
        return altura;
    }
}
