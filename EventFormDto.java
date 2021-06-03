package dtos;

import java.util.Objects;

public class EventFormDto {

    private String name;
    private String surname;
    private String email;
    private String workStudy;

    public EventFormDto() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkStudy() {
        return workStudy;
    }

    public void setWorkStudy(String workStudy) {
        this.workStudy = workStudy;
    }

    public EventFormDto(String name, String surname, String email, String workStudy) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.workStudy = workStudy;
    }

    @Override
    public String toString() {
        return "EventFormDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", workStudy='" + workStudy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventFormDto that = (EventFormDto) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(workStudy, that.workStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, workStudy);
    }

}
