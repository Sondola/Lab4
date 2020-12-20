public class Treatment{
    private boolean treat = false;
    final static int COST = 20;

    public Treatment() {
        System.out.println("Началось лечение");
    }

    public void takePills(Patient patient, Receipt receipt) {
        for (Medicine med : receipt.getMed()) {
            patient.setHealth(med.getHealth());
            System.out.println("Успешно принято лекарство: " + med.getName());
        }
        if (patient.getHealth() > 10) {
            treat = true;
        }
    }



    public String toDo(Patient patient, Move moveWhat) {
        return "Пациенту " + patient.getName() + " нужно " + moveWhat.getMove();
    }

    public String toDo(Patient patient, Move moveWhat, Move moveFor) {
        return "Пациенту " + patient.getName() + " нужно " + moveWhat.getMove() + ", чтобы " + moveFor.getMove();
    }

    public String toString() {
        return "Происходит лечение";
    }

    public int hashCode() {
        int sum = 0;
        for (int i = 0; i<18; i++) {
            if (treat)
                sum = (sum + (int)"Лечение прошло успешно".charAt(i)) % 1000000000;
            else
                sum = (sum + (int)"Лечение прошло неуспешно".charAt(i)) % 1000000000;
        }
        return sum;
    }

    public boolean equals(Object object) {
        Treatment treatment = (Treatment) object;
        return (this.treat == treatment.treat);
    }
}
