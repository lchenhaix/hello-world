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
					// TODO �Զ����ɵķ������
					System.out.println("׼������ͼƬ"+arg2[0].toString());
					Thread thr=new Thread(new Runnable() {

						@Override
						public void run() {
							// TODO �Զ����ɵķ������
							try {
								arg1.invoke(target,arg2);
							} catch (IllegalAccessException e) {
								// TODO �Զ����ɵ� catch ��
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								// TODO �Զ����ɵ� catch ��
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								// TODO �Զ����ɵ� catch ��
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
