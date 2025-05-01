// FIXME => throwingn exception when running build in Jenkins   
/* Error details:

	+ java -version
	openjdk version "17.0.15" 2025-04-15
	OpenJDK Runtime Environment Temurin-17.0.15+6 (build 17.0.15+6)
	OpenJDK 64-Bit Server VM Temurin-17.0.15+6 (build 17.0.15+6, mixed mode, sharing)
	
	+ javac -version
	javac 17.0.15

	+ mvn -version
	Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
	Maven home: /usr/share/maven
	Java version: 17.0.15, vendor: Eclipse Adoptium, runtime: /opt/java/openjdk
	Default locale: en_US, platform encoding: UTF-8
	OS name: "linux", version: "6.10.11-amd64", arch: "amd64", family: "unix"
	
	+ mvn dependency:tree
	[INFO] com.andresdellaporta.learning.jenkins:learn-jenkins-app-java:jar:0.0.1-SNAPSHOT
	[INFO] +- org.springframework.boot:spring-boot-starter-web:jar:3.2.3:compile
	[INFO] |  +- org.springframework.boot:spring-boot-starter:jar:3.2.3:compile
	[INFO] |  |  +- org.springframework.boot:spring-boot:jar:3.2.3:compile
	[INFO] |  |  +- org.springframework.boot:spring-boot-autoconfigure:jar:3.2.3:compile
	[INFO] |  |  +- org.springframework.boot:spring-boot-starter-logging:jar:3.2.3:compile
	[INFO] |  |  |  +- ch.qos.logback:logback-classic:jar:1.4.14:compile
	[INFO] |  |  |  |  \- ch.qos.logback:logback-core:jar:1.4.14:compile
	[INFO] |  |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.21.1:compile
	[INFO] |  |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.21.1:compile
	[INFO] |  |  |  \- org.slf4j:jul-to-slf4j:jar:2.0.12:compile
	[INFO] |  |  +- jakarta.annotation:jakarta.annotation-api:jar:2.1.1:compile
	[INFO] |  |  \- org.yaml:snakeyaml:jar:2.2:compile
	[INFO] |  +- org.springframework.boot:spring-boot-starter-json:jar:3.2.3:compile
	[INFO] |  |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.15.4:compile
	[INFO] |  |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.15.4:compile
	[INFO] |  |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.15.4:compile
	[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.15.4:compile
	[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.15.4:compile
	[INFO] |  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.15.4:compile
	[INFO] |  +- org.springframework.boot:spring-boot-starter-tomcat:jar:3.2.3:compile
	[INFO] |  |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:10.1.19:compile
	[INFO] |  |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:10.1.19:compile
	[INFO] |  |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:10.1.19:compile
	[INFO] |  +- org.springframework:spring-web:jar:6.1.4:compile
	[INFO] |  |  \- org.springframework:spring-beans:jar:6.1.4:compile
	[INFO] |  \- org.springframework:spring-webmvc:jar:6.1.4:compile
	[INFO] |     +- org.springframework:spring-aop:jar:6.1.4:compile
	[INFO] |     +- org.springframework:spring-context:jar:6.1.4:compile
	[INFO] |     \- org.springframework:spring-expression:jar:6.1.4:compile
	[INFO] +- org.springframework.boot:spring-boot-starter-actuator:jar:3.2.3:compile
	[INFO] |  +- org.springframework.boot:spring-boot-actuator-autoconfigure:jar:3.2.3:compile
	[INFO] |  |  \- org.springframework.boot:spring-boot-actuator:jar:3.2.3:compile
	[INFO] |  +- io.micrometer:micrometer-observation:jar:1.12.3:compile
	[INFO] |  |  \- io.micrometer:micrometer-commons:jar:1.12.3:compile
	[INFO] |  \- io.micrometer:micrometer-jakarta9:jar:1.12.3:compile
	[INFO] |     \- io.micrometer:micrometer-core:jar:1.12.3:compile
	[INFO] |        +- org.hdrhistogram:HdrHistogram:jar:2.1.12:runtime
	[INFO] |        \- org.latencyutils:LatencyUtils:jar:2.0.3:runtime
	[INFO] \- org.springframework.boot:spring-boot-starter-test:jar:3.2.3:test
	[INFO]    +- org.springframework.boot:spring-boot-test:jar:3.2.3:test
	[INFO]    +- org.springframework.boot:spring-boot-test-autoconfigure:jar:3.2.3:test
	[INFO]    +- com.jayway.jsonpath:json-path:jar:2.9.0:test
	[INFO]    |  \- org.slf4j:slf4j-api:jar:2.0.12:compile
	[INFO]    +- jakarta.xml.bind:jakarta.xml.bind-api:jar:4.0.1:test
	[INFO]    |  \- jakarta.activation:jakarta.activation-api:jar:2.1.2:test
	[INFO]    +- net.minidev:json-smart:jar:2.5.0:test
	[INFO]    |  \- net.minidev:accessors-smart:jar:2.5.0:test
	[INFO]    |     \- org.ow2.asm:asm:jar:9.3:test
	[INFO]    +- org.assertj:assertj-core:jar:3.24.2:test
	[INFO]    |  \- net.bytebuddy:byte-buddy:jar:1.14.12:test
	[INFO]    +- org.awaitility:awaitility:jar:4.2.0:test
	[INFO]    +- org.hamcrest:hamcrest:jar:2.2:test
	[INFO]    +- org.junit.jupiter:junit-jupiter:jar:5.10.2:test
	[INFO]    |  +- org.junit.jupiter:junit-jupiter-api:jar:5.10.2:test
	[INFO]    |  |  +- org.opentest4j:opentest4j:jar:1.3.0:test
	[INFO]    |  |  +- org.junit.platform:junit-platform-commons:jar:1.10.2:test
	[INFO]    |  |  \- org.apiguardian:apiguardian-api:jar:1.1.2:test
	[INFO]    |  +- org.junit.jupiter:junit-jupiter-params:jar:5.10.2:test
	[INFO]    |  \- org.junit.jupiter:junit-jupiter-engine:jar:5.10.2:test
	[INFO]    |     \- org.junit.platform:junit-platform-engine:jar:1.10.2:test
	[INFO]    +- org.mockito:mockito-core:jar:5.7.0:test
	[INFO]    |  +- net.bytebuddy:byte-buddy-agent:jar:1.14.12:test
	[INFO]    |  \- org.objenesis:objenesis:jar:3.3:test
	[INFO]    +- org.mockito:mockito-junit-jupiter:jar:5.7.0:test
	[INFO]    +- org.skyscreamer:jsonassert:jar:1.5.1:test
	[INFO]    |  \- com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test
	[INFO]    +- org.springframework:spring-core:jar:6.1.4:compile
	[INFO]    |  \- org.springframework:spring-jcl:jar:6.1.4:compile
	[INFO]    +- org.springframework:spring-test:jar:6.1.4:test
	[INFO]    \- org.xmlunit:xmlunit-core:jar:2.9.1:test
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time:  47.119 s
	[INFO] Finished at: 2025-05-01T21:43:16Z
	[INFO] ------------------------------------------------------------------------

 */
// /*
//  * Copyright 2016 the original author or authors.
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  *	  https://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */
package com.example.restservice.greeting;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, World!"));
	}

	@Test
	public void paramGreetingShouldReturnTailoredMessage() throws Exception {

		this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
	}

}
