package br.com.alura.codechella.domain;

public class Address {
    private String cep;
    private Integer number;
    private String additionalDetails;

    public Address(String cep, Integer number, String additionalDetails) {
        this.cep = cep;
        this.number = number;
        this.additionalDetails = additionalDetails;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }
}
