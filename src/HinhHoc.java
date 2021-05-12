public class HinhHoc {
    void hinhHocCalculator(int a,int b, int c){
            System.out.println("Nhập 3 cạnh :"+ a + b + c);
        if (a<b+c && b< a+c && c< a+b){
            System.out.println("Ba số lập thành một tam giam !\n");
        }else {
            System.out.println("Ba số không tạo thành tam giac!\n");
        }

    }
}
