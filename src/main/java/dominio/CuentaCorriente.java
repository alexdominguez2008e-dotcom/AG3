package dominio;

public class CuentaCorriente {
    private int numcuenta;
    private double saldo;
    private String titular;
    private final int DESCUBIERTO;

    public CuentaCorriente(String titular,int numcuenta){
        this.titular= titular;
        this.numcuenta= numcuenta;
        this.saldo= 0;
        this.DESCUBIERTO = 500;
    }
    public CuentaCorriente(String titular,int numcuenta,double saldo, int descubierto){
        this.titular = titular;
        this.numcuenta = numcuenta;
        this.saldo = saldo;
        this.DESCUBIERTO = descubierto;
    }
    public String getTitular(){return titular;}
    public void setTitular(String titular){this.titular = titular;}
}
