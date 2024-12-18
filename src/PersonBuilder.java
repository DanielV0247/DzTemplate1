public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String Address;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname){
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age){
        if (age >= 0 && age < 122){
            this.age = age;
            return this;
        }else {
            throw new IllegalArgumentException("Недопустимый возраст");
        }
    }
    public PersonBuilder setAddress(String Address){
        this.Address = Address;
        return this;
    }
    public Person build() {
        if (name != null && surname != null){
            return new Person(name, surname, age, Address);
        }else {
            throw new IllegalStateException ("Поля 'Имя' и 'Фамилия' не заполнены");
        }
    }
}