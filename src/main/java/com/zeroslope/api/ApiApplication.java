package com.zeroslope.api;

import com.zeroslope.infrastructure.utlities.BrowserUtilties;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.ExitCodeGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@RestController
@EnableSwagger2
@ApiIgnore
//@EnableJpaAuditing
//@ComponentScan(basePackages = {"com.zeroslope.composition" })
public class ApiApplication {

    private final static  String swaggerUrl = "swagger-ui.html";

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ApiApplication.class, args);
		Logger logger = LoggerFactory.getLogger(ApiApplication.class);
		BrowserUtilties.openBrowser(String.format("http://localhost:%s/%s", getPort(applicationContext), swaggerUrl));
	}

	private static int getPort(ApplicationContext applicationContext) {
	    return applicationContext
                .getBean(Environment.class)
                .getProperty("server.port", Integer.class, 8080);
    }

	@RequestMapping(value = "/")
	public String swagger() {
		return String.format("redirect:%s", swaggerUrl);
	}
}
