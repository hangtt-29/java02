public class Switcase {

    void monthCalculator02(int month) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng:" + month + " Có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng: " + month + " Có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Các tháng còn lại là tháng:" + month + " Có 30 ngày");
                break;
        }
    }


}
