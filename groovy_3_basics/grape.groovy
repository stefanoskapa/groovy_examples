/*
Grape is a JAR dependency manager embedded into Groovy. 
Grape lets you quickly add maven repository dependencies 
to your classpath!

Maven Central is the default repository, but we can
specify our own

*/


@GrabResolver(name='restlet', root='http://maven.restlet.org/')
@Grab(group='org.restlet', module='org.restlet', version='1.1.6')
@Grab('org.springframework:spring-orm:5.2.8.RELEASE')
import org.springframework.jdbc.core.JdbcTemplate


