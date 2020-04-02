package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Smartphone extends Product{
    private String manufacturer;
    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

}
