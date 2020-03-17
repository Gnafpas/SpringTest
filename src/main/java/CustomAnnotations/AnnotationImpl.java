package main.java.CustomAnnotations;

import org.springframework.context.ApplicationContext;

/**
 * Created by George on 12/3/20.
 */
public class AnnotationImpl {

    public static void implement(ApplicationContext ctx){
        main.java.CustomAnnotations.Object object =new main.java.CustomAnnotations.Object();
        System.out.println(Annotations.findAnnotatedParameters(object));
    }
}
