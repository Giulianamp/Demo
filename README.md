El error que tira en esta branch es:


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2020-08-10 12:30:17.224  INFO 12220 --- [  restartedMain] com.example.demo.DemoApplication         : Starting DemoApplication on CPX-DST3E1TEPXD with PID 12220 (C:\Users\g.melluso.paciello\Documents\Projects\Demo\target\classes started by g.melluso.paciello in C:\Users\g.melluso.paciello\Documents\Projects\Demo)
2020-08-10 12:30:17.230  INFO 12220 --- [  restartedMain] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2020-08-10 12:30:17.391  INFO 12220 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2020-08-10 12:30:19.003  INFO 12220 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-08-10 12:30:19.277  INFO 12220 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 212ms. Found 2 JPA repository interfaces.
2020-08-10 12:30:20.620  INFO 12220 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-08-10 12:30:20.670  INFO 12220 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-08-10 12:30:26.532 ERROR 12220 --- [  restartedMain] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
	at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:174) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:835) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:455) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:240) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:199) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:358) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:206) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:477) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:560) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) [HikariCP-3.4.5.jar:na]
	at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:158) [spring-jdbc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:116) [spring-jdbc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:79) [spring-jdbc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:324) [spring-jdbc-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.boot.jdbc.EmbeddedDatabaseConnection.isEmbedded(EmbeddedDatabaseConnection.java:120) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateDefaultDdlAutoProvider.getDefaultDdlAuto(HibernateDefaultDdlAutoProvider.java:42) [spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaConfiguration.lambda$getVendorProperties$1(HibernateJpaConfiguration.java:130) [spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings.getDdlAuto(HibernateSettings.java:41) ~[spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties.determineDdlAuto(HibernateProperties.java:136) ~[spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties.getAdditionalProperties(HibernateProperties.java:102) ~[spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties.determineHibernateProperties(HibernateProperties.java:94) ~[spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaConfiguration.getVendorProperties(HibernateJpaConfiguration.java:132) [spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration.entityManagerFactory(JpaBaseConfiguration.java:133) ~[spring-boot-autoconfigure-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:650) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:635) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1336) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1176) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:556) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:226) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1109) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:869) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:551) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:758) ~[spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:750) ~[spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) ~[spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1237) ~[spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) ~[spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at com.example.demo.DemoApplication.main(DemoApplication.java:10) ~[classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) ~[spring-boot-devtools-2.3.2.RELEASE.jar:2.3.2.RELEASE]
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method) ~[na:1.8.0_131]
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62) ~[na:1.8.0_131]
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45) ~[na:1.8.0_131]
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423) ~[na:1.8.0_131]
	at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:61) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:151) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:167) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:91) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.NativeSession.connect(NativeSession.java:152) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:955) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	... 53 common frames omitted
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method) ~[na:1.8.0_131]
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85) ~[na:1.8.0_131]
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_131]
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_131]
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_131]
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172) ~[na:1.8.0_131]
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_131]
	at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_131]
	at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:155) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:65) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	... 56 common frames omitted

2020-08-10 12:30:26.660  INFO 12220 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-08-10 12:30:26.942  INFO 12220 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.18.Final
2020-08-10 12:30:27.120  WARN 12220 --- [  restartedMain] ion$DefaultTemplateResolverConfiguration : Cannot find template location: classpath:/templates/ (please add some templates or check your Thymeleaf configuration)
2020-08-10 12:30:27.268  INFO 12220 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2020-08-10 12:30:27.296  INFO 12220 --- [  restartedMain] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories…
2020-08-10 12:30:27.682  INFO 12220 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-08-10 12:30:29.195  INFO 12220 --- [         task-1] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-08-10 12:30:34.209 ERROR 12220 --- [         task-1] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Exception during pool initialization.

com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
	at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:174) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:835) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:455) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:240) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:199) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:358) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:206) ~[HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:477) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:560) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115) [HikariCP-3.4.5.jar:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) [HikariCP-3.4.5.jar:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:180) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:152) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:176) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:118) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1224) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1255) [hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58) [spring-orm-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:391) [spring-orm-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_131]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) ~[na:1.8.0_131]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) ~[na:1.8.0_131]
	at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_131]
Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method) ~[na:1.8.0_131]
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62) ~[na:1.8.0_131]
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45) ~[na:1.8.0_131]
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423) ~[na:1.8.0_131]
	at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:61) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:151) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:167) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:91) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.NativeSession.connect(NativeSession.java:152) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:955) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	... 33 common frames omitted
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.waitForConnect(Native Method) ~[na:1.8.0_131]
	at java.net.DualStackPlainSocketImpl.socketConnect(DualStackPlainSocketImpl.java:85) ~[na:1.8.0_131]
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_131]
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_131]
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_131]
	at java.net.PlainSocketImpl.connect(PlainSocketImpl.java:172) ~[na:1.8.0_131]
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_131]
	at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_131]
	at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:155) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:65) ~[mysql-connector-java-8.0.16.jar:8.0.16]
	... 36 common frames omitted

2020-08-10 12:30:34.210  WARN 12220 --- [         task-1] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata : Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
2020-08-10 12:30:34.218  WARN 12220 --- [  restartedMain] s.c.a.AnnotationConfigApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'gallinaDao' defined in com.example.demo.Model.GallinaDao defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Cannot resolve reference to bean 'jpaMappingContext' while setting bean property 'mappingContext'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jpaMappingContext': Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
2020-08-10 12:30:34.221  INFO 12220 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-08-10 12:30:34.222  WARN 12220 --- [  restartedMain] o.s.b.f.support.DisposableBeanAdapter    : Invocation of destroy method failed on bean with name 'entityManagerFactory': org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
2020-08-10 12:30:34.222  INFO 12220 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-08-10 12:30:34.242  INFO 12220 --- [  restartedMain] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-08-10 12:30:34.250 ERROR 12220 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'gallinaDao' defined in com.example.demo.Model.GallinaDao defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Cannot resolve reference to bean 'jpaMappingContext' while setting bean property 'mappingContext'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jpaMappingContext': Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:342) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:113) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1697) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1442) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:593) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:226) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:624) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:612) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.data.repository.config.DeferredRepositoryInitializationListener.onApplicationEvent(DeferredRepositoryInitializationListener.java:51) ~[spring-data-commons-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.data.repository.config.DeferredRepositoryInitializationListener.onApplicationEvent(DeferredRepositoryInitializationListener.java:36) ~[spring-data-commons-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:139) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:404) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:361) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:898) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:554) ~[spring-context-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:758) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:750) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1237) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) [spring-boot-2.3.2.RELEASE.jar:2.3.2.RELEASE]
	at com.example.demo.DemoApplication.main(DemoApplication.java:10) [classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) [spring-boot-devtools-2.3.2.RELEASE.jar:2.3.2.RELEASE]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jpaMappingContext': Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1794) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:594) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:516) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:324) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:226) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:330) ~[spring-beans-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	... 32 common frames omitted
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:275) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:152) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:176) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:118) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1224) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1255) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58) ~[spring-orm-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) ~[spring-orm-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:391) ~[spring-orm-5.2.8.RELEASE.jar:5.2.8.RELEASE]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_131]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) ~[na:1.8.0_131]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) ~[na:1.8.0_131]
	at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_131]
Caused by: org.hibernate.HibernateException: Access to DialectResolutionInfo cannot be null when 'hibernate.dialect' not set
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:100) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:54) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:137) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-5.4.18.Final.jar:5.4.18.Final]
	... 17 common frames omitted

