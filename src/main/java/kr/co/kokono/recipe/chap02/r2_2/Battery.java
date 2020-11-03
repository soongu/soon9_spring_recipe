package kr.co.kokono.recipe.chap02.r2_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Battery extends Product {

    private boolean rechargeable;

    public Battery(String name, double price) {
        super(name, price);
    }
}
