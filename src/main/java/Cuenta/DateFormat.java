package Cuenta;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    private DateTimeFormatter formatte = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public DateFormat() {
    }

    public LocalDate toDateFormat(String strDate) throws ParseException {        
        return LocalDate.parse(strDate, formatte);        
    }

    public String toStringFormat(LocalDate date) {
        return date.format(formatte);
    }

}
