package com.samples.cxfservice1;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by edara on 10/7/16.
 */
@WebService(endpointInterface = "com.samples.cxfservice1.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @WebMethod
    public Employee getEmployee(int id) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Hareen");
        return emp;
    }
}
