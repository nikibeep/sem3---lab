import java.io.*;
import  java.util.Scanner;
class Account{
    String cname;
    int anum;
    static int acc;
    private float bal;

    public Account() {
        acc++;
        cname = "";
        anum = -1;
        anum = acc;
    }

    static {
        System.out.println("hello");
    }

    public static void dispstatic() { //static function.
        System.out.println(acc);
    }
    public Account(String name){
        this.cname=name;
    }
    public Account(String name, int num){
        this(name); //constructor chaining
        this.anum=num;
    }

    public void read() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter customer name");
        cname = sc.next();
        System.out.println("Enter account number:");
        anum = sc.nextInt();
        System.out.println("Enter account balance");
        bal = sc.nextFloat();

        sc.close();
    }
    public void display(){
        System.out.println("Name:"+cname+"\nAccNum:"+anum+"\nBalance:"+ bal);
    }
}
class LoanAcc extends Account{
    float intRate;
    int amnSanc;    //thus this class will have these attributes + the 3 inherited attributes
    public LoanAcc(){
        super();    //super=immediate parent class.
        intRate=(float)0.0;
        amnSanc=0;
    }
    public LoanAcc(String name,int ano, float ir, int amnt){
        super(name,ano);
        this.intRate=ir; 
        amnSanc=amnt;
    }

    public void read() {
        try{
        super.read();
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter interest rate:");
        intRate=sc.nextFloat();
        System.out.println("Enter max amnt sanctioned:");
        amnSanc = sc.nextInt();
        sc.close();

    }       catch(Exception e){System.out.println(e.toString());}  //try catch exception handling example. not rly needed in this code
    }
    public void display(){
        super.display();
        System.out.println("\nInterest Rate:"+intRate+"\nSanctioned amount:"+amnSanc);
    }
}
class CarLoan extends LoanAcc{  //will have both the inherited class attributes and methods.
    String company;
    String model;
    int cost;
    public CarLoan(String name, int num, float ir, int amnt, String co, String mn, int c){
        super(name,num,ir,amnt);
        company=co; model=mn; cost=c;
    }
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name:");
        company = sc.nextLine();
        System.out.println("Enter model name:");
        model = sc.nextLine();
        System.out.println("Enter model cost:");
        cost = sc.nextInt();
        sc.close();
    }
    public void display(){
        super.display();
        System.out.println("\nCompany:"+company+"\nModel:"+model+"\nCost:"+cost);
    }
}

public class Inheritance { //since each parent-child is 1-1, this is all single inheritance. but it is multiLEVEL inheritance
    static { // static block.
        int x = 20;
        System.out.println(x);
    }

    public static void main(String[] args) {
       
        //Account a1 = new Account();
        Account.dispstatic();
        
        //a2.display();
        /*Account a1=new Account();
        a1.display();
        System.out.println("account number:" + a2.anum);
        
        Account o1 = new Account();
        LoanAcc l1 = new LoanAcc("name",234,(float)8.8,3333);
         o1.read();
         o1.display();
        l1.read();
        l1.display();
        CarLoan cl1 = new CarLoan("CustName",223,(float)6.8,1000,"Company","Model",10000);
        cl1.display();*/
        
    }
}