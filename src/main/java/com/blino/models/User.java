package com.blino.models;

import java.util.List;

/**
 * 03.02.2020
 * User
 *
 * @author rombyguide
 * @version v1.0
 */

public class User {
    private Integer id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return this.id + " " + this.firstName + " " + this.lastName;
    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private List<Car> cars;

    public User() {

    }

    public User(Integer id, String firstName, String lastName, List<Car> cars) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cars = cars;
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
