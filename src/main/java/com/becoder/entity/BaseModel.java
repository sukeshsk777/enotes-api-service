package com.becoder.entity;

import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
public class BaseModel {
	private Boolean isActive;
	private Boolean isDeleted;
	private Integer createdBy;
	private Data createdon;
	private Integer updatedBy;
	private Date updatedon;

}
