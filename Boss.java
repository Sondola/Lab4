public class Boss extends Human {

    public Boss() {
        super();
    }

    public Boss(String name, String sex) {
        super(name, sex,"босс");
    }

    public Boss(String name, String sex, int age) {
        super(name, sex,"босс", age);
    }

    public String giveMoney(Employee employee, int money) {
        employee.setMoney(money);
        employee.setMood(100);
        return this.getName() + " заплатил(а) " + money + " фертингов";
    }

    public String takeMoney(Employee employee, int money) {
        employee.setMoney(-money);
        employee.setMood(-100);
        return this.getName() + " отобрал(а) " + money + " фертингов";
    }
}
