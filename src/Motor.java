// Classe Motor
public class Motor {
    private String tipo;
    private int potencia;
    public Motor() { }
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    @Override
    public String toString() {
        return "Motor: " + tipo + ", Potência: " + potencia + " HP\n";
    }

}
