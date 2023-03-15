/**
 * @Author: Zhouhe Zhang
 * @Date: 2023-02-25-17:49
 * @Description:
 */
public class Bank {
    private int accNo;
    private int age;
    private String accName;
    private double balance;
    private boolean Suspend_flag = false;

    public Bank(int accNo,String accName){
        this.accNo=accNo;
        this.accName=accName;
        this.balance=0.0;
    }

    public Bank(int accNo,String accName,int age){
        this.accNo=accNo;
        this.accName=accName;
        this.balance=0.0;
        this.age=age;
    }
    public Bank(String accName, int accNo,int age){
        this.accNo = accNo;
        this.accName = accName;
        this.balance = 0.0;
        this.age=age;
    }
    public void Re_Instated(){
        setSuspend_flag(false);
        System.out.println("Your count is re-instated successfully! ");
    }
    public void Suspend(){
        setSuspend_flag(true);
        System.out.println("Your count is suspend successfully! ");
    }

    public void close() {
        System.out.println("Account of " + accName + " has been closed!");
    }


    public void deposit(double amount){
        if(Suspend_flag==false) {
            setBalance(getBalance() + amount);
            System.out.println("deposit successfully");
        }else{
            System.out.println("failed Operation: Your account is suspended");
        }
    }
    public void withdraw(double amount){
        if(Suspend_flag==false) {
            setBalance(getBalance() - amount);
            System.out.println("withdraw successfully");
        }else{
            System.out.println("failed Operation: Your account is suspended");
        }
    }
    public void Check_balance(){
        System.out.println(accName+ "'s Balance= "+ this.balance);
    }

    public boolean Isoverdraft(double amount){
        if(balance-amount<0){
            System.out.println(accName+ "'s account is overdraft!!");
            return true ;
        }
        return false;
    }


    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getSuspend_flag() {
        return Suspend_flag;
    }

    public void setSuspend_flag(boolean suspend_flag) {
        Suspend_flag = suspend_flag;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Account number: " + accNo
                + "\n" + "Account name: " + accName
                + "\n" + "Balance: "+ balance;
    }
}
