CREATE DATABASE crm CHARACTER SET utf8;
USE crm;
# 人力资源部(HRM)

# 部门
CREATE TABLE crm_department(
  depId VARCHAR (32) PRIMARY KEY NOT NULL,
  depName VARCHAR (50) DEFAULT NULL
);

#职务
CREATE TABLE crm_post(
  postId VARCHAR (32) PRIMARY KEY NOT NULL ,
  postName VARCHAR (100) DEFAULT NULL ,
  depId VARCHAR (32) DEFAULT NULL ,
  CONSTRAINT dep_id_fk FOREIGN KEY (depId) REFERENCES crm_department (depId)
);

# 员工
CREATE TABLE crm_staff(
  staffId VARCHAR (32) PRIMARY KEY NOT NULL,
  loginName VARCHAR (100) DEFAULT NULL ,
  loginPwd VARCHAR (100) DEFAULT NULL ,
  staffName VARCHAR (100) DEFAULT NULL,
  gender VARCHAR (20) DEFAULT NULL ,
  onDutyDate DATETIME DEFAULT NULL
);

# 员工和职务的关系表
CREATE TABLE crm_post_staff(
  staffId VARCHAR (32) ,
  postId VARCHAR (32) ,
  PRIMARY KEY (postId,staffId),
  CONSTRAINT post_id_fk FOREIGN KEY (postId) REFERENCES crm_post(postId),
  CONSTRAINT staff_id_fk FOREIGN KEY (staffId) REFERENCES crm_staff(staffId)
);