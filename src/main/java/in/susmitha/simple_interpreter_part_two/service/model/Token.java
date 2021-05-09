package in.susmitha.simple_interpreter_part_two.service.model;
    public class Token {
        private String value;
        private TokenType type;

        public Token(String value, TokenType type) {
            this.value = value;
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public TokenType getType() {
            return type;
        }
    }
