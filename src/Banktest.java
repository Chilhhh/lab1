import java.time.temporal.ChronoUnit;
import java.util.*;
/**
 * @Author: Zhouhe Zhang
 * @Date: 2023-02-25-17:38
 * @Description:
 */
public class Banktest {
    public static void main(String[] args) {
        ArrayList<Bank> BankType=new ArrayList<Bank>();

        Bank B_1=new BankAccount(14214,"Cindy",20);
        Bank B_2=new CurrentAccount(12564,"Kitty",35);
        Bank B_3=new JuniorAccount(15524,"Jack",3);
        BankType.add(B_1);
        BankType.add(B_2);
        BankType.add(B_3);


        BankType.get(0).deposit(1000);
        BankType.get(1).deposit(1000);
        BankType.get(2).deposit(1000);

        System.out.println(BankType.get(0).toString());
        while(!BankType.get(0).Isoverdraft(50)){
            BankType.get(0).withdraw(50);
            BankType.get(0).Check_balance();
        }

        System.out.println(BankType.get(1).toString());
        while(!BankType.get(1).Isoverdraft(50)){
            BankType.get(1).withdraw(50);
            BankType.get(1).Check_balance();
        }

        System.out.println(BankType.get(2).toString());
        while(!BankType.get(2).Isoverdraft(50)){
            BankType.get(2).withdraw(50);
            BankType.get(2).Check_balance();
        }

    }
}
