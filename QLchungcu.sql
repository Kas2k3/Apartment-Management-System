create database BlueMoon;

use BlueMoon;

create table admin(
	username varchar(20) not null,
    password varchar(20) not null
);
insert into admin values ('admin', '123456');

create table hokhau (
	MaHoKhau varchar(10) primary key,
    TenChuHo nvarchar(20) not null,
    DiaChiHoKhau nvarchar(50) not null,
    DienTich float ,
    ChatLuongChungCu nvarchar(10),
    NgayTao Date ,
    NgaySua Date
);
insert into hokhau values ('HK001', N'Nguy?n V?n A', N'??ng ?a,Hà N?i', 15.4, 'Cao c?p', '2010-10-21', '2020-05-30');

create table nhankhau (
	MaNhanKhau varchar(10) primary key,
    HoTenNhanKhau nvarchar(30) not null,
    SoCCCD varchar(12),
    GioiTinhNhanKhau nvarchar(3),
    NgaySinhNhanKhau Date,
    QuanHeChuHo nvarchar(20)
);
insert into nhankhau values ('NK0001',N'V? H?i ??ng','012345678910',N'Nam','2002-10-21',N'B?');

create table phiquanly (
	MaHoGDPhiQuanLy varchar(10) primary key,
    MaPhiQuanLy varchar(8) not null,
    PhiVanHanh float,
    TinhTrangPhiQuanLy nvarchar(20),
    
    foreign key(MaHoGDPhiQuanLy) references HoKhau(MaHoKhau)
)


create table phimoi (
	MaHoGDPhiMoi varchar (10) primary key,
    PhiGuiXe float,
    PhiDien float,
    PhiNuoc float,
    PhiInternet float,
    TinhTrangPhiMoi nvarchar(10),
    foreign key (MaHoGDPhiMoi) references HoKhau(MaHoKhau)
)

create table phidichvu (
	MaHoGDPhiDichVu varchar(10) primary key,
    MaPhiDichVu varchar(8) not null,
    PhiVeSinh float,
    PhiBaoTri float,
    PhiSHC float,
    PhiAnNinh float,
    TinhTrangPhiDichVu nvarchar(20),
    
    foreign key(MaHoGDPhiDichVu) references HoKhau(MaHoKhau)
)

create table phikhac (
	MaHoGDPhiKhac varchar(10) primary key,
    MaPhiKhac varchar(8) not null,
    QuyBienDao float,
    QuyKhuyenHoc float,
    QuyTuThien float,
    TinhTrangPhiKhac nvarchar(20),
    
    foreign key(MaHoGDPhiKhac) references HoKhau(MaHoKhau)
)




