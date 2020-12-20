public class Employee extends Human{
    private int money;

    public Employee() {
        super();
    }

    public Employee(String name, String sex) {
        super(name, sex,"несчастный работник");
    }

    public Employee(String name, String sex, int age) {
        super(name, sex,"несчастный работник", age);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }
}
