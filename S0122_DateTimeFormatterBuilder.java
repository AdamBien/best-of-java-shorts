import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;

import static java.time.temporal.ChronoField.HOUR_OF_DAY;
import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;
import static java.time.temporal.ChronoField.SECOND_OF_MINUTE;

import java.time.LocalTime;

interface S0122_DateTimeFormatterBuilder {

        static void main(String... args) {
                var formatter = new DateTimeFormatterBuilder()
                        .appendValue(HOUR_OF_DAY,2)
                        .appendLiteral(":")
                        .appendValue(MINUTE_OF_HOUR,2)
                        .appendLiteral("::")
                        .appendValue(SECOND_OF_MINUTE)
                                .toFormatter();

                var formatted = LocalTime
                                .now()
                                .format(formatter);
                System.out.println(formatted);
        }

}