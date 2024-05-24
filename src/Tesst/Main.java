package Tesst;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.addPhone(new Phone("IP15", 90,3));
        shop.addPhone(new Phone("IP14", 90,2));
        shop.addPhone(new Phone("IP13", 87,4));

        for (int i = 0; i < shop.getCount(); i++) {
            System.out.println(shop.getPhoneByIndex(i));
        }

        System.out.println();
        Phone phone = shop.getPhoneByModel("IP16");
        if (phone != null) {
            System.out.println(phone);
        } else {
            System.out.println("Khong tim thay");
        }
        System.out.println();
        shop.remotePhone("IP14");
        for (int i = 0; i < shop.getCount(); i++) {
            System.out.println(shop.getPhoneByIndex(i));
        }
        System.out.println();
        shop.increaseAndDecrease(false);
        for (int i = 0; i < shop.getCount(); i++) {
            System.out.println(shop.getPhoneByIndex(i));
        }
        System.out.println();

        System.out.println("Tổng " + shop.totalValue());

    }
}
