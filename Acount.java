package acount;
public class Acount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Acount1 cl1=new Acount1();
        cl1.setID(1322);
        cl1.setbalance(21000);
        cl1.setannualinterestrate(5.5);
        cl1.Withdraw(2600);
        cl1.deposit(4000);
        cl1.printall();
    }
    
}
