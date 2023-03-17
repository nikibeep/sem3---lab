package medic;

public class Surgery extends MedicalProcedure {
    private String type;

    public Surgery(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void perform() {
        System.out.println("Performing surgery of type: " + this.type);
    }
}
