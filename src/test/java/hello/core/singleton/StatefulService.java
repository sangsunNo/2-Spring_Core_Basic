package hello.core.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 필드


    public void order(String naem, int price) {
        System.out.println("naem = " + naem + " pricce = " + price);
        this.price = price; // 문자 발생지점
    }

    public int getPrice() {
        return price;
    }


}
