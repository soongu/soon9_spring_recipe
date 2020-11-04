package kr.co.kokono.recipe.chap03.r3_9.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @NotNull
    private String name;

    @NotNull
    private String phone;


}
