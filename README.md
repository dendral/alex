# Repo de ejemplo

Esta es una aplicación de spring boot

Importar mediante: File>Import>Maven>Existing maven project

Para ejecutar hay que buscar el archivo InfinityV2Application.java y dar clic derecho>Run as>Java application

Deberá verse el log de que inicia el Tomcat embebido:

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::        (v2.0.5.RELEASE)
....
    A EntityManagerFactory for persistence unit 'default'
    2019-07-20 14:09:08.167  INFO 54989 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-07-20 14:09:08.368  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@691a7f8f: startup date [Sat Jul 20 14:08:59 CDT 2019]; root of context hierarchy
    2019-07-20 14:09:08.442  WARN 54989 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    2019-07-20 14:09:08.524  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET]}" onto public java.lang.String com.mx.hack.controller.InfiniteCtl.home()
    2019-07-20 14:09:08.548  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/done],methods=[GET]}" onto public java.lang.String com.mx.hack.controller.InfiniteCtl.done(java.lang.String,java.lang.String,org.springframework.ui.Model,org.springframework.web.client.RestTemplate)
    2019-07-20 14:09:08.551  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/greeting],methods=[GET]}" onto public java.lang.String com.mx.hack.controller.InfiniteCtl.greeting(java.lang.String,org.springframework.ui.Model)
    2019-07-20 14:09:08.552  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/token],methods=[GET]}" onto public org.springframework.web.servlet.view.RedirectView com.mx.hack.controller.InfiniteCtl.getToken(javax.servlet.http.HttpServletRequest) throws java.lang.Exception
    2019-07-20 14:09:08.553  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/callback],methods=[GET]}" onto public org.springframework.web.servlet.view.RedirectView com.mx.hack.controller.InfiniteCtl.getCallback(javax.servlet.http.HttpServletRequest,org.springframework.web.servlet.mvc.support.RedirectAttributes) throws java.lang.Exception
    2019-07-20 14:09:08.567  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/infinity/getCliente/{numero}],methods=[GET],produces=[application/json;charset=UTF-8]}" onto public com.mx.hack.bean.Cliente com.mx.hack.controller.InfiniteRest.getCliente(int)
    2019-07-20 14:09:08.621  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
    2019-07-20 14:09:08.623  INFO 54989 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
    2019-07-20 14:09:08.795  INFO 54989 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-07-20 14:09:08.796  INFO 54989 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-07-20 14:09:09.691  INFO 54989 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
    2019-07-20 14:09:09.694  INFO 54989 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'dataSource' has been autodetected for JMX exposure
    2019-07-20 14:09:09.705  INFO 54989 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located MBean 'dataSource': registering with JMX server as MBean [com.zaxxer.hikari:name=dataSource,type=HikariDataSource]
    2019-07-20 14:09:09.779  INFO 54989 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
    2019-07-20 14:09:09.785  INFO 54989 --- [           main] com.mx.hack.InfinityV2Application        : Started InfinityV2Application in 11.143 seconds (JVM running for 12.514)


Ahora bien, el servicio se puede probar en el navegador:
  http://localhost:8080/infinity/getCliente/1
El código que hace esto está en:

com.mx.hack.controller.InfiniteRest

Es un servicio REST que devuelve un objeto JSON que internamente es del tipo Cliente

Hay mas cosas, como por ejemplo un llamado a Twitter y configuracion para una BD que se llama H2
