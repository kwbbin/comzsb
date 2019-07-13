CREATE TABLE `College` (
`CollegeId` int NOT NULL,
`CollegeName` char(20) NOT NULL,
PRIMARY KEY (`CollegeId`) 
);

CREATE TABLE `examPlace` (
`id` int NOT NULL,
`classNo` char(3) NULL,
`place` char(10) NULL,
`wheClass` char(1) NULL,
`maxNum` int NULL,
`suitprofession` char(200) NULL,
`isempty` int NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `GradeList` (
`id` int NOT NULL,
`wbh` char(9) NULL,
`subNum` char(3) NULL,
`grade` int NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `NoticInfo` (
`noticNo` int NOT NULL,
`senderId` int NULL,
`sendTSime` datetime NULL,
`theme` char(40) NULL,
`content` text NULL,
`fileurl` char(100) NULL,
`BkYear` date NULL,
PRIMARY KEY (`noticNo`) 
);


CREATE TABLE `profession` (
`proNum` int NOT NULL,
`proName` char(20) NULL,
`proOrder` int NULL COMMENT '排序',
`xz` int NULL COMMENT '学制',
`nowNum` int NULL COMMENT '目前报考人数',
`subjectone` int NULL,
`subjecttwo` int NULL,
`subjectthree` int NULL,
`subjectfore` int NULL,
PRIMARY KEY (`proNum`) 
);

CREATE TABLE `stusecurity` (
`id` int NOT NULL,
`identityCard` char(18) NOT NULL,
`wbh` char(9) NULL,
`email` char(20) NULL,
`questionOne` int NULL,
`ansOne` char(20) NULL,
`questionTwo` int NULL,
`ansTwo` char(20) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `subject` (
`subNum` int NOT NULL,
`subName` char(20) NULL,
PRIMARY KEY (`subNum`) 
);

CREATE TABLE `baseInformation` (
`baseInfoId` int NOT NULL,
`collegeId` int NULL,
`year` char(4) NULL,
`registerBegin` datetime NULL,
`registerEnd` datetime NULL,
`joinBegin` datetime NULL,
`joinEnd` datetime NULL,
`checkBegin` datetime NULL,
`checkEnd` datetime NULL,
`dowloadBegin` datetime NULL,
`dowloadEnd` datetime NULL,
`gradeBegin` datetime NULL,
`gradeEnd` datetime NULL,
`projoinBegin` datetime NULL,
`projoinEnd` datetime NULL,
PRIMARY KEY (`baseInfoId`) 
);

CREATE TABLE `adminInformation` (
`id` int NOT NULL,
`userName` char(20) NULL,
`tname` char(20) NULL,
`tpassword` char(18) NULL,
`tphone` char(20) NULL,
`temail` char(20) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `subjectbasic` (
`id` int NOT NULL,
`subjectid` int NOT NULL,
`subjecttime` datetime NOT NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `student` (
`id` int NOT NULL,
`name` char(20) NULL,
`sex` char(1) NULL,
`nation` char(12) NULL,
`policy` char(12) NULL,
`borthday` date NULL,
`identityCard` char(18) NULL COMMENT '身份证',
`zunkaozheng` char(18) NOT NULL,
`collegeid` int NULL,
`professionid` int NULL,
`toCollegeid` int NULL,
`toprofessionid` int NULL,
`award` char(400) NULL,
`merit` char(100) NULL,
`homeAdress` char(60) NULL,
`telephone` char(11) NULL,
`nowAdress` char(60) NULL,
`email` char(20) NULL,
`wbh` char(8) NULL,
`jointime` datetime NULL,
`checked` char(1) NULL,
`isnojoin` int NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `user_question` (
`id` int NOT NULL,
`question` char(50) NULL,
PRIMARY KEY (`id`) 
);


ALTER TABLE `profession` ADD CONSTRAINT `f_projectone` FOREIGN KEY (`subjectone`) REFERENCES `subjectbasic` (`id`);
ALTER TABLE `profession` ADD CONSTRAINT `f_projecttwo` FOREIGN KEY (`subjecttwo`) REFERENCES `subjectbasic` (`id`);
ALTER TABLE `profession` ADD CONSTRAINT `f_projectthree` FOREIGN KEY (`subjectthree`) REFERENCES `subjectbasic` (`id`);
ALTER TABLE `profession` ADD CONSTRAINT `f_projectfore` FOREIGN KEY (`subjectfore`) REFERENCES `subjectbasic` (`id`);
ALTER TABLE `student` ADD CONSTRAINT `f_college` FOREIGN KEY (`collegeid`) REFERENCES `College` (`CollegeId`);
ALTER TABLE `stusecurity` ADD CONSTRAINT `f_questionone` FOREIGN KEY (`questionOne`) REFERENCES `user_question` (`id`);
ALTER TABLE `stusecurity` ADD CONSTRAINT `f_questiontwo` FOREIGN KEY (`questionTwo`) REFERENCES `user_question` (`id`);
ALTER TABLE `subjectbasic` ADD CONSTRAINT `f_subject` FOREIGN KEY (`subjectid`) REFERENCES `subject` (`subNum`);
ALTER TABLE `student` ADD CONSTRAINT `f_professin` FOREIGN KEY (`professionid`) REFERENCES `profession` (`proNum`);
ALTER TABLE `student` ADD CONSTRAINT `f_toprofession` FOREIGN KEY (`toprofessionid`) REFERENCES `profession` (`proNum`);

