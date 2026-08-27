/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01_b;

/**
 *
 * @author adria
 */
public class Essay extends GradedActivity {
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;
    
    public void setScore(double grammer, double spelling, double correctLength, double content) {
        this.grammer = grammer;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
        
        double totalScore = grammer + spelling + correctLength + content;
        super.setScore(totalScore);
    }

    public void setGrammer(double grammer) {
        this.grammer = grammer;
        super.setScore(this.grammer + this.spelling + this.correctLength + this.content);
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
        super.setScore(this.grammer + this.spelling + this.correctLength + this.content);
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
        super.setScore(this.grammer + this.spelling + this.correctLength + this.content);
    }

    public void setContent(double content) {
        this.content = content;
        super.setScore(this.grammer + this.spelling + this.correctLength + this.content);
    }

    public double getGrammer() {
        return grammer;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getContent() {
        return content;
    }
    
    
}
