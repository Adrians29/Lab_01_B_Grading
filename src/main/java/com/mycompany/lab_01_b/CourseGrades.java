/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01_b;

/**
 *
 * @author adria
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;
    private int NUM_GRADES = 4;

    public CourseGrades() {
        this.grades = new GradedActivity[NUM_GRADES];
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay; 
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        String str = "";
        
        if (grades[0] != null) {
            str += "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade() + "\n";
        }
        if (grades[1] != null) {
            str += "Pass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade() + "\n";
        }
        if (grades[2] != null) {
            str += "Essay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade() + "\n";
        }
        if (grades[3] != null) {
            str += "Final Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();
        }
        
        return str;
    }

    @Override
    public double getAverage() {
        double sum = 0;
        int count = 0;
        for (GradedActivity activity : grades) {
            sum += activity.getScore();
            count++;
        }
        return (count > 0) ? sum / grades.length : 0.0;
    }

    @Override
    public GradedActivity getHighest() {
        if (grades[0] == null) {
            return null;
        }
        
        GradedActivity highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] != null && grades[i].getScore() > highest.getScore()) {
                highest = grades[i];
            }
        }
        return highest;
    }

    @Override
    public GradedActivity getLowest() {
        if (grades[0] == null) {
            return null;
        }
        
        GradedActivity lowest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] != null && grades[i].getScore() < lowest.getScore()) {
                lowest = grades[i];
            }
        }
        return lowest;
    }
    
    
}
