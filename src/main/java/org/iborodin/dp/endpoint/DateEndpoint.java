package org.iborodin.dp.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService
public class DateEndpoint {

    @WebMethod
    public Date GetCurrentDay() {
        return new Date();
    }
}
