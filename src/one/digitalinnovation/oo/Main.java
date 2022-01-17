package one.digitalinnovation.oo;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("vermelho");
        carro.setModelo("Prisma");
        carro.setCapacidadeTanque(40);

        System.out.println("-----\tCaracterísticas do carro:\t-----");
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Tanque: " + carro.getCapacidadeTanque() + " Litros");
        System.out.println("Total para encher o tanque: R$" + carro.valorEncherTanque(6.50) + "\n");

        Carro carro1 = new Carro("Prata", "Mercedes-Benz Classe C", 66);

        System.out.println("-----\tCaracterísticas do carro:\t-----");
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Tanque: " + carro1.getCapacidadeTanque() + " Litros");
        System.out.println("Total para encher o tanque: R$" + carro1.valorEncherTanque(6.50));
    }
}
