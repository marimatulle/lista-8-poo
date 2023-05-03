public class AnimaisTeste {
    public static void main(String[] args) throws Exception {
        Animal animal1, animal2, animal3;

        animal1 = new Cachorro();
        animal1.emitirSom();

        animal2 = new Gato();
        animal2.emitirSom();

        animal3 = new Preguica();
        animal3.emitirSom();
    }
}
