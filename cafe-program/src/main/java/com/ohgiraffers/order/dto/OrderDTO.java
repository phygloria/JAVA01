package com.ohgiraffers.order.dto;

import java.util.Date;

public class OrderDTO {
    private String id;
    String menuName;
    private int price;
    private int quantity;


//    private java.util.Date enrollDate;



    public OrderDTO() {

    }


    public OrderDTO(String id, String menuName, int quantity, int price) {

        this.id = id;
        this.menuName = menuName;
        this.quantity = quantity;
        this.price = price * quantity;

//        this.enrollDate = enrollDate;

    }






    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    }




//    public Date getEnrollDate() {
//        return enrollDate;
//    }
//
//    public void setEnrollDate(Date enrollDate) {
//        this.enrollDate = enrollDate;
//    }


    @Override
    public String toString() {
        return "OrderDTO{" +
                "id='" + id + '\'' +
                ", menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}'+ System.lineSeparator();
    }

}
