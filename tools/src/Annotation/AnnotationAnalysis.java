package Annotation;

public class AnnotationAnalysis {
    public String getValue() {
        String value = "";
        try {
            Class c = Class.forName("Annotation.CustomObj");    //使用Class.forName不用再加.class
            boolean isUsed = c.isAnnotationPresent(CustomAnnotation.class);
            if (isUsed) {
                CustomAnnotation annotation = (CustomAnnotation) c.getAnnotation(CustomAnnotation.class);
                value = annotation.value();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }
}
