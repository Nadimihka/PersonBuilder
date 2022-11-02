public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть от 0 до 150 лет");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Имя обязательно к заполнению");
        }
        if (surname == null) {
            throw new IllegalStateException("Фамилия обязательна к заполнению");
        }
        Person person = new Person(name, surname);
        person.setAge(age);
        person.setCity(city);
        return person;
    }
}
