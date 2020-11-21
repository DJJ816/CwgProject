package com.bdqn.pojo;


public class CwgClient {

  private long id;
  private String userName;
  private long createBy;
  private java.sql.Timestamp creationDate;
  private String detail;
  private String reserve;
  private String spare;
  private String standby;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getCreateBy() {
    return createBy;
  }

  public void setCreateBy(long createBy) {
    this.createBy = createBy;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
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

}
