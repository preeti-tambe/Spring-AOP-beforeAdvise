import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Beforeadv implements MethodBeforeAdvice {

	public Beforeadv()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before advise");
		
	}

}
