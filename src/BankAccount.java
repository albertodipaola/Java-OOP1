public class BankAccount {
    private String nome;
    private String codice;
    private int saldo;

    public BankAccount(String nome, String codice, int saldo) {
        this.nome = nome;
        this.codice = codice;
        this.saldo = saldo;
    }

    public String getNome() {return nome;}
    public String getCodice() {return codice;}
    public int getSaldo() {return saldo;}

    public void setNome(String nome) {this.nome = nome;}
    public void setCodice(String codice) {this.codice = codice;}
    public void setSaldo(int saldo) {this.saldo = saldo;}

    public void prelievo(int denaro) {
        if (denaro > getSaldo()) {
            System.out.println("Denaro insufficiente");
        } else {
            setSaldo(this.saldo -= denaro);
        }
    }
    public void ricarica(int denaro) {
        setSaldo(this.saldo += denaro);
    }

    public void vediSaldo() {
        System.out.println("il saldo è di $"+ getSaldo());
    }
}