package command;

public class HugCommand implements Command {

	@Override
	public void execute() {
		System.out.println("hug");
	}
	@Override
	public void unDo() {
		System.out.println("open your arms");
	}

}
