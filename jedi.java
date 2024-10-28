public class jedi extends forca {
    public jedi(String nome, int vida) {
        super(nome, vida);
        setGenero("Jedi");
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

public class Sith extends forca {
    public Sith(String nome, int vida) {
        super(nome, vida);
        setGenero("Sith");
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
