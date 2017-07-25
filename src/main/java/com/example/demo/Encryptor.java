package com.example.demo;

public class Encryptor {

    private String privateKey;

    public void printKey() {
        System.out.println(privateKey);
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
