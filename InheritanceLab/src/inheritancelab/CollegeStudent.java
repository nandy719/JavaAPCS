/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancelab;

/**
 *
 * @author nandy
 */
public class CollegeStudent extends Student {
    private String major;
    private int year;
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major){
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }
    public int getYear(){
        return this.year;
    }
    public String getMajor(){
        return this.major;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String toString(){
        return super.toString() + ", year: " + this.year + ", major: " + this.major;
    }
}
