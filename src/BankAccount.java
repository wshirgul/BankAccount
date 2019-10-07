import java.util.ArrayList;
import java.util.Collections;

public class BankAccount implements Comparable, Measurable {
    private float balance;
    private float rate;

    @Override
    public float getMeasure() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }

    public int compareTo(Object other){
        BankAccount o = (BankAccount) other;
        if (this.balance > o.balance){
            return 1;
        } else if(this.balance < o.balance){
            return -1;
        } else {
            return 0;
        }
    }


    public BankAccount(float rate){
        this.balance = 0;
        this.rate = rate;
    }

    public BankAccount(float balance, float rate){
        this.balance = balance;
        this.rate = rate;
    }

    public float processYear(){
        float interest = this.balance * this.rate;
        return this.balance = this.balance + interest;
    }

    public float processNYears(int year){
        int i = 0;
        float total = 0;
        while (i < year) {
         total = processYear();
            i = i + 1;
        }
        return total;
    }

    public static void main(String [] args) {

       // BankAccount account = new BankAccount();
       // account.balance=1000;
        //account.rate=.1f;

        Measurable account1 = new BankAccount(4000, .2f);

        Measurable account2 = new BankAccount(2200,.5f);

        Measurable account3 = new BankAccount(3000,.1f);

        ArrayList<Measurable> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        //Collections.sort(list);

        float average = Data.computeAvg(list);
        System.out.println("bank acount balance average is " + average);

        System.out.println("The list of bank accounts after sorting: ");

        System.out.println(list);

     //   System.out.println(account2.processNYears(2));

     //   System.out.println(account1.processNYears(2));
     //   System.out.println(account1.compareTo(account2));

    }



}
