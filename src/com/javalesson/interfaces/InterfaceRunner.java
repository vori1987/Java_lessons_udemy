package com.javalesson.interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {

        Pricable pizza = new Pizza("Neopolitana", 1, 20, Size.L);
        Pricable phone = new CellPhone("Moto", "XT526", 1, 250);
        Pricable fridge = new Fridge("LG", "E9090", 1, 301);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    public static void printDeliveryPrice(Pricable del) {
        System.out.println("Delivery prise " + del.calcDeliveryPrice());
        System.out.println("Order prise " + del.calcOrderPrice());

    }
}
