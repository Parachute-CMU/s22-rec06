package records;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private List<Person> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(Person person) {
        for (Person row: this.records) {
            if (person.equals(row)) {
                return false;
            }
        }
        this.records.add(person);
        return true;
    }
}