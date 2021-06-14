package com.onebill.spring.SpringAnnotationDemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({DeptConfig.class,EmployeeConfig2.class})
@Configuration
public class AllConfigs {

}
