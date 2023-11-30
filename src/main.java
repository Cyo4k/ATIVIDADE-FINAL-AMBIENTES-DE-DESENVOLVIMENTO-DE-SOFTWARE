public class main {
    public static void main(String[] args) {
        // 1° Chamada, Informações do carro

        System.out.println("--- 1° Chamada, Informações do carro ---");
        Carro meuCarro = new Carro();
        meuCarro.setCarroInfo("Toyota", "Corolla", 2022);
        System.out.println("\n" + meuCarro + "\n");

        // 2° Chamada, Quilometragem do carro
        System.out.println("--- 2° Chamada, Quilometragem do carro ---");
        meuCarro.rodar(100);
        meuCarro.rodar(-100);
        meuCarro.rodar(50);
        meuCarro.rodar(73);
        meuCarro.rodar(122);
        meuCarro.rodar(-3);
        System.out.println();
        System.out.println("Quilometragem: " + meuCarro.getQuilometragem() + "\n");

        // 3° Chamada, Acelerando o carro Esportivo
        System.out.println("--- 3° Chamada, Acelerando o carro esportivo ---");
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo();
        meuCarroEsportivo.acelerar();
        meuCarroEsportivo.setCarroEsportivo("Ferrari", "488 GBT", 2023);
        meuCarroEsportivo.setVelocidadeMaxima(330);
        System.out.println( meuCarroEsportivo );
        System.out.println();

        // 4° Chamada, Potencia do Motor
        System.out.println("--- 4° Chamada, Potencia do Motor ---");
        Motor motorCarro = new Motor("V8", 500);
        Carro meuCarroComMotor = new Carro();
        meuCarroComMotor.setCarroInfo("Chevrolet", "Camaro", 2023);
        meuCarroComMotor.ligar();
        System.out.println(motorCarro);
        System.out.println(meuCarroComMotor.toString()+ "\n");

        // 5° Chamada, Acelerando o carro de Passeio
        System.out.println("--- 5° Chamada, Acelerando o carro de Passeio ---");
        CarroPasseio meuCarroPasseio = new CarroPasseio();
        meuCarroPasseio.acelerar();
        meuCarroPasseio.setCarroPasseio("Fiat", "Siena", 2023);
        meuCarroPasseio.setVelocidadeMaxima(60);
        System.out.println( meuCarroPasseio );
        System.out.println();
    }
}
