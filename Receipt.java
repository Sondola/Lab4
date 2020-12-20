import java.util.LinkedList;
import java.util.List;

public class Receipt {
    private List<Medicine> medicines = new LinkedList<Medicine>();
    private List<Medicine> medicinesIn = new LinkedList<Medicine>();
    private List<Medicine> medicinesOut = new LinkedList<Medicine>();

    public Receipt(boolean in, boolean out) {
        System.out.println("Выписан новый рецепт, состоящий из:");
        if (in)
            System.out.println("прием внутрь");
        if (out)
            System.out.println("наружное применение");
    }

    public void addMed(Medicine... meds) {
        for (Medicine med : meds) {
            if (med.getCondition() == Condition.IN)
                medicinesIn.add(med);
            if (med.getCondition() == Condition.OUT)
                medicinesOut.add(med);
            medicines.add(med);
        }
    }

    public List<Medicine> getMed() {
        return medicines;
    }

    public List<Medicine> getMedIn() {
        return medicinesIn;
    }

    public List<Medicine> getMedOut() {
        return medicinesOut;
    }

    public void showMed() {
        System.out.println("Были выписаны:");
        for (Medicine med : medicines) {
            System.out.println(med.getName());
        }
    }

    public void showMedIn() {
        System.out.println("Для приема внутрь были выписаны:");
        for (Medicine med : medicinesIn) {
            System.out.println(med.getName());
        }
    }

    public void showMedOut() {
        System.out.println("Для наружного применения были выписаны:");
        for (Medicine med : medicinesOut) {
            System.out.println(med.getName());
        }
    }

    @Override
    public String toString() {
        return "Это.. ну.. просто какой-то рецепт";
    }

    @Override
    public int hashCode() {
        int sum = 0;
        for (Medicine med : medicines) {
            sum = (sum + med.getName().hashCode() * 23) % 10000000;
        }
        return sum;
    }

    @Override
    public boolean equals(Object object) {
        Receipt receipt = (Receipt) object;
        return (this.medicines==receipt.medicines);
    }
}
