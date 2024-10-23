package org.example;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private RealInternetAccess realInternetAccess;
    private String employeeName;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }
        else {
            System.out.println("Sorry, you don't have permission to access the internet");
        }
    }
    public int getRole(String employeeName) {
        //Access Level
        return 9;
    }
}
