package com.samples.cxfservice1;

import javax.jws.WebService;

/**
 * Created by edara on 10/7/16.
 */
@WebService
public interface EmployeeService {
    Employee getEmployee(int id);
}
