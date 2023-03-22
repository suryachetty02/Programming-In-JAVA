import java.io.*;
class Table
{
	void printTable(int n)
	{
		synchronized(this)
		{
			for (int i =1;i<=10;i++)
			{
				System.out.println(+n+"*"+i+"="+(n*i));
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
class Use
{
	public static void main(String args[])
	{
		Table obj = new Table();
		MyThread1 th1 = new MyThread1(obj);
		MyThread2 th2 = new MyThread2(obj);
		th1.start();
		th2.start();
	}
}
