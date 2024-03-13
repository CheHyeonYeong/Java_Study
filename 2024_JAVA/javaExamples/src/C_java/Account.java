package C_java;

class Account {
    String name ;
    String password;
    int accountNum;
    int money;
    double percent;

    public Account(){
        name = "init_name";
        password="init_password";
        accountNum= 0100121;
        money=0;
        percent=0.0;
    }

    public Account(String init_name, String init_password,int init_account, int init_money, double init_percent){
        name = init_name;
        password=init_password;
        accountNum= init_account;
        money=init_money;
        percent=init_percent;

    }
    public void addMoney(int add){
        money+=add;
        System.out.println(money);
    }
    public void minusMoney(int del){
        money-=del;
        System.out.println(money);
    }
    public void getTotal(){
        System.out.println("Total : "+money);
    }

}

class AccountExample{
    public static void main(String[] args) {
        Account ac = new Account("채현영","@gusdud2665",1005468968,5000,0.5);
        ac.addMoney(50);
        ac.minusMoney(60);
        ac.getTotal();
        
    }
}