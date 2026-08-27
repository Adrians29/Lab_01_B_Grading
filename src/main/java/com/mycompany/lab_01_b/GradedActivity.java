/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01_b;

/**
 *
 * @author adria
 */
public class GradedActivity {
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
    
    public char getGrade() {
        char letterGrade;
        
        if (score >=90) {
            letterGrade = 'A';
        } else if (score >=80) {
            letterGrade = 'B';
        } else if (score >=70) {
            letterGrade = 'C';
        } else if (score >=60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
