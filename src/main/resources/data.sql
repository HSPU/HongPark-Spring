INSERT INTO article(id, title, content) VALUES (1, '가가가가', '1111');
INSERT INTO article(id, title, content) VALUES (2, '나나나나', '2222');
INSERT INTO article(id, title, content) VALUES (3, '다다다다', '3333');

-- article 더미 데이터 추가
INSERT INTO article(id, title, content) VALUES (4, '풀업', '몇 회?');
INSERT INTO article(id, title, content) VALUES (5, '푸쉬업', '몇 회?');
INSERT INTO article(id, title, content) VALUES (6, '딥스', '몇 회?');

-- comment 더미 데이터
---- 4번 게시글의 댓글들
INSERT INTO comment(id, article_id, nickname, body) VALUES (1, 4, '준명', '40회');
INSERT INTO comment(id, article_id, nickname, body) VALUES (2, 4, '한별', '30회');
INSERT INTO comment(id, article_id, nickname, body) VALUES (3, 4, '웅진', '28회');

---- 5번 게시글의 댓글들
INSERT INTO comment(id, article_id, nickname, body) VALUES (4, 5, '준명', '70회');
INSERT INTO comment(id, article_id, nickname, body) VALUES (5, 5, '한별', '50회');
INSERT INTO comment(id, article_id, nickname, body) VALUES (6, 5, '웅진', '60회');

---- 6번 게시글의 댓글들
INSERT INTO comment(id, article_id, nickname, body) VALUES (7, 6, '준명', '50회');
INSERT INTO comment(id, article_id, nickname, body) VALUES (8, 6, '한별', '40회');
INSERT INTO comment(id, article_id, nickname, body) VALUES (9, 6, '웅진', '50회');