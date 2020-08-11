package zverev_roman.psychology;

public enum TemperamentTypes {

    CHOLERIC("Холерик"),
    PHLEGMATIC("Флегматик"),
    SANGUINE("Сангвиник"),
    MELANCHOLIC("Меланхолик");

    private final String name;

    TemperamentTypes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toLowerCase();
    }

}
