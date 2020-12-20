public class Patient extends Human implements Successable{
    private int health = 0;

    public Patient() {
        super("Пациент", "пациент");
    }

    public Patient(String name, String sex) {
        super(name, sex, "пациент");
    }

    public Patient(String name, String sex, int age) {
        super(name, sex, "пациент", age);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public void hospital(Employee em) {
        if (em.getMoney() >= Treatment.COST) {
            em.setMoney(-Treatment.COST);
            em.setMood(-Treatment.COST*2);
            this.setMood(-20);
            System.out.println(this.getName() + " может быть помещен в больницу");
        }
        else {
            throw new MoneyException("Не хватает денег для оплаты лечения в больнице");
        }
    }

    @Override
    public String success() {
        if (health > 10) {
            this.setMood(50);
            return "Пациент " + this.getName() + " выздоровел";
        }
        else {
            this.setMood(-10);
            return "Пациент " + this.getName() + " еще не выздоровел";
        }
    }
}
