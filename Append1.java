public class Append1
	{
		public static void main(String args[])
		{
			Append appender = new Append();
			String result = appender.appendCITE("We do ordinary things extraordinarily well!");
			System.out.print(result);
		}
		
		public String appendCITE(String motto)
		{
			String cite = "Cite: ";
			String appended = cite + " " + motto;
			return appended;
		}
	}
			