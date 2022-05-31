public class PersonBuilder {
    private Person newPerson;

    public PersonBuilder() {
        newPerson = new Person();
    }

    public PersonBuilder withName(String name) {
        if (newPerson.getName() == null) {
            newPerson.setName(name);
            return this;
        }
        return this;
    }

    public PersonBuilder withSurname(String surname) {
        if (newPerson.getSurname() == null) {
            newPerson.setSurname(surname);
            return this;
        }
        return this;
    }

    public PersonBuilder withAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст имеет отрицательное значение!");
        }
        if (!newPerson.hasAge()) {
            newPerson.setAge(age);
            return this;
        }
        return this;
    }

    public PersonBuilder withAddress(String city) {
        if (!newPerson.hasAddress()) {
            newPerson.setAddress(city);
        }
        return this;
    }

    public Person build() {
        if (newPerson.getName() == null || newPerson.getSurname() == null) {
            throw new IllegalStateException("Не хватает имени или фамилии!");
        }
        return newPerson;
    }
}
