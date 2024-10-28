public class forca {
    protected int forca;
    protected int vida;
    protected String genero;
    protected String nome;

    public forca(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(forca f) {
        System.out.println(this.nome + " ataca " + f.nome + " com força " + this.forca);
    }
}
