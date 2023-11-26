public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int ano, double velocidadeMaxima, Motor motor) {
        super(marca, modelo, ano,motor);
        this.velocidadeMaxima = velocidadeMaxima;

    }

    // Método para acelerar o carro esportivo
    public void acelerar() {
        System.out.println("Carro esportivo acelerando! Velocidade máxima: " + velocidadeMaxima);
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocidade Máxima: " + velocidadeMaxima;
    }


}