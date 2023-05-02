public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal("#");
        Cachorro dog1 = new Cachorro("neguinha");
        Gato cat1 = new Gato("Miauzinho");
        
        dog1.nome();
        animal.tipo();
        dog1.tipo();

        animal.som();
        dog1.som();
        
        System.out.println("\n");

        cat1.nome();
        animal.tipo();
        cat1.tipo();

        animal.som();
        cat1.som();
    }
}
