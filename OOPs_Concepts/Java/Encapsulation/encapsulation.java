public class encapsulation{
    public static void main(String[] args) {
        Account act = new Account();
        act.setAcctno(1021400012);
        act.setAmount(50000);
        act.setName("Amish");
        act.setEmail("amish@tripahti.com");

        System.out.println("Account Details are as follows: ");
        System.out.println("Account No: "+act.getAcctno()+"\nAccount Name: "+act.getName()+"\nAmount Present: "+act.getAmount()+"\nEmail:"+act.getEmail());
    }
}


class Account{
    private int Acctno;
    private int Amount;
    private String Name;
    private String Email;

    public int getAcctno(){
        return Acctno;
    }

    public void setAcctno(int Acctno){
        this.Acctno = Acctno;
    }


    public int getAmount(){
        return Amount;
    }

    public void setAmount(int Amount){
        this.Amount = Amount;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

}









