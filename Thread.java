class Thread{}
class MyThread extends Thread{
	public void rum(){
		System.out.println(Thread.currentThread().getName());
	}
}
class Main
{
	public static void main(String args[]){
		//String s=Thread.CurrentThread.getname();
		MyThread mt=new MyThread();//Born state
		//mt.setName("Child Thread");
		mt.Start();//Run State
		System.out.println();
		//System.out.println(s);
	}
}
