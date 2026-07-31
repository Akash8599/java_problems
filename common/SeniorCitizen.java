package common;

import java.time.LocalDate;

public class SeniorCitizen
{

    private String name;
    private int id;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public SeniorCitizen(String name, int id, LocalDate dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "SeniorCitizen{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
