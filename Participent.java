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
import java.util.Arrays;
import java.lang.Math;

public class Participent {

    private String name;
    private int[] rankings;
    private ArrayList <Integer> matches = new ArrayList<Integer>();
    private int regret;
    private int maxMatches;
    
    //default ctor
    public Participent(){}
    
    //self defined ctor
    public Participent(String name, int maxMatches, int nParticipents){
        this.name=name;
        this.regret=0;
        this.maxMatches=maxMatches;
        this.rankings= new int[nParticipents];
    }
    
    //get private field name
    public String getName(){ 
        return name;
    }
    
    //set private field name to name
     public void setName(String name){
         this.name=name;
     }
    
    //return the Ith ranking in the ranking array
    public int getRanking(int i){
        return rankings[i];
    }
    
    //set ranking[i] to r
    public void setRankign(int i, int r){
        rankings[i]=r;
    }
    
    //get the i'th match from ArrayList
    public int getMatch(int i){
        int IthMatch=-1;
        IthMatch=matches.get(i);
          if(IthMatch==-1){
              throw new IllegalArgumentException("Fail to fetch from ArrayList");
          }
        return IthMatch;
    }
    
    //add paramter m to private ArrayList matches
    public void setMatch(int m){
         boolean append=false;
         append=matches.add(m);
         if (append==false){
             throw new IllegalArgumentException("Fail to append element m to ArrayList");
         }
     }
    
    //get private field regret
    public int getRegret(){
        return regret;
    }
    
    //set private field regret to paramter r
    public void setRegret(int r){
        this.regret=r;
    }
    
    //get private field maxMatches
    public int getMaxMatches(){
        return maxMatches;
    }
    
    //set private field maxMatches to n
    public void setMaxMatches(int n){
        this.maxMatches=n;
    }
    
    //set rankings Array size and init all elements in rankings[] to -1
    public void setNParticipents(int n){
        this.rankings= new int[n];
        Arrays.fill(rankings,-1);
    }
    
    //set rankings array size
    public int getNParticipents(){
        int arrayLength=0;
        arrayLength=rankings.length;
        return arrayLength;
    }
    
    //determine if has reach max allowrence
    public boolean isFull(){
        int currentMatches=0;
        currentMatches=matches.size();
        if(currentMatches<maxMatches){
            return false;
        }
        else if(currentMatches==maxMatches){
            return true;
        }
        else{
            throw new IllegalArgumentException("Illegal length of ArrayList");
        }
    }
    
   //clear the ArrayList matches
    public void clearMatches(){
        matches.clear();
    }
    
    //find rank of given participent 
    public int findRankingByID(int participentIndex){
        int searchResult=-1;
        int rankingLength=rankings.length;
        for (int i =0;i<rankingLength;i++){
            if(rankings[i]==participentIndex){
                searchResult=i;
                break;
            }
        }
        return searchResult;
    }
    
    //find the worst match
    public int getWorstMatch(){
        int arrayListLength=0;
        int currentWorstMatchIndex=-1;
        int tmpRegret=0;
        int currentWorstRegret=0;
        int targetRanking=0;
        
        arrayListLength=matches.size();
        
        //if there's no matches
        if(arrayListLength==0){
            return currentWorstMatchIndex;
        }
        //interate through matches
        for(int i : matches){
           targetRanking=findRankingByID(i);
           tmpRegret=targetRanking - 1;
                if(tmpRegret>=currentWorstRegret){
                    currentWorstRegret=tmpRegret;
                    currentWorstMatchIndex=i;
                }
        }
        
        return currentWorstMatchIndex;
    }
    
    //remove the match with participent k
    public void unmatch(int k){
        if(k<0 || k>matches.size()){
            throw new IllegalArgumentException("Illegal index");
        }
        else{
            matches.remove(k);
        }
    }
    
    
    public boolean matchExists(int k){return true;}
    public int getSingleMatchedRegret(int k){return 1;}
    public void calcRegret(){}
    
    public void editInfo(ArrayList<? extends Participent> p){}
    public void editRankings(ArrayList<? extends Participent> p){}
    
    public void print(ArrayList<? extends Participent> p){}
    public void printRankings(ArrayList<? extends Participent> p){}
    public String getMatchName(ArrayList<? extends Participent> p){return "";}
    
    public boolean isValid(){return true;}
    
}
