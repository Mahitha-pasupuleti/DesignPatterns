package ProxyDesignPattern;

import ProxyDesignPattern.Client.Admin;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.performEmployeeOperations();
    }
}
