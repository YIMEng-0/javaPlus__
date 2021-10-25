package jdbc.day01;

/**
 * JDBC 的本质：
 * ｓｕｎ　公司指定的一个接口，接口有着自己的指定者以及实现者；
 * <p>
 * 为什么面向接口编程？
 * 为了解耦合，可以提高执行程序的扩展能力；
 * 这个是一个思想，不能面向具体编程，使得程序的扩展能力得到一定的提升
 * <p>
 * 为什么ｓｕｎ公司指定JDBC接口？
 * 因为不同的数据库都是有自己的实现原理的，面对不同的数据库，需要写不同的　Java　代码，不合适的
 * <p>
 * 所有的数据库公司面对接口进行数据库链接的代码的实现，实现了JDBC　的接口；
 * 不同的数据库厂家书写不同的JDBC　的实现类
 * <p>
 * 所有的数据库的驱动是一个 jar 包，jar包里面有很多的实现好了的，sun 指定的接口；
 * <p>
 * 驱动就是一大堆的 .class 文件
 * <p>
 * JDBC 的本质：a
 * 就是一套接口
 * <p>
 * JDBC 开发前面的准备操作：
 * 官网下载对应的驱动 jar 包，配置到环境变量中；
 */
public class WhatIsJDBC {
    public static void main(String[] args) {
        /**
         * 使用JDBC 的六个步骤
         * 1、进行驱动的注册（告诉JVM 即将链接的数据库是什么）
         *
         * 2、获取链接（打开JVM 进程和数据库之间的通道）（进程之间的通道，需要关闭）
         *
         * 3、获取数据路操作的对象（执行sql语句）
         *
         * 4、执行sql 语句（DQL DML）
         *
         * 5、处理查询结果类（只有第四步执行的 select 语句的时候，才有第五步处理查询的结果）
         *
         * 6、释放资源（使用资源之后，需要进行资源的关闭，释放资源）
         */
    }
}
