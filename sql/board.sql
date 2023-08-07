create table board(
	id int auto_increment primary key,
	title varchar(100),
    pname varchar(100),
    pw varchar(100),
    upfile varchar(100),
    content varchar(9999),
    reg_date timestamp,
    cnt int,
    seq int,
    lev int,
    gid int
);

create table gallery(
	id int auto_increment primary key,
	gtitle varchar(100),
    pname varchar(100),
    pw varchar(100),
    upfile varchar(100),
    gcontent varchar(9999),
    reg_date timestamp,
    cnt int
);

insert into board (id, title, pname, pw, content, reg_date, cnt, seq, lev, gid)
values
(1, '첫글이다', '현빈', '1111', '첫글 내용', '2023-06-05', 0, 0, 0, 1),
(2, '두글이다', '원빈', '1111', '두글 내용', '2023-06-07', 0, 0, 0, 2),
(3, '세글이다', '투빈', '1111', '세글 내용', '2023-06-10', 0, 0, 0, 3),
(4, '네글이다', '골빈', '1111', '네글 내용', '2023-06-12', 0, 0, 0, 4),
(5, '다섯글이다', '장희빈', '1111', '오글 오글', '2023-06-19', 0, 0, 0, 5),
(6, '첫글이다', '현빈', '1111', '첫글 내용', '2023-06-05', 0, 0, 0, 6),
(7, '두글이다', '원빈', '1111', '두글 내용', '2023-06-07', 0, 0, 0, 7),
(8, '세글이다', '투빈', '1111', '세글 내용', '2023-06-10', 0, 0, 0, 8),
(9, '네글이다', '골빈', '1111', '네글 내용', '2023-06-12', 0, 0, 0, 9);

insert into board (id, title, pname, pw, content, reg_date, cnt, seq, lev, gid)
values
(40, '영글이다', '장희빈', '1111', '오글 오글', '2023-06-19', 0, 0, 0, 40),
(41, '첫글이다', '현빈', '1111', '첫글 내용', '2023-06-05', 0, 0, 0, 41),
(42, '두글이다', '원빈', '1111', '두글 내용', '2023-06-07', 0, 0, 0, 42),
(43, '세글이다', '투빈', '1111', '세글 내용', '2023-06-10', 0, 0, 0, 43),
(44, '네글이다', '골빈', '1111', '네글 내용', '2023-06-12', 0, 0, 0, 44),
(45, '다섯글이다', '장희빈', '1111', '오글 오글', '2023-06-19', 1, 1, 0, 45),
(46, '첫글이다', '현빈', '1111', '첫글 내용', '2023-06-05', 0, 0, 0, 46),
(47, '두글이다', '원빈', '1111', '두글 내용', '2023-06-07', 0, 1, 1, 47),
(48, '세글이다', '투빈', '1111', '세글 내용', '2023-06-10', 0, 2, 2, 48),
(49, '네글이다', '골빈', '1111', '네글 내용', '2023-06-12', 0, 3, 1, 49);


insert into gallery (title, pname, pw, content, reg_date, cnt)
values
(1, '사진1', '유진', '1111', '사진입니다.', '2023-08-07', 0);

select * from db322.board;

select * from db322.gallery;

drop table board;
drop table gallery;