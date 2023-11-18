// Classe Motor
public class Motor {
    private String tipo;
    private double potencia;
    private boolean ligado;

    public Motor(String tipo, double potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.ligado = false; // O motor começa desligado
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Motor ligado.");
            ligado = true;
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Motor desligado.");
            ligado = false;
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public boolean estaLigado() {
        return ligado;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPotencia() {
        return potencia;
    }

}