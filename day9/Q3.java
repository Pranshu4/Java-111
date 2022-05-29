package day9;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In java, multiple inheritance is not supported because of ambiguity problem. We can take the below example where we have two classes Class1 and Class2 which have same method display(). If multiple inheritance is possible than Test class can inherit data members (properties) and methods (behaviour) of both Class1 and Class2 classes. Now, Test class have two display() methods inherited from Class1 and Class2. Problem occurs in method call, when display() method will be called with Test class object which method will be called, will it be of Class1 or Class2. This is ambiguity problem because of which multiple inheritance is not supported in java."
				);
		System.out.println("Input");
		System.out.println("class Class1{\r\n"
				+ "      public void display(){\r\n"
				+ "            System.out.println(\"Display method inside Class1.\");\r\n"
				+ "      }\r\n"
				+ "}\r\n"
				+ " \r\n"
				+ "class Class2{\r\n"
				+ "      public void display(){\r\n"
				+ "            System.out.println(\"Display method inside Class2.\");\r\n"
				+ "      }\r\n"
				+ "}\r\n"
				+ " \r\n"
				+ "//let multiple inheritance is possible.\r\n"
				+ "public class Test extends Class1, Class2{\r\n"
				+ "      public static void main(String args[]){\r\n"
				+ "            Test obj = new Test();\r\n"
				+ "            //Ambiguity problem in method call which class display() method will be called.\r\n"
				+ "            obj.display();\r\n"
				+ "      }\r\n"
				+ "}");
		
		System.out.println("Output");
		System.out.println("Exception in thread \"main\" java.lang.Error: \r\n"
				+ "Unresolved compilation problem:\r\n"
				+ "at com.w3spoint.business.Test.main(Test.java:19)");
	}

}
