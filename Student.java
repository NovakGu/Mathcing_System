/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Participent;

/**
 *
 * @author Changheng Gu
 */

import java.util.ArrayList;

public class Student extends Participent {
    private double GPA;
    private int ES;
    
    public Student(){}
    public Student(String name, double GPA, int ES, int nSchools){}
    
    public double getGPA(){return 1;}
    public int getES(){return 1;}
    public void setGPA(double GPA){}
    public void setES(int ES){}
    
    public void editInfo(ArrayList<School> h, boolean canEditRanking){}
    public void print(ArrayList<? extends Participent> h){}
    public boolean isValid(){return true;}
}
