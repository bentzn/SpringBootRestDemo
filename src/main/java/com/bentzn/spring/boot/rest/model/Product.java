package com.bentzn.spring.boot.rest.model;

public class Product {
    private int m_nId;
    private String m_cName;

    public Product() {

    }



    public Product(int a_nId, String a_cName) {
        m_nId = a_nId;
        m_cName = a_cName;
    }



    public int getId() {
        return m_nId;
    }



    public void setId(int a_nId) {
        m_nId = a_nId;
    }



    public String getName() {
        return m_cName;
    }



    public void setName(String a_cName) {
        m_cName = a_cName;
    }
}