package ru.gb.jcore.model;

public enum Gender {
    MALE("men"), FEMALE("woman");
    private String gender;
    private Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
