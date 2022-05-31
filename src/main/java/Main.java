public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .withName("Валя")
                .withSurname("Иванова")
                .withAge(29)
                .withAddress("Moscow")
                .build();
        Person son = mom.newChildBuilder()
                .withName("Коля")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().withAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
