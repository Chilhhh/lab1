/**
 * @Author: Zhouhe Zhang
 * @Date: 2023-02-25-17:22
 * @Description:
 */


public class CurrentAccount extends Bank{
    public static final double limit=500.0;

    public CurrentAccount(int accNo,String accName,int age){
        super(accNo,accName,age);
    }
    public CurrentAccount(String accName, int accNo,int age){
        super(accName,accNo,age);
    }
    @Override
    public void withdraw(double amount){
        if(amount-getBalance()<limit){
            setBalance(getBalance()-amount);
            System.out.println("withdraw successfully");
        }
        else{
            System.out.println("Exceed overdraft limit! Please withdraw with overdraft of less than 500.");
        }
    }
}




