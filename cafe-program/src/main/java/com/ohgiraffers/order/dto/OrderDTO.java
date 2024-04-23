package com.ohgiraffers.order.dto;

public class OrderDTO {
    String menuName;

    private int price;

    private int quantity;




    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity, int price) {
        this.quantity = quantity;
        this.price = quantity * price;
    }


// 알트인서트 > 투스트링 > 전체 ok
    @Override
    public String toString() {
        return "OrderDTO{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


}
