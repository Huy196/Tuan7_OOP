package quanlisanpham;

import java.util.Arrays;
import java.util.Comparator;

public class ManagerPhone {
    Phone[] listPhone = new Phone[0];

//    public void sortPhoneWithPrice(boolean ascending) {
//        Comparator<Phone> comparator = Comparator.comparing(Phone::getPrice);
//        if (!ascending) {
//            comparator = comparator.reversed();
//        }
//        Arrays.sort(listPhone, comparator);
//    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Phone phone : listPhone) {
            totalPrice += (phone.getPrice() * phone.getNumber());
        }
        return totalPrice;
    }
//
    public boolean removePhoneWithPhoneName(String deletePhoneName) {
        for (int i = 0; i < listPhone.length; i++) {
            Phone[] newPhones= new Phone[listPhone.length -1];
            System.arraycopy(listPhone,0,newPhones,0,i);
            System.arraycopy(listPhone,i+1,newPhones, i, listPhone.length- i -1);
            listPhone = newPhones;
            return true;
        }
        return false;
    }
//
    public Double findPricePhoneWithPhoneName(String keyword) {
        for (Phone phone : listPhone) {
            if (phone.getName().equalsIgnoreCase(keyword)){
                return phone.getPrice();
            }
        }
        return null;
    }
    public Phone[] addNewPhoneToListPhone(Phone newPhone) {
        Phone[] newListPhone = new Phone[listPhone.length + 1];
        newListPhone[0]= newPhone;
        System.arraycopy(listPhone,0,newListPhone,1,listPhone.length);
        listPhone = newListPhone;
        return listPhone;
    }

    public void displayListPhone() {
        for (Phone phone : listPhone) {
            System.out.println(phone.toString());
        }
    }
}
