package dtos;

import java.util.Objects;

public class ConsultationFormDto {

    private String name;
    private String surname;
    private String email;
    private String comment;
    private String phone;
    private int dateIndex;
    private int timeIndex;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDateIndex() {
        return dateIndex;
    }

    public void setDateIndex(int dateIndex) {
        this.dateIndex = dateIndex;
    }

    public int getTimeIndex() {
        return timeIndex;
    }

    public void setTimeIndex(int timeIndex) {
        this.timeIndex = timeIndex;
    }

    public ConsultationFormDto(String name, String surname, String email, String comment, String phone,
                               int dateIndex, int timeIndex) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.comment = comment;
        this.phone = phone;
        this.dateIndex = dateIndex;
        this.timeIndex = timeIndex;


    }

    public ConsultationFormDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultationFormDto that = (ConsultationFormDto) o;
        return dateIndex == that.dateIndex && timeIndex == that.timeIndex && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(comment, that.comment) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, comment, phone, dateIndex, timeIndex);
    }

    @Override
    public String toString() {
        return "ConsultationFormDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                ", phone='" + phone + '\'' +
                ", dateIndex=" + dateIndex +
                ", timeIndex=" + timeIndex +
                '}';
    }


}
