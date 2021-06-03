create database qlkb;
use qlkb;
create table BACSI (MABS char(4), TENBS varchar(20);
create table BENHNHAN (MABN char(4), TENBN varchar(20), NGSINH date, DCHI varchar(50), DTHOAI varchar(10), GIOITINH boolean);
create table KHAMBENH (MAKB char(6), MABN char(4), MABS char(4), NGAYKHAM date,YEUCAUKHAM varchar(50), KETLUAN varchar(100), THANHTOAN boolean);
create table DICHVU (MADV char(6), TENDV varchar(20), DONGIA bigint);
create table THUPHI (MAKB char(6), MADV char(6), SOLUONG int, THANHTIEN bigint);