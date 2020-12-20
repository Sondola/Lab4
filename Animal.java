public abstract class Animal {
    private boolean predator;
    private boolean skill = false;
    private String name;
    private String sex;
    private boolean street;

    public Animal() {}

    public Animal(String name, boolean predator) {
        this.name = name;
        this.predator = predator;
    }

    public Animal(String name, String sex, boolean predator) {
        this.name = name;
        this.sex = sex;
        this.predator = predator;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public boolean isStreet() {
        return street;
    }

    public void setStreet(boolean street) {
        this.street = street;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public boolean isSkill() {
        return skill;
    }

    public void setSkill(boolean skill) {
        this.skill = skill;
    }

    public String watch(Animal animal) throws NotAPredatorException {
        if (predator == true)
            return this.getName() + " подкарауливал " + animal.getName();
        else
            throw new NotAPredatorException("Слишком травоядный, чтобы кого-то подкарауливать");
    }

    public String visit(Human human, String place) {
        return this.getName() + " и " + human.getName() + " часто посещают " + place;
    }

    public String play(Animal animal) {
        return this.getName() + ", держа " + animal.getName() + " в зубах, " + Move.LETGO.getMove() + " " + animal.getName() + ", " + Move.PRETEND.getMove() + ", будто " + Move.WATCH.getMove() + ", а когда " + animal.getName() + " тщетно пыталась " + Move.ESCAPE.getMove() + ", снова ловила " + animal.getName();
    }
}
