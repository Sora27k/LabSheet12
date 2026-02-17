package Banking;

public abstract class BankAccount {
    private String accId;
    private  double accBalance;
    private  final String filename = "src/Banking/users_account.txt";

    public BankAccount(String accId,double accBalance){
        this.accBalance = accBalance;
        this.accId = accId;
    }

    public BankAccount(String accId){
        this.accId = accId;
    }

    public BankAccount(){
        this.accId ="";
        this.accBalance = 0.0;
    }

    public String getAccId(){
        return this.accId;
    }

    public void setAccBalance(double accBalance){
        this.accBalance = accBalance;
    }
    public  double getAccBalance(){
        return this.accBalance;
    }

    public String getFilename(){
        return this.filename;
    }

    public  String toString(){
        return accId + "," + accBalance;
    }

    public abstract void despoit();
}
