package kr.co.kokono.recipe.chap02.r2_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product {

    private String name;
    private double price;

    @Override
    public String toString() {
        return name + " " + price;
    }
}
