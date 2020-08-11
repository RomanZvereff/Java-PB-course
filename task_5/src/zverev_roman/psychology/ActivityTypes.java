package zverev_roman.psychology;

public enum ActivityTypes {

    STRONG("Сильный"),
    BALANCED("Уравновешенный"),
    MOBILE("Подвижный"),
    INERT("Инертный"),
    UNBALANCED("Неуравновешенный"),
    WEAK("Слабый");

    private final String name;

    ActivityTypes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toLowerCase();
    }
}
