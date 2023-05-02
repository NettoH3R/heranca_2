public class Cachorro extends Animal {
    public void tipo(){
        System.out.println("Cachorro");
    }
    public void som(){
        System.out.println("Au! Au!");
    }
    public Cachorro(String nome){
        super(nome);
    }
    public void nome(){
        System.out.println("nome do Animal: " + nome);
    }
}
