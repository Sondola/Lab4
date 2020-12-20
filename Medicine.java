public enum Medicine implements Namable{
    VITAMINS("витаминчики", Condition.IN, 3),
    ANTIBIOTICS("антибиотики", Condition.IN, 4),
    EMULSION("синтомициновая эмульсия для прикладывания к распухшей шее", Condition.OUT, 2),
    STREPTOCIDE("стрептоцид", Condition.IN, 1),
    PYRAMIDON("пирамидон", Condition.IN, 1),
    NOVOCAIN("новокаин", Condition.IN, 1);

    private String name;
    private Condition con;
    private int health;

    Medicine(String med, Condition con, int health) {
        this.name = med;
        this.con = con;
        this.health = health;
    }

    public Condition getCondition() {
        return con;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
