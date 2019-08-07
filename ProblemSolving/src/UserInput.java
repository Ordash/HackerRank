public class UserInput {

    public static class TextInput {
        private StringBuilder str = new StringBuilder();
        public void add(char c) {
            str.append(c);
        }

        public StringBuilder getValue() {
            return str;
        }
    }

    public static class NumericInput extends TextInput{
        public void add(char c){
            if(Character.isDigit(c)){
                getValue().append(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}