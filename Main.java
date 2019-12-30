package ObjectOriented;

public class Main {
    public static void main (String args[]){
       bankAccount acc= new bankAccount();
        acc.setAccountBalance(500);
        System.out.println(acc.getAccountBalance());
        acc.creditAccount(700);
         System.out.println(acc.getAccountBalance());
        acc.debitAccount(2000);
        acc.setAccPhoneNumber("08160419014");
        acc.setAccountNum("0163575367");
        acc.setAccountEmail("salaudeen.lawal@st.futminna.edu.ng");
        System.out.println();
        System.out.println("Account Phone Number: "+ acc.getAccPhoneNumber());
        System.out.println();
        System.out.println("Account Number: "+ acc.getAccountNum());
        System.out.println();
        System.out.println("Account Email: "+ acc.getAccountEmail());
    
         }