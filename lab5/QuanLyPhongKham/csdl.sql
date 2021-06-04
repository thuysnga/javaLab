create database qlkb;
use qlkb;

CREATE TABLE BACSI (MABS char(4) PRIMARY KEY,TENBS varchar(20)CHARACTER SET utf8 COLLATE utf8_unicode_ci );
CREATE TABLE BENHNHAN (MABN char(4) PRIMARY KEY,TENBN varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci,NGSINH date,DCHI varchar(50)CHARACTER SET utf8 COLLATE utf8_unicode_ci,DTHOAI varchar(10),GIOITINH boolean );
CREATE TABLE KHAMBENH(MAKB char(6) PRIMARY KEY,MABN char(4),MABS char(4),NGAYKHAM date,YEUCAUKHAM varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci,KETLUAN varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci,THANHTOAN boolean );
CREATE TABLE DICHVU (MADV char(6) PRIMARY KEY,TENDV varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci,DONGIA bigint );
CREATE TABLE THUPHI (MAKB char(6),MADV char(6),SOLUONG int,THANHTIEN bigint,PRIMARY KEY (MAKB, MADV));

insert into BACSI values ("bs1","Bac si 1");
insert into BACSI values ("bs2","Bac si 2");
insert into BENHNHAN values ("bn1","Benh nhan 1","2003-01-03","Dak Lak","090302",true);
insert into BENHNHAN values ("bn2","Benh nhan 2","2003-05-11","Ho Chi Minh","030422",false);
insert into KHAMBENH values ("kb1", "bn1","bs2","2021-04-05","Kham tong quat","Binh thuong",false);
insert into KHAMBENH values ("kb2", "bn2","bs1","2021-06-05","Kham tong quat","Binh thuong",false);
insert into DICHVU values ("dv1","Kham benh",100000);
insert into DICHVU values ("dv2","Thue phong",300000);
insert into THUPHI values ("kb1","dv1","1",100000);
insert into THUPHI values ("kb2","dv2","3",900000);

select * from BACSI;
select * from BENHNHAN;
select * from KHAMBENH;
select * from DICHVU;
select * from THUPHI;

