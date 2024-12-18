public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age >= 0 ? age : null;
    }

    public String getAddress() throws Exception {
        if (address == null) {
            throw new Exception("Адрес не указан");
        }
        return address;
    }

    public void happyBirthday() throws Exception {
        if (age >= 0) {
            age += 1;
        } else {
            throw new Exception("Возраст не указан");
        }
    }

    public PersonBuilder newChildBuilder(){
        return new  PersonBuilder().setSurname(surname).setAddress(address).setAge(0);
    }



    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
