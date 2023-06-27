package engine;

public enum EngineType {
    ELECTRIC("Electric"),
    PETROL("Petrol"),
    DIESEL("Diesel"),
    HYBRID("Hybrid");

    private final String type;

    EngineType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
