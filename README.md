# mybatis-generator
使用mybatis-generator逆向工程，自动生成实体类、DAO、Mapper文件。   
因为本人是在IDEA中使用，以下给出IDEA中使用方法。    
1.将lib下的mysql-connector-java-5.1.29.jar复制出来，放在E盘下   
2.配置generator.properties文件中的数据库信息   
3.配置generatorConfig.xml中的表名及其他信息    
4.使用IDEA添加一个RunConfiguration，新建的时候使用Maven，名称为generator，Command line为mybatis-generator:generate -e   
5.运行4中配置好的run选项   
