public class Main {
    public static void main(String[] args) {
        Funzioni funzioni = new Funzioni();

        // autoboxing
        int intPrimitivo = 10;
        double doublePrimitivo = 25.5;
        char charPrimitivo = 'X';

        Integer intOggetto = intPrimitivo;
        Double doubleOggetto = doublePrimitivo;
        Character charOggetto = charPrimitivo;

        // unboxing
        Integer intOggetto2 = Integer.valueOf(30);
        Double doubleOggetto2 = Double.valueOf(50.69);
        Character charOggetto2 = Character.valueOf('Y');

        int intPrimitivo2 = intOggetto2;
        double doublePrimitivo2 = doubleOggetto2;
        char charPrimitivo2 = charOggetto2;

        funzioni.sommaInt(intPrimitivo, intPrimitivo2);
        funzioni.stampaChar(charPrimitivo);
        funzioni.sommaInteger(intOggetto, intOggetto2);
        funzioni.stampaCharacter(charOggetto2);
    }
}