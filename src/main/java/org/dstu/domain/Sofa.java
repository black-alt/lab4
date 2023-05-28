package org.dstu.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sofa {
    private int id;
    private String Manufacturer;
    private String Color;
    private int Price;
    private int CountOfSeats;
    private String UpfoldingMechanizm;
    private boolean HaveArmrests;
    private Room room;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "manufacturer")
    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Basic
    @Column(name = "count_of_seats")
    public int getCountOfSeats() {
        return CountOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        CountOfSeats = countOfSeats;
    }

    @Basic
    @Column(name = "upfolding_mechanizm")
    public String getUpfoldingMechanizm() {
        return UpfoldingMechanizm;
    }

    public void setUpfoldingMechanizm(String upfoldingMechanizm) {
        UpfoldingMechanizm = upfoldingMechanizm;
    }

    @Basic
    @Column(name = "have_armrests")
    public boolean isHaveArmrests() {
        return HaveArmrests;
    }

    public void setHaveArmrests(boolean haveArmrests) {
        HaveArmrests = haveArmrests;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sofa sofa = (Sofa) o;
        return id == sofa.id && Objects.equals(Manufacturer, sofa.Manufacturer) && Objects.equals(Color, sofa.Color) &&
                Objects.equals(Price, sofa.Price) && Objects.equals(CountOfSeats, sofa.CountOfSeats) &&
                Objects.equals(UpfoldingMechanizm, sofa.UpfoldingMechanizm) && Objects.equals(HaveArmrests, sofa.HaveArmrests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Manufacturer, Color, Price, CountOfSeats, UpfoldingMechanizm, HaveArmrests);
    }
}
