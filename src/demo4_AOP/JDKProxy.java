package demo4_AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = userDao1.add(1, 2);
        System.out.println("result is "+ result);
    }
}

class UserDaoProxy implements InvocationHandler{

    private Object obj;
    //pass the original class instance
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //argument logic portion
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //implementation of argument logic
        //before method
        System.out.println("something before the argument method"+method.getName()+" :the passed args"+ Arrays.toString(args));
        //method to be enhanced
        Object res = method.invoke(obj, args);
        //after the method being executed
        System.out.println("after the method being executed....."+ obj);
        return res;
    }
}
