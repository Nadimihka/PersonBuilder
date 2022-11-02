public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Ольга")
                .setSurname("Петрова")
                .setAge(27)
                .setCity("Москва")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Артем")
                .setAge(5)
                .build();
        System.out.println("У " + mom.getName() + " " + mom.getSurname() +
                " есть сын, " + son.getName() + ", " +
                son.getAge().getAsInt() + " лет");

        // Не хватает обязательных полей
        /*Person uncle = new PersonBuilder()
                .setSurname("Иванов")
                .build();*/

        // Возраст недопустимый
        Person sister = new PersonBuilder()
                .setName("Оксана")
                .setSurname("Петрова")
                .setAge(-20)
                .build();
    }
}
