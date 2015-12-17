# spring-social-weibo

 spring-social是一个非常不错的社区接入框架,spring的拓展性没的说杠杠的.<br>
 为什么我天朝的weibo库就不更新了呢,还停留在1.0.1-SNAPSHOT,已经不能正常使用了,这是要抛弃我们这些天朝的小伙伴啊.<br>
 <br>
 <br>
 spring不维护了,怎么办怎么办???<br>
 
 打开Idea ,fork代码,咋们自己撸起来,欢迎各位大神pull Request. <br>
 
 现在已经可以对接最新的weibo oauth2了,代码结构未发生变化,后期还需要继续优化
 
 
 #fixed issue
 
 1. 废弃了老版本的jackson,使用的是改版后的jackson
 2. 更新weibo相关API
 3. 升级social-core版本
 4. 相关阻塞BUG
 

If you are using this project, you should probably consider to read the [term of use of Weibo](http://open.weibo.com/wiki/%E5%BA%94%E7%94%A8%E5%BC%80%E5%8F%91%E8%80%85%E5%8D%8F%E8%AE%AE)

# Getting started

In order to get started with spring-social-weibo, you have to follow only 3 simple steps.

## Step 1: Get the code from GitHub

git clone --recursive https://github.com/cyzaoj/spring-social-weibo.git

## Step 2: Use Maven to build project

cd spring-social-weibo
mvn clean install

## Step 3: Add spring-social-weibo as a Maven dependency

	<dependency>
	    <groupId>org.springframework.social</groupId>
	    <artifactId>spring-social-weibo</artifactId>
        <version>1.0.1-beta1</version>
    </dependency>

# License

This project is available under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
