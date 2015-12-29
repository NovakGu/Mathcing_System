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

public class School {
    private double alpha;
    
    public School(){}
    public School(String name, double alpha, int maxMatches, int nStudents){}
    
    public double getAlpha(){return this.alpha;}
    public void setAlpha(double alpha){this.alpha=alpha;}
    
    public void editSchoolInfo(ArrayList<Student> s, boolean canEditRankings){}
    
    public void calcRanklings(ArrayList<Student> s){}
    
    public void print(ArrayList<? extends Participent> s){}
    public boolean isValid(){return true;}
}
