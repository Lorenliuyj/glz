/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/3/22 11:55:18                           */
/*==============================================================*/


drop table if exists t_department;

drop table if exists t_dict;

drop table if exists t_func;

drop table if exists t_poverty_people;

drop table if exists t_poverty_visit;

drop table if exists t_role;

drop table if exists t_role_func;

drop table if exists t_trouble_tpye;

drop table if exists t_user;

drop table if exists t_user_dept;

drop table if exists t_user_role;

drop table if exists t_user_village;

drop table if exists t_village;

/*==============================================================*/
/* Table: t_department                                          */
/*==============================================================*/
create table t_department
(
   ID                   bigint(15) not null comment '����',
   DEPT_NAME            varchar(64) comment '��������',
   DEPT_CODE            varchar(15) comment '���ű���',
   DEPT_CHARGE          bigint(15) comment '���Ÿ�����',
   COMMENTS             varchar(120) comment '���Ž���',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_department comment '���ű�';

/*==============================================================*/
/* Table: t_dict                                                */
/*==============================================================*/
create table t_dict
(
   ID                   bigint not null,
   PARENT_ID            bigint comment '��ID',
   DICT_TYPE            varchar(64) comment '��������',
   DICT_NAME            varchar(64) comment '��������',
   DICT_VALUE           varchar(64) comment '����ֵ',
   COMMENTS             varbinary(128) comment '��ע',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_dict comment '�����ֵ��';

/*==============================================================*/
/* Table: t_func                                                */
/*==============================================================*/
create table t_func
(
   ID                   bigint(15) not null comment 'id',
   PARANT_ID            bigint(15) comment '��id',
   FUNC_CODE            bigint(15) comment '���ܴ���',
   FUNC_NAME            varchar(25) comment '��������',
   STATUS               char(1) comment '����״̬',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_func comment '���ܱ�';

/*==============================================================*/
/* Table: t_poverty_people                                      */
/*==============================================================*/
create table t_poverty_people
(
   ID                   bigint(15) not null,
   POVERTY_NAME         varchar(15) comment 'ƶ��������',
   SEX                  char(1) comment '�Ա�',
   IDCARD_NO            char(18) comment '���֤',
   BIRTHDAY             date comment '��������',
   VILLAGE_ID           char(15) comment '��������',
   DEPT_ID              varchar(15) comment '����һ��ID(�ֵ��)',
   TROUBLE_ID           varchar(15) comment '���Ŷ���ID(�ֵ��)',
   ADDRESS              varchar(256) comment '��ַ',
   PHONE                char(15) comment '�绰',
   FAMILY_DETAIL        varchar(1000) comment '��ͥ����',
   TROUBLE_DESC         varchar(1000) comment '��������',
   IMAGE_1              longblob,
   IMAGE_2              longblob,
   IMAGE_3              longblob,
   IMAGE_MIN            longblob,
   INCOME               varchar(1000) comment '����',
   COMMENTS             varchar(256),
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_poverty_people comment 'ƶ������';

/*==============================================================*/
/* Table: t_poverty_visit                                       */
/*==============================================================*/
create table t_poverty_visit
(
   ID                   bigint(15) not null,
   POVERTY_PEOPLE_ID    bigint(15) comment '���߷���ID',
   BIRTHDAY             date comment '��������',
   VILLAGE_ID           varbinary(15) comment '��������',
   VISIT_DATE           date comment 'ο������',
   FAMILY_DETAIL        varbinary(500) comment '��ͥ���',
   VISITOR_ID           bigint comment '�߷���id',
   VISIT_GOODS          date comment 'ο����Ʒ',
   MASS_APPEAL          varbinary(1000) comment 'Ⱥ������',
   VISIT_DETAIL         varbinary(1000) comment 'ο������',
   IMAGE_1              longblob,
   IMAGE_2              longblob,
   IMAGE_3              longblob,
   IMAGE_MIN            longblob,
   COMMENTS             varbinary(1000) comment '��ע',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_poverty_visit comment '�߷ü�¼��';

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   ID                   bigint(15) not null comment 'id',
   ROLE_NAME            varchar(24) comment '��ɫ����',
   COMMENTS             varchar(64) comment '��ע',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_role comment '��ɫ��';

/*==============================================================*/
/* Table: t_role_func                                           */
/*==============================================================*/
create table t_role_func
(
   ID                   bigint(15) not null comment 'id',
   ROLE_ID              bigint(15) comment '��ɫid',
   FUNC_ID              bigint(15) comment '����id',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_role_func comment '��ɫ���ܱ�';

/*==============================================================*/
/* Table: t_trouble_tpye                                        */
/*==============================================================*/
create table t_trouble_tpye
(
   ID                   bigint(15) not null,
   DEPT_ID              bigint(15) comment '����id',
   TROUBLE_CODE         varchar(15) comment '����code',
   TROUBLE_NAME         varchar(64) comment '��������',
   COMMENTS             varchar(120) comment '����',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_trouble_tpye comment '�������ͱ�';

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   ID                   bigint(15) not null comment '����ID',
   USER_NAME            varchar(64) comment '�û���',
   PASSWORD             varchar(64) comment '����',
   TRUE_NAME            varchar(64) comment '��ʵ����',
   SEX                  CHAR(1) comment '�Ա�',
   HEAD_IMG             blob(1000) comment '����ͷ��',
   MOBILE               CHAR(11) comment '�ֻ�����',
   EMAIL                varbinary(64) comment '��������',
   LOGIN_TIMES          varbinary(64) comment '��¼����',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user comment '�û���';

/*==============================================================*/
/* Table: t_user_dept                                           */
/*==============================================================*/
create table t_user_dept
(
   ID                   bigint(15) not null comment 'ID',
   USER_ID              bigint(15) comment '�û�id',
   DEPT_ID              bigint(15) comment '����',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user_dept comment '�û����ű�';

/*==============================================================*/
/* Table: t_user_role                                           */
/*==============================================================*/
create table t_user_role
(
   ID                   bigint(15) not null comment 'ID',
   USER_ID              bigint(15) comment '�û�',
   ROLE_ID              bigint(15) comment '��ɫ',
   COMMENTS             varchar(64) comment '��ע',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user_role comment '�û���ɫ��';

/*==============================================================*/
/* Table: t_user_village                                        */
/*==============================================================*/
create table t_user_village
(
   ID                   bigint(15) not null comment 'ID',
   USER_ID              bigint(15),
   VILLAGE_ID           bigint(15),
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user_village comment '�û������';

/*==============================================================*/
/* Table: t_village                                             */
/*==============================================================*/
create table t_village
(
   ID                   binary(15) not null comment 'ID',
   CODE                 varbinary(15) comment '���',
   NAME                 varbinary(15) comment '����',
   COMMENTS             varchar(64) comment '��ע',
   CREATE_ID            bigint(15) comment '������',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_village comment '�����';

