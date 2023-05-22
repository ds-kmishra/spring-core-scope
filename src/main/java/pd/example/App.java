package pd.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import pd.example.service.EmailService;
import pd.example.withannotation.AppConfig;
import pd.example.withannotation.EmailService;

public class App 
{
    public static void main( String[] args )
    {
        // USING XML
        // *Singleton Scope* - It is a default scope of a bean
        // Per instance per application context or per IOC container

        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-web.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);
        System.out.println(emailService);

        EmailService emailService1 = context.getBean("emailService", EmailService.class);
        System.out.println(emailService1);*/

        /*
        * Output-   pd.example.service.EmailService@1fa121e2
                    pd.example.service.EmailService@1fa121e2
        * */

        // ------------------------------------------------------------------------------

        // But we may have several ApplicationContext per application
        /*ApplicationContext context1 =
                new ClassPathXmlApplicationContext("spring-web.xml");
        EmailService emailService1 = context1.getBean("emailService", EmailService.class);
        System.out.println(emailService1);

        ApplicationContext context2 =
                new ClassPathXmlApplicationContext("spring-web.xml");
        EmailService emailService2 = context2.getBean("emailService", EmailService.class);
        System.out.println(emailService2);*/
        /*
        *   pd.example.service.EmailService@31190526
            pd.example.service.EmailService@3857f613
        * */

        // ------------------------------------------------------------------------------

        // *Prototype Scope*
        // - Per instance per bean request
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-web.xml");

        EmailService emailService1 =
                context.getBean("emailServicePrototype", EmailService.class);
        EmailService emailService2 =
                context.getBean("emailServicePrototype", EmailService.class);

        System.out.println(emailService1);
        System.out.println(emailService2);*/
        /*
        *   pd.example.service.EmailService@62ddbd7e
            pd.example.service.EmailService@74e52ef6
        * */

        // USING JAVA CONFIG
        // -- Singleton Scope
        /*ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean("emailService", EmailService.class);
        System.out.println(emailService);

        EmailService emailService1 = context.getBean("emailService", EmailService.class);
        System.out.println(emailService1);*/
        /*
        *   pd.example.service.EmailService@62ddbd7e
            pd.example.service.EmailService@62ddbd7e
        * */

        // --Prototype Scope

        /*ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean("prototypeEmailService", EmailService.class);
        System.out.println(emailService);

        EmailService emailService1 = context.getBean("prototypeEmailService", EmailService.class);
        System.out.println(emailService1);*/

        /*
        *   pd.example.withannotation.EmailService@1b1426f4
            pd.example.withannotation.EmailService@32b260fa
        * */

    }
}
