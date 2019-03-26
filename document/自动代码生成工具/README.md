mybatis-generator-gui
==============

mybatis-generator-gui是基于[mybatis generator](http://www.mybatis.org/generator/index.html)开发一款界面工具, 本工具可以使你非常容易及快速生成Mybatis的Java POJO文件及数据库Mapping文件。

![image](https://user-images.githubusercontent.com/3505708/49334784-1a42c980-f619-11e8-914d-9ea85db9cec3.png)


![basic](https://user-images.githubusercontent.com/3505708/51911610-45754980-240d-11e9-85ad-643e55cafab2.png)


![overSSH](https://user-images.githubusercontent.com/3505708/51911646-5920b000-240d-11e9-9048-738306a56d14.png)

### 核心特性
* 按照界面步骤轻松生成代码，省去XML繁琐的学习与配置过程
* 保存数据库连接与Generator配置，每次代码生成轻松搞定
* 内置常用插件，比如分页插件
* 支持OverSSH 方式，通过SSH隧道连接至公司内网访问数据库
* 把数据库中表列的注释生成为Java实体的注释，生成的实体清晰明了
* 可选的去除掉对版本管理不友好的注释，这样新增或删除字段重新生成的文件比较过来清楚
* 目前已经支持Mysql、Mysql8、Oracle、PostgreSQL与SQL Server，暂不对其他非主流数据库提供支持。(MySQL支持的比较好，其他数据库有什么问题可以在issue中反馈)

### 要求
本工具由于使用了Java 8的众多特性，所以要求JDK <strong>1.8.0.60</strong>以上版本，另外<strong>JDK 1.9</strong>暂时还不支持。


### 启动本软件

* 方法一：
```bash
    cd /your_download_folder
    java -jar mybatis-generator-gui.jar
```
