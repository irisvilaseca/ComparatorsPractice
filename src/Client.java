import java.time.LocalDate;
import java.util.Objects;

public class Client implements Comparable<Client>{
    private int ID;
    private LocalDate registrationDate;
    private String name;
    private String surname;
    private int age;

    public Client(int ID, LocalDate registrationDate, String name, String surname, int age) {
        this.ID = ID;
        this.registrationDate=registrationDate;
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return getID() == client.getID() && getAge() == client.getAge() && Objects.equals(getRegistrationDate(), client.getRegistrationDate()) && Objects.equals(getName(), client.getName()) && Objects.equals(getSurname(), client.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getRegistrationDate(), getName(), getSurname(), getAge());
    }

    @Override
    public int compareTo(Client c) {
        return this.getSurname().compareTo(c.getSurname());
    }
}
