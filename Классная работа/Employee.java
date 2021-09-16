public final class Employee extends AbstractPerson {
    final private String department;
    final Position position;

    Employee(String name, String dep, Position pos) {
        super(name);
        this.department = dep;
        this.position = pos;
    }

    enum Position {
        SELLER, MANAGER
    }

    @Override
    public String think() {
        return "Employee";
    }
}
