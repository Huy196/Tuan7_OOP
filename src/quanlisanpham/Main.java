package quanlisanpham;

public class Main {
    public static void main(String[] args) {
        Phone iphone13 = new Phone("Iphone 13", 13.333, 5);
        Phone samsungUltra = new Phone("Sam Sung Ultra", 7.22, 10);
        Phone xiaomi = new Phone("Xiaomi", 5.22, 3);

        ManagerPhone managerPhone = new ManagerPhone();

        managerPhone.addNewPhoneToListPhone(iphone13);
        managerPhone.addNewPhoneToListPhone(samsungUltra);
        managerPhone.addNewPhoneToListPhone(xiaomi);

        managerPhone.displayListPhone();
//        System.out.println(managerPhone.findPricePhoneWithPhoneName("Iphone 13"));

        managerPhone.removePhoneWithPhoneName("Xiaomo");
        managerPhone.displayListPhone();
//        managerPhone.sortPhoneWithPrice(false);
//        managerPhone.displayListPhone();

        System.out.println("Tổng giá trị của cửa hàng là : " + managerPhone.calculateTotalPrice());
    }
}
