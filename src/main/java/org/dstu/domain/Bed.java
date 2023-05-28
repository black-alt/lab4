package org.dstu.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Bed {
    private int id;
    private String Manufacturer;
    private String Color;
    private int Price;
    private String Size;
    private boolean HaveHeadboard;
    private String MattressType;

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
    @Column(name = "size")
    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Basic
    @Column(name = "have_headboard")
    public boolean isHaveHeadboard() {
        return HaveHeadboard;
    }

    public void setHaveHeadboard(boolean haveHeadboard) {
        HaveHeadboard = haveHeadboard;
    }

    @Basic
    @Column(name = "mattress_type")
    public String getMattressType() {
        return MattressType;
    }

    public void setMattressType(String mattressType) {
        MattressType = mattressType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bed bed = (Bed) o;
        return id == bed.id &&
                Objects.equals(Manufacturer, bed.Manufacturer) &&
                Objects.equals(Color, bed.Color) &&
                Objects.equals(Price, bed.Price) &&
                Objects.equals(Size, bed.Size) &&
                Objects.equals(HaveHeadboard, bed.HaveHeadboard) &&
                Objects.equals(MattressType, bed.MattressType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Manufacturer, Color, Price, Size, HaveHeadboard, MattressType);
    }
}
