package com.bdqn.pojo;


public class CwgOnrecord {

  private long id;
  private long bid;
  private long uid;
  private long createBy;
  private long checkBy;
  private String recordNumber;
  private String orderNumber;
  private java.sql.Timestamp creationDate;
  private long statusById;
  private long remainingById;
  private String reserve;
  private String spare;
  private String standby;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBid() {
    return bid;
  }

  public void setBid(long bid) {
    this.bid = bid;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getCreateBy() {
    return createBy;
  }

  public void setCreateBy(long createBy) {
    this.createBy = createBy;
  }


  public long getCheckBy() {
    return checkBy;
  }

  public void setCheckBy(long checkBy) {
    this.checkBy = checkBy;
  }


  public String getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
  }


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public long getStatusById() {
    return statusById;
  }

  public void setStatusById(long statusById) {
    this.statusById = statusById;
  }


  public long getRemainingById() {
    return remainingById;
  }

  public void setRemainingById(long remainingById) {
    this.remainingById = remainingById;
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
