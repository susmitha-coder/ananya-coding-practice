
package in.susmitha.simple_interpreter_part_two.service.service;

        import in.susmitha.simple_interpreter_part_two.service.model.Token;
        import in.susmitha.simple_interpreter_part_two.service.model.TokenType;

        import java.util.*;


public class Expr {
    private Map<Integer, Set<TokenType>> structure;
    //private List<TokenType> list=new ArrayList<TokenType>();

    /*
    index ->
    0 -> left
    1 -> middle
    2 -> right
     */
    public Expr() {
       /* this.structure = new HashMap<>();
        this.structure.put(0, TokenType.INTEGER);
        this.structure.put(1, TokenType.PLUS);
        this.structure.put(2, TokenType.INTEGER);
*/
        this.structure = new HashMap<>();
        Set<TokenType> intOne = new HashSet<>();
        intOne.add(TokenType.INTEGER);
        this.structure.put(0,intOne);

        Set<TokenType> operators = new HashSet<>();
        operators.add(TokenType.PLUS);
        operators.add(TokenType.MINUS);
        operators.add(TokenType.MULTIPLICATION);
        operators.add(TokenType.DIVISION);
        this.structure.put(1,operators);

        Set<TokenType> intTwo = new HashSet<>();
        intTwo.add(TokenType.INTEGER);
        this.structure.put(2,intTwo);

        /*
        0 --> Integer
        1 -->PLUS  /  MINUS
        2 --> Integer
         */
    }

    private boolean validate(Token token, Set<TokenType> tokenType) {
        return ((token != null) && (tokenType.contains(token.getType())));
    }

    public int evaluate(String input) {
        Token[] tokens = new Token[3];
        if(input.length()==0) {
            throw new IllegalArgumentException("Empty String not allowed");
        }
        if(input == null){
            throw new IllegalArgumentException("null value not allowed");
        }

        /*
        structure of the language ->
        integer+integer and the integer are single digit
         */
        LexicalAnalyzerV2 analyzer = new LexicalAnalyzerV2(input);
        //System.out.println("Hello");
        for (int i = 0; i < 3; i++) {
            tokens[i] = analyzer.getNextToken(); // tokens[0] -> left // tokens[1] -> middle //tokens[2] -> right
            //System.out.println("Hey");
            if (!validate(tokens[i], this.structure.get(i))) { //this.structure.get(0) -> o/p -> TokenType.INTEGER
                throw new IllegalArgumentException( "The input is invalid : Valid is : <int>operator<int> where <int> cab be any digit " +
                        "and allowed operators are [+,-,*,/]");
            }


        }

//        if(tokens[1].getValue().equals("/") && tokens[2].getValue().equals("0")){
//            throw new IllegalArgumentException("The input is invalid : Valid is : <int>/<int> where second <int> should be a value greater than zero");

//        }
        //Integer.parseInt("10") -> int 10
        //  return (Integer.parseInt(tokens[0].getValue())*10+Integer.parseInt(tokens[1].getValue()) + Integer.parseInt(tokens[3].getValue())*10+Integer.parseInt(tokens[4].getValue()));
        /*if(input.indexOf('+')>0)
            return (Integer.parseInt(tokens[0].getValue()) + Integer.parseInt(tokens[2].getValue()));
        else
            return (Integer.parseInt(tokens[0].getValue()) - Integer.parseInt(tokens[2].getValue()));*/
        switch (tokens[1].getType()) {
            case PLUS:
                return (Integer.parseInt(tokens[0].getValue()) + Integer.parseInt(tokens[2].getValue()));
            case MINUS:
                return (Integer.parseInt(tokens[0].getValue()) - Integer.parseInt(tokens[2].getValue()));
            case MULTIPLICATION:
                return (Integer.parseInt(tokens[0].getValue()) * Integer.parseInt(tokens[2].getValue()));
            case DIVISION:
                if(tokens[2].getValue().equals("0")){
                    throw new IllegalArgumentException("The input is invalid : Valid is : <int>/<int> where second <int> should be a value greater than zero");

                }
                return (Integer.parseInt(tokens[0].getValue()) / Integer.parseInt(tokens[2].getValue()));



        }
        return 0;
    }
}