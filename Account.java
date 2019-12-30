
package ObjectOriented;

public class bankAccount {
    //create five field variables for bankAccount
    private String accountNum;
    private double accountBalance;
    private String accountName;
    private String accountEmail;
    private String accPhoneNumber;
    //create getter and setter for each of the field variables;
    public String getAccountNum(){
        return this.accountNum;
    }
    public void setAccountNum(String accountNum){
        this.accountNum= accountNum;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance= accountBalance;
    }
     public String getAccountEmail(){
        return this.accountEmail;
    }
    public void setAccountEmail(String accountEmail){
        this.accountEmail= accountEmail;
    }
     public String getAccPhoneNumber(){
        return this.accPhoneNumber;
    }
    public void setAccPhoneNumber(String accPhoneNumber){
        this.accPhoneNumber= accPhoneNumber;   
    }
    // validate if amount credited is negative or is not a number or   
    //is not an infinitity
    public double creditAccount(double amount){
        if(amount<0.0||Double.isNaN(amount)||Double.isInfinite(amount)){
            System.out.println("Invalid Attempt: Attempted amount= "+amount);
            return -1;
        }
        else if(amount>=0.0){
        this.accountBalance +=amount;
        }
         return 1;
    }
     // validate if amount debited is negative or is not a number or   
    //is not an infinitity
    public double debitAccount(double amount){
        if(amount<0.0||Double.isNaN(amount)||Double.isInfinite(amount)){
            System.out.println("Invalid Attempt: Attempted amount= "+amount);
        }
    //Ensure that the debit amount is not greateer than the available amount    
        else if(this.accountBalance<amount){
            System.out.println("Insufficient Fund: Attempted amount= "+amount);
            System.out.println("Available Amount: "+accountBalance);
            return -1;
        }
        this.accountBalance-=amount;
        return 1;
    }
}
