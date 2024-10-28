public class Padawan extends Jedi {
    public Padawan(String nome, int vida) {
        super(nome, vida);
        setForca(20);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}

public class Cavaleiro extends Jedi {
    public Cavaleiro(String nome, int vida) {
        super(nome, vida);
        setForca(70);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}

public class MestreJedi extends Jedi {
    public MestreJedi(String nome, int vida) {
        super(nome, vida);
        setForca(100);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}

public class Aprendiz extends Sith {
    public Aprendiz(String nome, int vida) {
        super(nome, vida);
        setForca(40);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}

public class Lord extends Sith {
    public Lord(String nome, int vida) {
        super(nome, vida);
        setForca(80);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}

public class MestreSith extends Sith {
    public MestreSith(String nome, int vida) {
        super(nome, vida);
        setForca(120);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
