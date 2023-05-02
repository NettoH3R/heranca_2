public class Gato extends Animal {
    public void tipo(){
        System.out.println("Gato");
    }
    public void som(){
        System.out.println("Miau! Miau!");
    }

    public Gato(String nome){
        super(nome);
    }

    public void nome(){
        System.out.println("Nome do animal: " + nome);
    }
}
