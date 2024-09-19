package br.lpm.business;


    public class Mecanico extends Motorista {
        private Oficina oficina;

        public Mecanico(String nome, Oficina oficina) {
            super(nome);
            this.oficina = oficina;
        }

        @Override
        public String toString() {
            return "DADOS DO MECÂNICO : " +
                    "\n NOME : " + nome +
                    "\n ID : " + id +
                    "\n Oficina : " + oficina.getNome() +
                    "\n";
        }
    }


