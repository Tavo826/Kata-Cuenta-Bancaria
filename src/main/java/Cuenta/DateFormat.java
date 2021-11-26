package Cuenta;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {

    private DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    private Date date;

    public DateFormat() {
    }

    public LocalDate dateTransform(String strDate) throws ParseException {
        
        LocalDate fecha = LocalDate.parse(strDate, formate);
        return fecha;
    }

    public Date getDate() {
        return date;
    }   

}
