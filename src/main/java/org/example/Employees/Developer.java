package org.example.Employees;

public class Developer extends Employee implements ICanProgram{
    private final String programmingLanguage;
    public Developer (String name, String programmingLanguage){
        super(name);
        this.programmingLanguage = programmingLanguage;



    }

    /**
     * Override takes the original output and give it a new output
     * for another class while keeping the original.
     */

    @Override
    public String getSound(){
        return "Woop woop!";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public String program() {
        return name + " writes some " + programmingLanguage;


    }
}
