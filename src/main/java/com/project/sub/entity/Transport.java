package com.project.sub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
private String driverName;
private String vehicalName;
private String vehicalNumber;
private String startingPoint;
private String endingPoint;
private String transport;
private Long vehicalLoad;
private Long vehicalCapacity;
public Transport() {
	
}
public Transport(Long id, String driverName, String vehicalName, String vehicalNumber, String startingPoint,
		String endingPoint, String transport, Long vehicalLoad, Long vehicalCapacity) {
	super();
	this.id = id;
	this.driverName = driverName;
	this.vehicalName = vehicalName;
	this.vehicalNumber = vehicalNumber;
	this.startingPoint = startingPoint;
	this.endingPoint = endingPoint;
	this.transport = transport;
	this.vehicalLoad = vehicalLoad;
	this.vehicalCapacity = vehicalCapacity;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public String getVehicalName() {
	return vehicalName;
}
public void setVehicalName(String vehicalName) {
	this.vehicalName = vehicalName;
}
public String getVehicalNumber() {
	return vehicalNumber;
}
public void setVehicalNumber(String vehicalNumber) {
	this.vehicalNumber = vehicalNumber;
}
public String getStartingPoint() {
	return startingPoint;
}
public void setStartingPoint(String startingPoint) {
	this.startingPoint = startingPoint;
}
public String getEndingPoint() {
	return endingPoint;
}
public void setEndingPoint(String endingPoint) {
	this.endingPoint = endingPoint;
}
public String getTransport() {
	return transport;
}
public void setTransport(String transport) {
	this.transport = transport;
}
public Long getVehicalLoad() {
	return vehicalLoad;
}
public void setVehicalLoad(Long vehicalLoad) {
	this.vehicalLoad = vehicalLoad;
}
public Long getVehicalCapacity() {
	return vehicalCapacity;
}
public void setVehicalCapacity(Long vehicalCapacity) {
	this.vehicalCapacity = vehicalCapacity;
}

}
