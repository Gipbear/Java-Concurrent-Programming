package action;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	@Override
	protected void compute() {
		System.out.println("compute run!");
	}

}
