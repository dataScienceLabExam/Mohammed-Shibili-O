package shibili;

class cpuClass {
	float price;
	public cpuClass(float price)
	{
		this.price=price;
		
	}
	class processor
	{
		int numCore;
		String manf;
		public processor(int numCore,String manf)
		{
			this.numCore=numCore;
			this.manf=manf;
		}
		void display()
		{
			System.out.println("no:of cores="+numCore);
			System.out.println("manufacturer="+manf);
			
		}
	}
	public static class ram
	{
		static int memory;
		static String manf1;
		static public void ramdata(int memory,String manf1)
		 {
			 memory=memory;
			 manf1=manf1;
		 }
		 static void display()
		 {
			 System.out.println("memory: "+memory);
			 System.out.println("manufacturer: "+manf1);
		 }
	 }
	 public static void main(String args[])
	 {
		 cpuClass.processor obj=new cpuClass(20000).new processor(4,"intel");
		 obj.display();
		 cpuClass.ram.ramdata(600,"asus");
		 cpuClass.ram.display();
		 
	 }

	}

