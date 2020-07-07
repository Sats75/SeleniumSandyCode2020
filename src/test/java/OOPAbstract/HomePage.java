package OOPAbstract;

public class HomePage extends Page{


	@Override
	public void header(String name) {
		System.out.println("HomePage............Header" + name);
		
	}

	@Override
	public void title(String title) {
		System.out.println("HomePage............Title" + title);
		
	}

}


