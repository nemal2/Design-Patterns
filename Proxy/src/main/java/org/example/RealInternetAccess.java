package org.example;

public class RealInternetAccess implements OfficeInternetAccess{
    private String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }
    @Override
    public void grantInternetAccess() {
        System.out.println("Internet access granted. Welcome " + employeeName);
    }
}
