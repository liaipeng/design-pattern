package command;

import java.util.ArrayList;
import java.util.List;

public class Boy {
	private String name;
	private List<Command> commands = new ArrayList<Command>();
	// 实际上这里应该有一个List，存储执行过的command，后面unDo要用。但是这里我们默认是执行所有command，所以就没写了

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pursue(MM mm) {
	}

	public void doSomeThing() {
		
	}

	public void addCommand(Command c1) {
		this.commands.add(c1);
	}

	public void executeCommands() {
		for(Command c : commands) {
			c.execute();
		}
	}
	
	public void undoCommands() {
		// 撤销做过的command
	}
}
