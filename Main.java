public class Main {
    public static void main(String[] args) {
        padawan padawan = new padawan("Anakin", 100);
        Cavaleiro cavaleiro = new Cavaleiro("Obi-Wan", 150);
        MestreJedi mestreJedi = new MestreJedi("Yoda", 200);

        Aprendiz aprendiz = new Aprendiz("Darth Maul", 120);
        Lord lord = new Lord("Darth Vader", 180);
        MestreSith mestreSith = new MestreSith("Darth Sidious", 250);

        padawan.atacar(aprendiz);
        cavaleiro.atacar(lord);
        mestreJedi.usarRaio();
        mestreSith.usarRaio();
    }
}
