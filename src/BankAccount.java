/**
 * @Author: Zhouhe Zhang
 * @Date: 2023-02-25-17:14
 * @Description:
 */
public class BankAccount extends Bank{


    public BankAccount(int accNo,String accName,int age){
        super(accNo,accName,age);
    }
    public BankAccount(String accName, int accNo,int age){
        super(accNo,accName,age);
    }


}
