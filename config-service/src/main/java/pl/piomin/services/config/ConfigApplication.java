package pl.piomin.services.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		new SpringApplicationBuilder(ConfigApplication.class).run(args);
	}

}
