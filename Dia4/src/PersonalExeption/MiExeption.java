
package PersonalExeption;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiExeption extends Exception{
private int code;
private String description;
private Date date;
private String message;
   
public MiExeption(int code,String description, Date date,String message){
    super(message);
    this.code = code;
    this.description = description;
    this.date = date;
}

    public MiExeption(){
        
    }
    public MiExeption(String message) {
     super(message); 
    }
    
    public MiExeption(String message, Throwable cause){
        super(message,cause);
    }
    public MiExeption(Throwable cause){
        super(cause);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return fecha.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MiExeption(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    
}
