--회원 테이블
create table member(
 me_num number primary key,							--회원번호
 me_id varchar2(10) UNIQUE not null,				--ID
 me_passwd varchar2(10) not null,					--PW
 me_name varchar2(30) not null,						--이름
 me_phone varchar2(13) not null,					--전화번호
 me_regdate date default sysdate not null			--가입날짜
);

create sequence member_seq;


--도서 테이블 (관리자가 사용, 회원은 조회)
create table book(
 bk_num number primary key,							--도서번호
 bk_name varchar2(90) not null,						--제목
 bk_category varchar2(30) not null,					--카테고리
 bk_regdate date default sysdate not null			--등록날짜
);

create sequence book_seq;


--예약 테이블(멤버,도서 테이블 참조)
create table reservation(
 re_num number primary key,							--예약번호
 re_status number(1) not null,						--예약상태	0.반납(미대출), 1.대출중
 bk_num number not null references book(bk_num),	--도서번호(참조)
 me_num number not null references member(me_num),	--회원번호(참조)
 re_regdate date default sysdate not null,			--예약(대출)날짜
 re_modifydate date									--수정(반납)날짜
);

create sequence reservation_seq;

