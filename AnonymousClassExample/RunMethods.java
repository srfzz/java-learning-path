package AnonymousClassExample;

public class RunMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Greeting f=new Greeting()
				{
					@Override
					public void sayHello() {
						System.out.println("Saing heelo");
						
					}
				};
				f.sayHello();
	}

}
