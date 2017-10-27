public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(30);
        String s = "([]){[]}";
        boolean everythingIsCorrect = true;
        int count = 0;
        for (int i = 0; i < s.length() & everythingIsCorrect; i++) {
            char symbol = s.charAt(i);
            String stringBracket = String.valueOf(symbol);
            if (stringBracket.equals("(") ||
                    stringBracket.equals("[") ||
                    stringBracket.equals("{")) {
                stack.push(stringBracket);
            } else {
                if(stack.size() > 0) {
                    String beforeelement = stack.pop();
                    //FIXME поменяйте, плиз, название
                    if (beforeelement.equals("(") & stringBracket.equals(")") ||
                            beforeelement.equals("[") & stringBracket.equals("]") ||
                            beforeelement.equals("{") & stringBracket.equals("}")) {
                    } else {
                        everythingIsCorrect = false;
                    }
                }else{
                    everythingIsCorrect = false;
                }
            }
        }
        //todo проверять также условие, что стек пуст
        if (everythingIsCorrect) {
            System.out.println("Последовательность норм");
        } else {
            System.out.println("WARNING!!! The sequence is NOT correct!");
        }
    }
}