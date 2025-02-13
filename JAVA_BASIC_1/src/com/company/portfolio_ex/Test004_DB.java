package com.company.portfolio_ex;

public class Test004_DB {
	public static void main(String[] args) {
		
	}
}

/*
0.	기능
자원관리봉사자관리
		사용자		관리자측
CREATE	-			등록
READ	-			전체, 봉사자검색
UPDATE	-			봉사자정보수정
DELETE	-			봉사자정보삭제

1.	model (저장소)

--------------------------------------
no		name		email			date
--------------------------------------
1		aaa			aaa@gmail.com	2025-02-13
2		bbb			bbb@gmail.com	2025-02-13

1-1. table (userinfo)
	no		number		 NOT NULL	PRIMARY KEY
	name 	varchar2(20) NOT NULL	
	email	varchar2(20) NOT NULL
	date	timestamp
	
	CREATE TABLE userinfo(
		no 		NUMBER NOT NULL PRIMARY KEY,
		name 	VARCHAR2(20) NOT NULL,
		email	VARCHAR2(20) NOT NULL,
    	udate 	TIMESTAMP    DEFAULT CURRENT_TIMESTAMP
	)

	sequence 명 : seq_userinfo

	CREATE SEQUENCE seq_userinfo;
	
	
1-2. crud(inesrt, select, update, delete)
	INSERT INTO userinfo(no, name, email) VALUES (seq_userinfo.nextval, 'dd','dd@gmail.com');
	INSERT INTO userinfo(no, name, email) VALUES (seq_userinfo.nextval, 'ss','ss@gmail.com');

	SELECT name FROM userinfo; / SELECT name FROM WHERE no=2;
	UPDATE userinfo SET email='abc@gmail.com' WHERE no=2;
	DELETE FROM userinfo WHERE no=2;
	
	
1-3. Dto	UserInfo
1-4. Dao	

2. controller (처리)
3. view (사용자 화면)
*/