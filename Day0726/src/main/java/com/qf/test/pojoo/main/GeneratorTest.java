package com.qf.test.pojoo.main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

    public class GeneratorTest {

        public void generator() throws Exception {

            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            //注意这里路径的书写
            File configFile = new File("Day0726/src/main/resources/generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }

        public static void main(String[] args) throws Exception {
            try {
                GeneratorTest generatorSqlmap = new GeneratorTest();
                generatorSqlmap.generator();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

