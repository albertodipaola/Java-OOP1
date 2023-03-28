public class Animale {
    private String specie;
    private String classe;
    private boolean vertebrato;
    private int eta;
    private String habitat;

    //costruttore
    public Animale(String specie, String classe, Boolean vertebrato, int eta, String habitat) {
        this.specie = specie;
        this.classe = classe;
        this.vertebrato = vertebrato;
        this.eta = eta;
        this.habitat = habitat;
    }

    //getter
    public String getSpecie() {return this.specie;}
    public String getClasse() {return this.classe;};
    public boolean getVertebrato() {return this.vertebrato;};
    public int getEta() {return this.eta;};
    public String getHabitat() {return this.habitat;};

    //setter
    public void setSpecie(String specie) {this.specie = specie;}
    public void setClasse(String classe) {this.classe = classe;}
    public void setVertebrato(Boolean vertebrato) {this.vertebrato = vertebrato;}
    public void setEta(int eta) {this.eta = eta;}
    public void setHabitat(String habitat) {this.habitat = habitat;}
}