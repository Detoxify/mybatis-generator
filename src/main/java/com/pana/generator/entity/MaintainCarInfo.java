package com.pana.generator.entity;

public class MaintainCarInfo {
    private Integer id;

    private String carVin;

    private String engineNo;

    private String brand;

    private String carType;

    private String firstDate;

    private Integer odometerCount;

    private String reportTime;

    private String drivingUrl;

    private String mark;

    private String carPhoto;

    private String carColor;

    private Long operationTime;

    private Integer grade;

    private String gradeCode;

    private String area;

    private String dischargeStandard;

    private String transmission;

    private String volume;

    private String lastTimeToShop;

    private Integer numberOfAccidents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin == null ? null : carVin.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate == null ? null : firstDate.trim();
    }

    public Integer getOdometerCount() {
        return odometerCount;
    }

    public void setOdometerCount(Integer odometerCount) {
        this.odometerCount = odometerCount;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    public String getDrivingUrl() {
        return drivingUrl;
    }

    public void setDrivingUrl(String drivingUrl) {
        this.drivingUrl = drivingUrl == null ? null : drivingUrl.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto == null ? null : carPhoto.trim();
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor == null ? null : carColor.trim();
    }

    public Long getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Long operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode == null ? null : gradeCode.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDischargeStandard() {
        return dischargeStandard;
    }

    public void setDischargeStandard(String dischargeStandard) {
        this.dischargeStandard = dischargeStandard == null ? null : dischargeStandard.trim();
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null ? null : transmission.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getLastTimeToShop() {
        return lastTimeToShop;
    }

    public void setLastTimeToShop(String lastTimeToShop) {
        this.lastTimeToShop = lastTimeToShop == null ? null : lastTimeToShop.trim();
    }

    public Integer getNumberOfAccidents() {
        return numberOfAccidents;
    }

    public void setNumberOfAccidents(Integer numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }
}