grammar Confefe;

// using https://github.com/yshavit/antlr-denter to handle INDENT and DEDENT tokens

tokens { INDENT, DEDENT }

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
  private final DenterHelper denter = new DenterHelper(NL, ConfefeParser.INDENT, ConfefeParser.DEDENT) {
    @Override
    public Token pullToken() {
      return ConfefeLexer.super.nextToken();   // must be to super.nextToken, or we'll recurse forever!
    }
  };

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}


file
  : keyValuePairs EOF   # TopLevelMap
  | listItems EOF       # TopLevelList
  ;

keyValuePairs
  : keyValuePair
  ;

keyValuePair: key WS COLON WS value;

key: primitive;

map
  : LBRACE WS keyValuePairs WS RBRACE
  | 
  ;

listItems
  :
  ;

list
  :
  ;

primitive
  : NIL
  | bool
  | int_literal
  | float_literal
  | STRING_LITERAL
  ;

value
  : primitive
  | list
  | map
  ;

bool: TRUE | FALSE;

int_literal: DECIMAL_DIGIT+;

float_literal: DECIMAL_DIGIT+ DOT DECIMAL_DIGIT+;

NIL: 'nil';
TRUE: 'true';
FALSE: 'false';

DECIMAL_DIGIT: [0-9];
fragment OCTAL_DIGIT: [0-7];
fragment HEX_DIGIT: [0-9A-Fa-f];


// string literals - similar to https://golang.org/ref/spec#String_literals
STRING_LITERAL
  : '"' (UNICODE_VALUE | NEWLINE | BYTE_VALUE)* '"'
  ;

UNICODE_VALUE    : UNICODE_CHAR | LITTLE_U_VALUE | BIG_U_VALUE | ESCAPED_CHAR ;
BYTE_VALUE       : OCTAL_BYTE_VALUE | HEX_BYTE_VALUE ;
OCTAL_BYTE_VALUE : BACKSLASH OCTAL_DIGIT OCTAL_DIGIT OCTAL_DIGIT ;
HEX_BYTE_VALUE   : '\\x' HEX_DIGIT HEX_DIGIT ;
LITTLE_U_VALUE   : '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
BIG_U_VALUE      : '\\U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                           HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
ESCAPED_CHAR     : BACKSLASH ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | BACKSLASH | '\'' | '"' ) ;

// Taken from https://golang.org/ref/spec#Characters

//newline = /* the Unicode code point U+000A */ .
NEWLINE
  : [\u000A]
  ;

// unicode_char   = /* an arbitrary Unicode code point except newline */ .
UNICODE_CHAR: ~[\u000A];


BACKSLASH: '\\';
DOT: '.';
COLON: ':';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';

// Whitespace and comments

WS: (LWS | NL)+;

LWS: [ \t]+;

NL: ('\r'? '\n' [ \t]*);    // per https://github.com/yshavit/antlr-denter, modify your NL token to also grab any whitespace that follows (in other words, have it end in ' '*, '\t'* or similar).

LINE_COMMENT
  : '#' ~[\r\n]* -> skip
  ;