/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BE;

import java.util.Random;

/**
 *
 * @author Mecaa
 */
public class Student extends Person {

    private String absencePercentage;

    public Student(String username, String email, int id, String password, String name) {
        super(username, email, id, password, name);
        Random rand = new Random();
        absencePercentage = rand.nextInt(101) + "";
    }

    public String getAbsencePercentage() {
        return absencePercentage;
    }

    public void setAbsencePercentage(String absencePercentage) {
        this.absencePercentage = absencePercentage;
    }

}