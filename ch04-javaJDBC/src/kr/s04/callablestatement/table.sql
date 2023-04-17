create table salary(
 name varchar2(10) primary key,
 pay number not null
);

insert into salary values ('SMITH',1000);
insert into salary values ('PETER',2000);
insert into salary values ('JOHN',3000);

commit;


create or replace procedure adjust (n in varchar2, rate in float)
is
 newpay float;
begin
	select pay into newpay from salary
	where name=n;
	
	newpay := newpay + newpay*rate;
	update salary set pay = newpay where name=n;
	commit;
	
	exception when others then
	dbms_output.put_line('error occurred');
	rollback;
end;