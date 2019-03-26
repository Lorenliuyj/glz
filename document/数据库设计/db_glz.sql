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
   ID                   bigint(15) not null comment '主键',
   DEPT_NAME            varchar(64) comment '部门名称',
   DEPT_CODE            varchar(15) comment '部门编码',
   DEPT_CHARGE          bigint(15) comment '部门负责人',
   COMMENTS             varchar(120) comment '部门介绍',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_department comment '部门表';

/*==============================================================*/
/* Table: t_dict                                                */
/*==============================================================*/
create table t_dict
(
   ID                   bigint not null,
   PARENT_ID            bigint comment '父ID',
   DICT_TYPE            varchar(64) comment '数据类型',
   DICT_NAME            varchar(64) comment '数据名称',
   DICT_VALUE           varchar(64) comment '数据值',
   COMMENTS             varbinary(128) comment '备注',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_dict comment '数据字典表';

/*==============================================================*/
/* Table: t_func                                                */
/*==============================================================*/
create table t_func
(
   ID                   bigint(15) not null comment 'id',
   PARANT_ID            bigint(15) comment '父id',
   FUNC_CODE            bigint(15) comment '功能代码',
   FUNC_NAME            varchar(25) comment '功能名称',
   STATUS               char(1) comment '功能状态',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_func comment '功能表';

/*==============================================================*/
/* Table: t_poverty_people                                      */
/*==============================================================*/
create table t_poverty_people
(
   ID                   bigint(15) not null,
   POVERTY_NAME         varchar(15) comment '贫困户姓名',
   SEX                  char(1) comment '性别',
   IDCARD_NO            char(18) comment '身份证',
   BIRTHDAY             date comment '出生日期',
   VILLAGE_ID           char(15) comment '所属村落',
   DEPT_ID              varchar(15) comment '部门一级ID(字典表)',
   TROUBLE_ID           varchar(15) comment '部门二级ID(字典表)',
   ADDRESS              varchar(256) comment '地址',
   PHONE                char(15) comment '电话',
   FAMILY_DETAIL        varchar(1000) comment '家庭详情',
   TROUBLE_DESC         varchar(1000) comment '困难内容',
   IMAGE_1              longblob,
   IMAGE_2              longblob,
   IMAGE_3              longblob,
   IMAGE_MIN            longblob,
   INCOME               varchar(1000) comment '收入',
   COMMENTS             varchar(256),
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_poverty_people comment '贫困户表';

/*==============================================================*/
/* Table: t_poverty_visit                                       */
/*==============================================================*/
create table t_poverty_visit
(
   ID                   bigint(15) not null,
   POVERTY_PEOPLE_ID    bigint(15) comment '被走访人ID',
   BIRTHDAY             date comment '出生日期',
   VILLAGE_ID           varbinary(15) comment '所属村落',
   VISIT_DATE           date comment '慰问日期',
   FAMILY_DETAIL        varbinary(500) comment '家庭情况',
   VISITOR_ID           bigint comment '走访人id',
   VISIT_GOODS          date comment '慰问物品',
   MASS_APPEAL          varbinary(1000) comment '群众诉求',
   VISIT_DETAIL         varbinary(1000) comment '慰问详情',
   IMAGE_1              longblob,
   IMAGE_2              longblob,
   IMAGE_3              longblob,
   IMAGE_MIN            longblob,
   COMMENTS             varbinary(1000) comment '备注',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_poverty_visit comment '走访记录表';

/*==============================================================*/
/* Table: t_role                                                */
/*==============================================================*/
create table t_role
(
   ID                   bigint(15) not null comment 'id',
   ROLE_NAME            varchar(24) comment '角色名称',
   COMMENTS             varchar(64) comment '备注',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_role comment '角色表';

/*==============================================================*/
/* Table: t_role_func                                           */
/*==============================================================*/
create table t_role_func
(
   ID                   bigint(15) not null comment 'id',
   ROLE_ID              bigint(15) comment '角色id',
   FUNC_ID              bigint(15) comment '功能id',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_role_func comment '角色功能表';

/*==============================================================*/
/* Table: t_trouble_tpye                                        */
/*==============================================================*/
create table t_trouble_tpye
(
   ID                   bigint(15) not null,
   DEPT_ID              bigint(15) comment '部门id',
   TROUBLE_CODE         varchar(15) comment '困难code',
   TROUBLE_NAME         varchar(64) comment '困难名称',
   COMMENTS             varchar(120) comment '介绍',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_trouble_tpye comment '困难类型表';

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   ID                   bigint(15) not null comment '主键ID',
   USER_NAME            varchar(64) comment '用户名',
   PASSWORD             varchar(64) comment '密码',
   TRUE_NAME            varchar(64) comment '真实姓名',
   SEX                  CHAR(1) comment '性别',
   HEAD_IMG             blob(1000) comment '个人头像',
   MOBILE               CHAR(11) comment '手机号码',
   EMAIL                varbinary(64) comment '电子邮箱',
   LOGIN_TIMES          varbinary(64) comment '登录次数',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user comment '用户表';

/*==============================================================*/
/* Table: t_user_dept                                           */
/*==============================================================*/
create table t_user_dept
(
   ID                   bigint(15) not null comment 'ID',
   USER_ID              bigint(15) comment '用户id',
   DEPT_ID              bigint(15) comment '部门',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user_dept comment '用户部门表';

/*==============================================================*/
/* Table: t_user_role                                           */
/*==============================================================*/
create table t_user_role
(
   ID                   bigint(15) not null comment 'ID',
   USER_ID              bigint(15) comment '用户',
   ROLE_ID              bigint(15) comment '角色',
   COMMENTS             varchar(64) comment '备注',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user_role comment '用户角色表';

/*==============================================================*/
/* Table: t_user_village                                        */
/*==============================================================*/
create table t_user_village
(
   ID                   bigint(15) not null comment 'ID',
   USER_ID              bigint(15),
   VILLAGE_ID           bigint(15),
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_user_village comment '用户村落表';

/*==============================================================*/
/* Table: t_village                                             */
/*==============================================================*/
create table t_village
(
   ID                   binary(15) not null comment 'ID',
   CODE                 varbinary(15) comment '编号',
   NAME                 varbinary(15) comment '名称',
   COMMENTS             varchar(64) comment '备注',
   CREATE_ID            bigint(15) comment '创建人',
   CREATE_TIME          timestamp,
   LAST_MODIFY_TIME     datetime,
   IS_DELETE            char(1),
   primary key (ID)
);

alter table t_village comment '村落表';

