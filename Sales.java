import java.util.*;
public class Sales {
  public static void main(String [] args){
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter Price: ");
    int p=kbd.nextInt();
    System.out.print("Enter Quantity: ");
    int q=kbd.nextInt();
    int person[] = new int[15];
    String name[] ={"#0001","#0002","#0003","#0004","#0005","#0006","#0007","#0008","#0009","#0010","#0011","#0012","#0013","#0014","#0015"}; 
      for (int i=0;i<15;i++) {
       System.out.print("Enter Salesman "+(i+1)+" SalePrice: ");
          person[i]=kbd.nextInt();
      }
    int sum=0;
    for (int i=0;i<person.length;i++) {
      sum=person[i]+sum;
    }
    System.out.println("Totala Amount Of Sales made:"+sum);
     int avg=sum/15;
     System.out.println("Average: "+avg);
     int big=person[0];
     String Hcorrect = name[0];
     int j;
     int small=person[0];
     String Lcorrect = name[0];

     for( j=0;j<15;j++) {
       
        if (big<person[j])
         {
           big=person[j];
           Hcorrect=name[j];
         }
        if(small>person[j]) {
           small =person[j];
           Lcorrect = name[j];
         }
         if(avg<person[j]) {
           System.out.print("Bonus: "+name[j]);
           System.out.println(" Wages:"+1100);
         }
      }
      System.out.println("Maximum: "+big);
      System.out.println("Record Maximum Sales In This ID: "+Hcorrect);
       System.out.println("Smallest: "+ small);
        System.out.println("Record minimum Sales In This ID: "+Lcorrect);
   }
}
