package br.lpm.main;

import br.lpm.business.Frota;
import br.lpm.business.Motorista;
import br.lpm.business.Oficina;
import br.lpm.business.Mecanico;
import br.lpm.business.Manutencao;
import br.lpm.business.Veiculo;
import br.lpm.business.Rota;


public class Main {
    private static Frota frota = new Frota();

    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Luan Silveira");
        Motorista motorista2 = new Motorista("Emília Valadares");

        Oficina oficina1 = new Oficina("Oficina do Carlão", "Rua Jajaras, 100");
        Oficina oficina2 = new Oficina("Oficina Pneu Mais", "Rua da Paixão, 98");
        Mecanico mecanico1 = new Mecanico("Pietro Romeu", oficina1);
        Mecanico mecanico2 = new Mecanico("Reinaldo Gonçalves", oficina2);

        Veiculo veiculo1 = new Veiculo("FORD CAR", 2020, "KPC-2050", 200);
        Veiculo veiculo2 = new Veiculo("CHEVROLET HILUX", 2015, "AFG-7878", 5000);

        frota.newRota(motorista1, veiculo1, "São Paulo", "Rio de Janeiro");
        frota.newRota(motorista2, veiculo2, "Salvador", "Goiânia");

        frota.addVeiculo(veiculo1);
        frota.addVeiculo(veiculo2);

        oficina1.addVeiculoToManutencao(veiculo1);
        oficina1.addVeiculoToManutencao(veiculo2);

        exibirMotoristas(motorista1, motorista2);
        exibirMecanicos(mecanico1, mecanico2);
        exibirVeiculos();
        exibirRotas();
        exibirManutencoes(oficina1);
    }

    public static void exibirMotoristas(Motorista... motoristas) {
        System.out.println("Motoristas cadastrados:");
        for (Motorista motorista : motoristas) {
            System.out.println(motorista); 
        }
    }

    public static void exibirMecanicos(Mecanico... mecanicos) {
        System.out.println("Mecânicos cadastrados:");
        for (Mecanico mecanico : mecanicos) {
            System.out.println(mecanico); 
        }
    }

    public static void exibirVeiculos() {
        System.out.println("Veículos cadastrados na frota:");
        for (Veiculo veiculo : frota.getAllVeiculos()) {
            if (veiculo != null) {
                System.out.println(veiculo); 
            }
        }
    }

    public static void exibirRotas() {
        System.out.println("Rotas cadastradas:");
        Rota[] rotas = frota.getAllRotas();
        for (Rota rota : rotas) {
            if (rota != null) {
                System.out.println(rota);
            }
        }
    }
    
    public static void exibirManutencoes(Oficina oficina) {
        System.out.println("Manutenções cadastradas:");
        Manutencao[] manutencoes = oficina.getAllManutencoes();
        for (Manutencao manutencao : manutencoes) {
            if (manutencao != null) {
                System.out.println(manutencao); 
            }
        }
    }
}
