public class TesteAnimal {
    public static void main(String[] args) {
       Animal animalDog = new Cachorro();
        if (animalDog instanceof Cachorro) {
            Cachorro doguinho = (Cachorro) animalDog;
        } else {
            System.out.println("O objeto não é um cachorro.");
        }
    }
}
