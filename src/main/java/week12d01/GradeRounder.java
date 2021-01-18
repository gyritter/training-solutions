package week12d01;

public class GradeRounder {


   public  int[] roundGrades(int[] grades){

       for (int i=0; i<grades.length; i++){

          if(grades[i]>40 &&(((5*grades[i]/5+5)-grades[i])<3)){
              grades[i]=5*((grades[i]/5)+1);
          }
       }
       return grades;
   }
}
