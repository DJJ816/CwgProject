package com.bdqn.pojo;


public class CwgOnrecoreStatus {

  private long id;
  private long recoreId;
  private java.sql.Timestamp creationDate;
  private long checkstatus;
  private long createBy;
  private String detail;
  private String reserve;
  private String spare;
  private String standby;
  private java.sql.Timestamp timeout;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRecoreId() {
    return recoreId;
  }

  public void setRecoreId(long recoreId) {
    this.recoreId = recoreId;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public long getCheckstatus() {
    return checkstatus;
  }

  public void setCheckstatus(long checkstatus) {
    this.checkstatus = checkstatus;
  }


  public long getCreateBy() {
    return createBy;
  }

  public void setCreateBy(long createBy) {
    this.createBy = createBy;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public String getReserve() {
    return reserve;
  }

  public void setReserve(String reserve) {
    this.reserve = reserve;
  }


  public String getSpare() {
    return spare;
  }

  public void setSpare(String spare) {
    this.spare = spare;
  }


  public String getStandby() {
    return standby;
  }

  public void setStandby(String standby) {
    this.standby = standby;
  }


  public java.sql.Timestamp getTimeout() {
    return timeout;
  }

  public void setTimeout(java.sql.Timestamp timeout) {
    this.timeout = timeout;
  }

}
