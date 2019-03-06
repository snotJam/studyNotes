package Annotation;

@CustomAnnotation("Annotation")
public class CustomObj {
    public static void main(String[] args) {
        AnnotationAnalysis annotationAnalysis = new AnnotationAnalysis();
        System.out.println(annotationAnalysis.getValue());
    }

    //我们使用解析器，解析获取到我们给注解的值
    //对应ButterKnife，就是在Activity中使用了注解，@BindView是注解类，ButterKnife就相当于解析器类
}
