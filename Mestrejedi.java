public class MestreJedi extends jedi implements Raios {
    public MestreJedi(String nome, int vida) {
        super(nome, vida);
        setForca(100);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void usarRaio() {
        System.out.println(this.nome + " usa o raio " + cor + " com força extra de " + forcaExtra);
    }
}

public class MestreSith extends Sith implements Raios {
    public MestreSith(String nome, int vida) {
        super(nome, vida);
        setForca(120);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void usarRaio() {
        System.out.println(this.nome + " usa o raio " + cor + " com força extra de " + forcaExtra);
    }
}
