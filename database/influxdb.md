## InfluxDB 数据库简介

### 1.InfluxDB介绍
    Go编写的开源分布式时序、事件和指标数据库
    提供HTTP接口的API来操作数据
    一般用来存储实时数据
    
### 2.一些特性
> 与传统数据库对比 

    InfluxDB名词   |   传统数据库中的概念 
    database           数据库
    measurement        表
    point              表里的一行数据
    
> Point

    # Point由时间戳(time)、数据(field)、标签(tag)组成
    Point属性  |  传统数据库中的概念
    time          每个数据记录时间，数据库的主索引(会自动生成)
    field         各种记录值(没有索引的属性)
    tag           各种有索引的属性