public class PhuongTrinh {
    void phuongtrinhCalcutor(float a, float b, float c){
        float x1, x2;
        float deta= b*b- 4*a*c;
        if (deta>0){
             x1= (float) (( -b+ Math.sqrt(deta))/(2*a));
             x2=(float) ((-b-Math.sqrt(deta))/(2*a));
            System.out.println("Phương trình có 2 nghiệm là:"+"x1="+x1+ "và x2="+x2);
        }else if (deta<0){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Phương trình có 1 nghiệm duy nhất:"+"x="+ (-c / b));
        }
    }
}
