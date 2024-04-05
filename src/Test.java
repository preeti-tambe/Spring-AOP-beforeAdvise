import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {  
public static void main(String[] args) {  
    ClassPathResource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    A a=factory.getBean("proxy",A.class);  
    a.m();  
}  
}  
