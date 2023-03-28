public class App {
    public static void main(String[] args) throws Exception {
        Auto a1 = new Auto("fiat", "500", 2015, "bianco");
        Auto a2 = new Auto("fiat", "500", 2015, "bianco");

        System.out.println(a1.equals(a2));
        

        BankAccount ba = new BankAccount("pietro", "oashfn23nj32", 1000);
        ba.prelievo(1200);
        ba.prelievo(200);
        ba.vediSaldo();
        ba.ricarica(300);
        ba.vediSaldo();
    }
}
