package pr4.task4;

public class Processor {
    private final String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() { return model; }
    @Override public String toString() { return model; }
}
