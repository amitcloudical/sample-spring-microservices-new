package pl.piomin.services.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		new SpringApplicationBuilder(DiscoveryApplication.class).run(args);
	}

}
