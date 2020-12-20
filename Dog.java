public class Dog extends Animal{
    public Dog() {}

    public Dog(String name) {
        super(name, true);
        System.out.println("Появление собачки " + this.getName());
    }

    public Dog(String name, String sex) {
        super(name, sex, true);
        System.out.println("Появление собачки " + this.getName());
    }


    public String walk(Human human) {
        setStreet(true);
        return human.getName() + " устроил прогулку с " + this.getName();
    }

    public String lay() throws NoFloorException{
        if (this.isStreet() == false)
            return this.getName() + " лежал(а) на полу у ног";
        else
            throw new NoFloorException("Мы на улице, тут нельзя лежать, надо прыгать и бегать!)");
    }
}
