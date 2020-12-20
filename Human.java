abstract class Human implements Namable{
    private String name;
    private String occupation;
    private String sex;
    private int age;
    private String time;
    private int mood = 0;

    public Human() {}

    public Human(String name) {
        this.name = name;
        System.out.println("Появление " + this.name);
    }


    public Human(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("Появление " + this.name + " (" + this.sex + ")");
    }

    public Human(String name, String sex, String occupation) {
        this.name = name;
        this.occupation = occupation;
        this.sex = sex;
        System.out.println("Появление " + this.name + " (" + this.occupation + ", " + this.sex + ")");
    }

    public Human(String name, String sex, String occupation, int age) {
        this.name = name;
        this.occupation = occupation;
        this.sex = sex;
        this.age = age;
        System.out.println("Появление " + this.name + " (" + this.occupation + ", " + this.sex + ", " + this.age + " лет)");
    }


    @Override
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood += mood;
    }

    public String feel(Emotion emotion) {
        mood += emotion.getMood();
        return this.getName() + " почувствовал(а) " + emotion.getName();
    }

    public String getTime(int time) {
        switch (time) {
            case(0): this.time = "Во время ";
                break;
            case(1): this.time = "Через 1 неделю ";
                break;
            case(2): this.time = "Через 2 недели ";
                break;
            case(3): this.time = "Через 3 недели ";
                break;
            case(4): this.time = "Через 4 недели ";
                break;
            default: this.time = "Через " + time + " недель ";
        }
        return this.time;
    }

    public String invite(Human human) {
        mood += 2;
        return this.getName() + " пригласил(а) к себе " + human.getName();
    }

    public String invite(Human humanWho, Human humanTo) {
        mood +=3 ;
        return this.getName() + " пригласил(а) " + humanWho.getName() + " к " + humanTo.getName();
    }

    public String say(String phrase) {
        return this.getName() + " сказал(а): " + phrase;
    }



    public String toString() {
        return "Его/ее называли когда-то " + this.getName();
    }

    public int hashCode() {
        int sum = 0;
        for (int i = 0; i<this.getName().length(); i++) {
            sum = (sum + this.getName().hashCode() * 23 + this.getOccupation().hashCode() * 15) % 10000000;
        }
        return sum;
    }

    public boolean equals(Object object) {
        Human human = (Human) object;
        return (this.getName()==human.getName() && this.getSex() == human.getSex() && this.getAge() == human.getAge());
    }
}
