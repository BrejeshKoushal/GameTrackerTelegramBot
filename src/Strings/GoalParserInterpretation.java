package Strings;

public class GoalParserInterpretation {
    public  void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
    }
    public String interpret(String command) {
        command = command.replace("()","o");
      command =  command.replace("(al)","al");

        return command;
    }
}
