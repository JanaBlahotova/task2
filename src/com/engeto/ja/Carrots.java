package com.engeto.ja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Carrots {

    private String name; //Jméno a příjmení prodejce
    private LocalDate birth;//Datum narození prodejce.
    private int contractNo;//Počet dosud sjednaných smluv.
    private BigDecimal carrotsSold;  //Celkové množství prodané mrkve v tunách.
    private String cityName;//Název města, kde prodejce sídlí.
    private double carConsumption;  //Spotřeba firemního vozidla v litrech na 100 km.


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String ipAddress;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getContractNo() {
        return contractNo;
    }

    public void setContractNo(int contractNo) {
        this.contractNo = contractNo;
    }

    public BigDecimal getCarrotsSold() {
        return carrotsSold;
    }

    public void setCarrotsSold(BigDecimal carrotsSold) {
        this.carrotsSold = carrotsSold;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCarConsumption() {
        return carConsumption;
    }

    public void setCarConsumption(double carConsumption) {
        this.carConsumption = carConsumption;
    }


}
