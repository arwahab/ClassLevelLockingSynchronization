// Java program to illustrate class level lock
public class ClassLevelLockingSynchronizationDemo implements Runnable {
	public void run() {
		Lock();
	}

	public void Lock() {
		System.out.println(Thread.currentThread().getName());
		synchronized (ClassLevelLockingSynchronizationDemo.class) {
			System.out.println("in block " + Thread.currentThread().getName());
			System.out.println("in block " + Thread.currentThread().getName() + " end");
		}
	}

	public static void main(String[] args) {
		ClassLevelLockingSynchronizationDemo classLevelLockingSynchronizationDemo1 = new ClassLevelLockingSynchronizationDemo();
		Thread thread1 = new Thread(classLevelLockingSynchronizationDemo1);
		Thread thread2 = new Thread(classLevelLockingSynchronizationDemo1);
		ClassLevelLockingSynchronizationDemo classLevelLockingSynchronizationDemo2 = new ClassLevelLockingSynchronizationDemo();
		Thread thread3 = new Thread(classLevelLockingSynchronizationDemo2);
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread3.setName("thread3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
