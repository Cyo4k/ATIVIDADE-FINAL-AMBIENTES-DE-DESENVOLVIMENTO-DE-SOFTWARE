public class CarroEsportivo extends Carro {
    public String marca;
    public String modelo;
    public int ano;
    public int quilometragem;
    public Motor motor;

    public Carro() { }

    public Carro(String chevrolet, String camaro, int i, Motor motorCarro) {
    }

    public void setCarroInfo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int rodar(int quilometro) {
        if (quilometro >= 0) {
            quilometragem += quilometro;
        }
        return quilometragem;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano;
    }

    public void ligar() {
        System.out.println("\nLigando o Carro...\n");
    }


}
