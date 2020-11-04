package kr.co.kokono.recipe.chap03.r3_9.domain;

import kr.co.kokono.recipe.chap03.r3_9.service.ReservationServiceR3_9;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SportTypeConverter implements Converter<String, SportType> {

    private final ReservationServiceR3_9 reservationServiceR39;

    @Override
    public SportType convert(String source) {
        int sportTypeId = Integer.parseInt(source);
        return reservationServiceR39.getSportType(sportTypeId);
    }

}
