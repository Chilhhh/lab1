import java.time.LocalDate;
/**
 * @Author: Zhouhe Zhang
 * @Date: 2023-03-04-23:29
 * @Description:
 */

public class JuniorAccount extends Bank{
    private int  dailyDeposit=0;
    private LocalDate lastDepositDate=null;//上一次存款时间
    //When the account is set up, the deposit is marked 0

    public JuniorAccount(int accNo,String accName,int age){
        super(accNo,accName,age);
        if(age>16){
            this.Suspend();
            throw new IllegalArgumentException("Junior account is only available for customers under the age of 16.");
        }
    }
    public JuniorAccount(String accName, int accNo,int age){
        super(accName,accNo,age);
        if(age>=16){
            System.out.println("Sorry, it's only allowed for people under 16");
            this.Suspend();
        }
    }
    @Override
    public void withdraw(double amount) {
        if (!this.Isoverdraft(amount)) {
            if(lastDepositDate == LocalDate.now()) {
                if (amount + dailyDeposit <= 100) {
                    super.withdraw(amount);
                    dailyDeposit += amount;
                } else {
                    System.out.println("The maximum amount of your account can withdraw is 100/day");
                }
            }else{
                this.dailyDeposit = 0;
                this.lastDepositDate = LocalDate.now();
            }
        }
    }


}
