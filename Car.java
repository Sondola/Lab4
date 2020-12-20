public class Car {
    private String name;

    public Car() {}
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class Tupichok {
        public Tupichok() {
            Car.this.name = "Тупичок";
        }

        public String getName() {
            return Car.this.getName();
        }
    }
}
