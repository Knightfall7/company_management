package org.example.Employees;

public class Employee extends Person {
    public Employee(String name){
        setName(name);
    }
    public String getSound(){
        return "Aaow!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = capitalizeFirstLetter(name);
    }

    @Override
    public String eatFood() {
        return "Nom Nom Nom";
    }

    @Override
    public String sendFeedback() {
        return "Feedback sent";
    }

    protected String capitalizeFirstLetter(String input){
        String firstCharacter =  input.substring(0, 1).toUpperCase();
        String rest = input.substring(1);
        return firstCharacter + rest;
    }
}
