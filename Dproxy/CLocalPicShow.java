package Dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow {
	private Object target;
	public CLocalPicShow(Object target) {
		super();
		this.target=target;
	}
	public Object getProxyInstance() { 
	return Proxy.newProxyInstance(
			target.getClass().getClassLoader(),
			target.getClass().getInterfaces(),
			new InvocationHandler() {

				@Override
				public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
					// TODO 自动生成的方法存根
					System.out.println("准备载入图片"+arg2[0].toString());
					Thread thr=new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO 自动生成的方法存根
							try {
								arg1.invoke(target,arg2);
							} catch (IllegalAccessException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								// TODO 自动生成的 catch 块
								e.printStackTrace();
							}
						}
				
					});//new thread end
					thr.start();
					return null;
				}
				
			});
}
}
