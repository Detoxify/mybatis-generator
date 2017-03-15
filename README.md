# mybatis-generator
使用mybatis-generator逆向工程，自动生成实体类、DAO、Mapper文件。   
因为本人是在IDEA中使用，以下给出IDEA中使用方法。    
1.将项目导入IDEA   
2.配置generatorConfig.xml中的表名及其他信息   
3.建好以上配置中的包	  
4.使用IDEA右侧maven中的Plugins中的mybatis-generator下的第一个，直接run    
5.使用IDEA添加一个RunConfiguration，新建的时候使用Maven，名称为generator，Command line为mybatis-generator:generate -e   

