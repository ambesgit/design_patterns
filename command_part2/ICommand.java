package command_part2;

public interface ICommand {
	void execute();
	void unDo();
	void reDo();
}
