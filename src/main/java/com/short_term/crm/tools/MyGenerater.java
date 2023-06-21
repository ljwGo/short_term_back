package com.short_term.crm.tools;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;

class MyGenerator {
    private static final String URL = "jdbc:mysql://localhost:3306/crm?characterEncoding=utf-8&useSSL=true&serverTimezone=GMT";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static final String PACKAGE_NAME = "com.short_term.crm";
    private static final String AUTHOR_NAME = "东软集团";
    private static final String OUTDIR_JAVA = "D:\\ideaProjects\\crm\\src\\main\\java";
    private static final String OUTDIR_XML = "D:\\ideaProjects\\crm\\src\\main\\resources\\mapper";
    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author(AUTHOR_NAME) // 设置作者
                            .fileOverride() // 覆盖已⽣成⽂件
                            .outputDir(OUTDIR_JAVA) // 指定输出⽬录
                            .disableOpenDir(); // 禁⽌打开输出⽬录
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // 设置包名
                            .entity("entity") //设置实体类包名
                            .pathInfo(Collections.singletonMap(OutputFile.
                                    mapperXml, OUTDIR_XML)); // 设置mapperXml⽣成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("product") // 设置需要⽣成的表名
                            .controllerBuilder() //这⾥写controllerBuilder，表示将开始controller配置
                            .enableRestStyle();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使⽤Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
