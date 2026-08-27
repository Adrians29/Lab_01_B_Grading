/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01_b;

/**
 *
 * @author adria
 */
public class Demo {
    public static void main(String[] args) {
        GradedActivity lab = new GradedActivity();
        lab.setScore(92.5);
        
        PassFailExam passFailExam = new PassFailExam(10, 4, 70.0);
        
        Essay essay = new Essay();
        essay.setScore(20.0, 15.0, 15.0, 22.0);
        
        FinalExam finalExam = new FinalExam(40, 1);
        
        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab(lab);
        courseGrades.setPassFailExam(passFailExam);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);
    }
}
