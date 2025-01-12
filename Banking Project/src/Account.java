public class Account {
    String name, phone, date, city, type_acc;
    double  amount;
    double loan;
    int acc_num=0;
    public Account(String name, String phone, String date, String city,double amount, String type_acc, int acc_num){
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.amount = amount;
        this.date = date;
        this.type_acc = type_acc;
        this.acc_num = acc_num;
    }

}
