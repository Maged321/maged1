package acount;
public class Acount1 {
    private int id;
private double balance ;
private double annualInterestRate ;
private java.util.Date dataCreated;
public Acount1(){
    id=0;
    balance =0;
    annualInterestRate =0;
dataCreated=new java.util.Date();
}
public Acount1(int id,double balance){
this.id=id;
this.balance=balance;
}
public int getID(){
return id;
}
public double getbalance(){
return balance;
}
public double getannualinterestrate(){
return annualInterestRate;
}
public String getDataCreated(){
return this.dataCreated.toString();
}
public void setID(int id)
{
    this.id=id;
}
public void setbalance(double balance )
{
    this.balance=balance;
}
public void setannualinterestrate(double annualinterestrate)
{
    this.annualInterestRate=annualinterestrate;
}
public double getMonthlyannualinterestrate()
{
    return((annualInterestRate/100)/12);
}
public double getannualbalance(){
return balance*getMonthlyannualinterestrate();
}
public void Withdraw(double amount)
{
this.balance-=amount;
}
public void deposit(double amount){
this.balance+=amount;
}
public void printall(){
System.out.println("Balance= "+balance +"\n"+"Monthly annualinterestrate= "+getannualbalance()+"\n"+"Data Created= "+getDataCreated());
}

}

    

