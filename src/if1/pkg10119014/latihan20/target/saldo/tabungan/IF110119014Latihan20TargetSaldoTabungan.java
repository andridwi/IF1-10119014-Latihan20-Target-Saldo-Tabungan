/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan20.target.saldo.tabungan;

/**
 *
 * @author USER
 */
public class IF110119014Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i;
    int Saldoawal = 3500000;
        
        for(i=1; i<=8; i++){
            double bunga = Saldoawal * 0.08;
            System.out.print("Saldo bulan ke-"+i+"Rp ");
            System.out.println(Saldoawal=(int)(Saldoawal+bunga));}
    }
    
}
