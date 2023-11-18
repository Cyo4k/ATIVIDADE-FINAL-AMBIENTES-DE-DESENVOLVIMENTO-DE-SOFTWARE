public class main {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 200.0);



        // Criando um objeto "meuCarro" da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023, motor);



        // Rodando o carro por 100 quilômetros
        meuCarro.rodar(100);

        // Obtendo a quilometragem atual e imprimindo-a
        System.out.println("------------Carro Passeio-----------");
        meuCarro.ligarCarro();
        System.out.println("************");
        System.out.println("Marca: " + meuCarro.obterMarca());
        System.out.println("Modelo: " + meuCarro.obterModelo());
        System.out.println("Ano: " + meuCarro.obterAno());
        System.out.println("Quilometragem atual: " + meuCarro.obterQuilometragem()+"\n");

        // Criando um objeto "carroEsportivo" da classe CarroEsportivo
        Motor motorCarroEsportivo = new Motor("Gasolina", 350.0);
        CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari", "F40", 2023, 350.0,motorCarroEsportivo);

        carroEsportivo.rodar(100);



        // Imprimindo todas as informações do carro esportivo usando o método toString sobrescrito
        System.out.println("------------Carro Esportivo-----------");
        carroEsportivo.ligarCarro();
        System.out.println("************");
        // Acelerando o carro esportivo
        carroEsportivo.acelerar();
        System.out.println(carroEsportivo.toString() + "\n");
    }
}
