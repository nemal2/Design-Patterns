package org.example;

public class ProxyClient {

    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("John");
        officeInternetAccess.grantInternetAccess();
    }
}
