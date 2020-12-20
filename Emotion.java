public enum Emotion {
    HAPPINESS("радость", 5),
    SADNESS("грусть", -5),
    DISAPPOINTMENT("разочарование", -10);

    private String name;
    private int mood;

    Emotion(String name, int mood) {
        this.name = name;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public int getMood() {
        return mood;
    }
}
