package Tesst;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Shop {
    final int MAX_LIMIT = 1000;
    private Phone[] phones = new Phone[MAX_LIMIT];

    private int count = 0;

    public boolean addPhone(Phone phone) {
        if (this.count >= MAX_LIMIT)
            return false;

        this.phones[count++] = phone;
        return true;
    }

    public Phone getPhoneByIndex(int index) { //Hiển thị
        if (index < this.count) {
            return this.phones[index];
        }
        return null;
    }

    public Phone getPhoneByModel(String model) { //Tìm giá theo tên
        for (int i = 0; i < this.count; i++) {
            if (this.phones[i].getModel().equals(model)) {
                return this.phones[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public boolean remotePhone(String phone) {
        if (this.count <= 0)
            return false;
        for (int i = 0; i < MAX_LIMIT; i++) {
            if (phones[i].getModel().equalsIgnoreCase(phone)) {
                for (int j = i; j < this.count - 1; j++) {
                    phones[j] = phones[j + 1];
                }
                phones[count - 1] = null;
                this.count--;
                break;
            }
        }
        return true;
    }

    public void increaseAndDecrease(boolean acending) {
        if (!acending) {
            Arrays.sort(phones, 0, count, Comparator.comparingDouble(Phone::getPrice));
            //Array.sort : xắp xếp
            //phones mảng muốn xắp xếp;
            //bắt đầu : 0
            // count : đến vị trí count
            //Comparator.comparingDOuble : ta ra 1 giá trị double ;
            //Phone ::getPrice : tham chiếu và so sánh giá trị price

            //Reveted : ngc lại
        } else {
            Arrays.sort(phones, 0, count, Comparator.comparingDouble(Phone::getPrice).reversed());
        }
    }
    public double totalValue(){
        double sum = 0;
        for (int i = 0 ; i < this.count;i++){
            sum += phones[i].getPrice() * phones[i].getQuantity();
        }
        return  sum;
    }
}



