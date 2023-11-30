public class CarroPasseio extends Carro {
     public int velocidadeMaxima;
    public CarroPasseio() { }
    public CarroPasseio(String string, String string2, int i, int j, Motor motorCarroPasseio) {
    }
    public void acelerar() {
        System.out.println("\nAcelerando o Carro de Passeio!\n");
    }

    public void setCarroPasseio(String marca, String modelo, int ano) {
        super.setCarroInfo(marca, modelo, ano);
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    private String getModelo() {
        return modelo;
    }
    private String getMarca() {
        return marca;
    }

    private int getAno() {
        return ano;
    }
    @Override
    public String toString() {
        return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Velocidade Máxima: " + velocidadeMaxima;
    }


}
