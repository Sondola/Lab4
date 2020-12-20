public enum Move {
    STAND("вставать"),
    STOPVISIT("прекратить посещения"),
    EAT("хорошо питаться"),
    RECOVER("восстановить силы"),
    SIT("сидели на полке"),
    DREAM("предавались мечтам"),
    NOKILL("не убивал"),
    STRANGLE("придушивал"),
    PLAY("поиграть"),
    RUN("носилась"),
    TAKE("держала"),
    LETGO("отпускала"),
    PRETEND("делала вид"),
    WATCH("смотрит в сторону"),
    ESCAPE("убежать"),
    CATCH("ловила");

    private String move;

    Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}
