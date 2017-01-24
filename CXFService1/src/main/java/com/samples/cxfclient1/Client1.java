package com.samples.cxfclient1;

import com.samples.cxfservice1.Employee;
import com.samples.cxfservice1.EmployeeService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by edara on 10/8/16.
 */
public class Client1 {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8080/CXFService1-1.0/services/employee?wsdl");
        QName SERVICE_NAME = new QName("http://cxfservice1.samples.com/", "EmployeeServiceImplService");
        Service service = Service.create(wsdlURL, SERVICE_NAME);
        EmployeeService client = service.getPort(EmployeeService.class);
        Employee result = client.getEmployee(1);
        System.out.println(result);
    }
}
