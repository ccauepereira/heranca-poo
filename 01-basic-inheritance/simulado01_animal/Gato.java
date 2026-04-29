package simulado01_animal;

    public class Gato extends Animal {
        String pelagem;
        public Gato(String nome, int idade,String pelagem) {
            super(nome, idade);
            this.pelagem = pelagem;
        }

        public void setPelagem(String pelagem){
            this.pelagem = pelagem;
        }
        public String getPelagem(){
            return this.pelagem;
        }

        @Override
        public void emitirSom(){
            System.out.println("Miau miau!! EU sou uma gatinha ");
        }

        @Override
        public String toString() {
            String r;
            r = "\n=== GATO ===" + super.toString() + "\nRaça: " + this.pelagem;
            return r;
        }
    }
