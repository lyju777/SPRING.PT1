create table tb_tbuser(
    id number(7) not null,
    userid varchar2(20) not null,
    userpw varchar2(20) not null,
    email varchar2(20) not null,
    reg_date date default sysdate,
    update_date date
);

create sequence seq_tbuser
 increment by 1
 start with 1;


select * from tb_tbuser;
drop table tbuser;