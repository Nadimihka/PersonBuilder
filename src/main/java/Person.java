import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age = -1;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age != -1 ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Optional<String> getCity() {
        return city != null ? Optional.of(city) : Optional.empty();
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasCity() {
        return city != null;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setCity(city);

    }
}
