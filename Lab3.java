public class Lab3 {
    public static void main(String[] args) {
        Boss boss = new Boss("хозяйка", "женщина");
        Employee neznaika = new Employee("Незнайка", "мужчина");

        System.out.println();
        System.out.println(boss.getTime(1) + " " + boss.giveMoney(neznaika, 5));
        System.out.println(neznaika.feel(Emotion.HAPPINESS));

        System.out.println();
        Dog roland = new Dog("Роланд");
        roland.setSkill(true);
        Dog mimishka = new Dog ("Мимишка");

        System.out.println();
        System.out.println(roland.walk(neznaika));
        System.out.println(mimishka.walk(neznaika));

        System.out.println();
        Doctor doc = new Doctor("Доктор", "мужчина");
        Patient kozel = new Patient("Козлик", "мужчина");

        System.out.println();
        System.out.println(neznaika.invite(doc, kozel));

        System.out.println();
        System.out.println(doc.watch(kozel));
        System.out.println(doc.say("его лучше поместить в больницу, так как болезнь очень запущена"));

        System.out.println();
        try {
            kozel.hospital(neznaika);
        } catch (MoneyException e) {
            System.out.println(neznaika.feel(Emotion.DISAPPOINTMENT));
            System.out.println(neznaika.say("я зарабатываю всего 5 фертингов в неделю, поэтому понадобится целый месяц, чтобы собрать нужную сумму"));
        }

        System.out.println();
        Treatment treatment = new Treatment();

        System.out.println();
        Receipt receipt1 = doc.makeReceipt(true, true);
        receipt1.addMed(Medicine.VITAMINS, Medicine.ANTIBIOTICS, Medicine.PYRAMIDON, Medicine.STREPTOCIDE, Medicine.NOVOCAIN, Medicine.EMULSION);

        System.out.println();
        receipt1.showMedIn();
        receipt1.showMedOut();

        System.out.println();
        treatment.takePills(kozel, receipt1);
        System.out.println(doc.permission(2, true, Move.STAND));

        System.out.println();
        System.out.println(kozel.success());
        System.out.println(doc.permission(1, true, Move.STOPVISIT));

        System.out.println();
        System.out.println(treatment.toDo(kozel, Move.EAT, Move.RECOVER));

        System.out.println();
        System.out.println(kozel.feel(Emotion.HAPPINESS));
        System.out.println(neznaika.feel(Emotion.HAPPINESS));

        System.out.println();
        mimishka.setStreet(false);
        roland.setStreet(false);

        Car car = new Car();
        Car.Tupichok tupichok = car.new Tupichok();
        System.out.println("Они " + Move.SIT.getMove() + " и " + Move.DREAM.getMove() + " в " + tupichok.getName());
        try {
            System.out.println(roland.lay());
            System.out.println(mimishka.lay());
        } catch(NoFloorException e) {
            System.out.println(e.getMessage());
        }

        class Rat extends Animal{
            public Rat() {}

            public Rat(String name) {
                super(name, false);
            }

            public Rat(String name, String sex) {
                super(name, sex, false);
            }

            public String hide(String where) {
                return " пряталась " + where;
            }

            public String tryToEscape() {
                return this.getName() + " тщетно пыталась " + Move.ESCAPE.getMove();
            }
        }
        Rat rat = new Rat("крыса");
        try {
            System.out.println(roland.watch(rat) + ", которая " + rat.hide("под полкой"));
        } catch (NotAPredatorException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println(roland.visit(neznaika, "Дрягинскую ночлежку") + ", где " + roland.getName() + " " + Move.NOKILL.getMove() + ", а " + Move.STRANGLE.getMove() + " с " + rat.getName());
        System.out.println(roland.getName() + " отдавал " + Move.PLAY.getMove() + " " + rat.getName() + " " + mimishka.getName());

        System.out.println();
        System.out.println(mimishka.play(rat));

        class Villagers extends Human {
            Villagers() {
                super("Обитатели ночлежки");
            }

            public String lastSentence1(Funnable funnable, Human h, Animal... a) {
                return this.getName() + ", которые " + funnable.waiting() + funnable.makeFun() + ", когда " + funnable.appear(h, a);
            }

            public String lastSentence2(Human human, Animal... animals) {
                return lastSentence1(new Funnable() {
                    @Override
                    public String makeFun() {
                        return " забавлялись";
                    }

                    @Override
                    public String waiting() {
                        return " каждый день с нетерпением ждали";
                    }

                    @Override
                    public String appear(Human h, Animal... a) {
                        String names = "";
                        for (Animal animal : a)
                            names += animal.getName() + " ";
                        return "появится " + h.getName() + " со своими животными: " + names;
                    }
                }, human, animals);
            }
        }

        System.out.println();
        System.out.println(new Villagers().lastSentence2(neznaika, roland, mimishka));
    }
}
