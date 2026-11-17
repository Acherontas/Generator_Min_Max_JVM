/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generator_min_max_jvm;

import java.util.Scanner;
import da_sums.sum_cdis;

/**
 *
 * @author acherontas
 */
public class Generator_Min_Max_JVM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int sxolia=0;
    String mynmb=new String();
    int begin_with=0;
    Scanner console=new Scanner(System.in);
    //System.out.println("enter begin with 0 or 1 ");
    System.out.println("voyeristic behaviours enjoy ur stay");
    System.out.println("enter ur number:");
    mynmb=new String();
    begin_with=1;
    mynmb=console.nextLine();
    System.out.println("enter 0 or 1 for comments ");
    sxolia=console.nextInt();  
    int lgn=mynmb.length()-1;
    System.out.println("ur number " +  mynmb + " with size : " + lgn );
    int[] myn=new int[mynmb.length()+1];
    int advmyn=0;int tmpint=0;char l;int nnine=0;
    for(int i=0;i<=lgn;i++){
        l=mynmb.charAt(i);      
        tmpint=Character.getNumericValue(l);
        if(tmpint<=9){myn[advmyn]=tmpint; advmyn+=1;}
        if(tmpint>9){
            System.out.println("ur number is bigger than 9");
            nnine=1;}
    }

    int ctone_lp=0;
    int cttwo_lp=0;
    int ct=0;
    int ext=0;

    int metavl_one=0;
    int metavl_two=0;

    int xone=0;int xtwo=0;
    int[] ox=new int[100];int[] tx=new int[100];
    int fspace=0;
   for(;;){
   fspace=0;     
       if(sxolia==1){System.out.println();}
       for(int i=begin_with;i<=9;i++){
            if(sxolia==1){System.out.println();}
          // if(sxolia==1){cout<<"entering with ct " << ct << " and @i " << i <<"\n";}
            while(ct<=lgn){
              //if(sxolia==1){cout<<"checking @i " << i << " with @ value " << myn[ct] <<" --> ";}
              if(i<=myn[ct] ){
                ctone_lp+=1;
                if(sxolia==1){
                System.out.print(i+ " < or =");
                System.out.print(myn[ct] + " +=1 :=: " + ctone_lp + " | ");
                }
                metavl_one+=1;
              }
              if(i>myn[ct]  ){
                cttwo_lp+=1;
                if(sxolia==1){
                System.out.print(i+ " > ");
                System.out.print(myn[ct] + " +=1 :=: " + cttwo_lp + " | ");
                }
                metavl_two+=1;
              }
              ct+=1;
              fspace+=1;
              if(fspace%2==0){
               if(sxolia==1){System.out.println();}
              }
              if(ct==mynmb.length()){
                  //cout<<"\n";
                  System.out.println("@i: " + i + " number | "+ metavl_one + " and number / " + metavl_two);
                  ox[xone]=metavl_one; xone+=1;
                  tx[xtwo]=metavl_two; xtwo+=1;
                  //if(sxolia==1){cout<<"i am breaking\n";}
                  metavl_one=0;metavl_two=0;
                  ct=0;
                  break;
                 }
            }
       }
        if(sxolia==1){
            System.out.println("external counter " + ext + " --> ");}
        ext+=1;
        if(sxolia==1){
            System.out.println("increased to value: " + ext );}
        System.out.println("smaller: " + ctone_lp + " bigger: " + cttwo_lp );
        ct=0;
        if(ext==1){break;}
    }

    System.out.println();
    System.out.print("ctone_lp | : " + ctone_lp + " --> ");
    for(int i=0;i<=xone-1;i++){System.out.print(ox[i] + " ") ;}
    System.out.println();

    System.out.print("cttwo_lp / : " + cttwo_lp + " --> ");
    for(int i=0;i<=xtwo-1;i++){System.out.print(tx[i] +" " );}

    System.out.println();
    System.out.println(nnine);
 
    sum_cdis smc=new sum_cdis();
    System.out.print("Using the main number for the sum " + mynmb);
    int md=smc.get_the_sum(mynmb);
    System.out.print(" with sum of digits " + md + " ");
    System.out.println();
    System.out.print("using the ctone_lp value of : " + ctone_lp+ " ");    
    int cd=smc.get_the_sum(Integer.toString(ctone_lp));
    System.out.print(" with sum of digits " + cd);
    System.out.println();
    if(md==cd){System.out.print("its the same " );}
    if(md!=cd){System.out.print("its not the same ");}
    }
    
}
