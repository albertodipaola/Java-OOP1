public class Auto {
    private String marca;
    private String modello;
    private int anno;
    private String colore;
    //private String[] colore = {"bianco", "nero", "rosso", "blu", "giallo", "grigio"};

    public Auto(String marca, String modello, int anno, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

    public boolean equals(Object object) {
        if (this==object) {return true;}
        if (object == null && object.getClass() != this.getClass()) {return false;}

        Auto auto = (Auto)object;
        if (this.marca == auto.marca && this.modello == auto.modello && this.anno == auto.anno && this.colore == auto.colore) {
            return true;
        }
        return false;
    }
}
