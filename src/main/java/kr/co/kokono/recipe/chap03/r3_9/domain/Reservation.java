package kr.co.kokono.recipe.chap03.r3_9.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    private String courtName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;
    private int hour;
    private Player player;
    private SportType sportType;

    public Date getDateAsUtilDate() {
        return Date.from(this.date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
