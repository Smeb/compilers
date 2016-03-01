import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column
%debug

%{
  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }
  public  void    debug(boolean mode){ debug_mode = mode; }

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}


Whitespace = \r|\n|\r\n|" "|"\t"
Letter = [a-zA-Z]
Digit = [0-9]
Punctuation = [\!#$%&\(\)\*+,-\.V:;<=>\?@\[\\\]\^_`\{\|\}\~\"\']
AcceptedChar = ({Letter}|" "|{Digit})
IdChar = {Letter} | {Digit} | "_"
Identifier = {Letter}{IdChar}*
Integer = (0|[1-9]{Digit}*)
Rational = ({Integer}_)?{Integer}\/{Integer}
Float = {Integer}.{Integer}
Char = \'({Letter}|{Digit}|{Punctuation})\'

%state STRING, CHAR, IN_COMMENT, END_L_COMMENT
%%
<YYINITIAL> {
  /* iterator keywords in the language */
  "if"          { return symbol(sym.IF);         }
  "then"        { return symbol(sym.THEN);       }
  "else"        { return symbol(sym.ELSE);       }
  "elif"        { return symbol(sym.ELIF);       }
  "fi"          { return symbol(sym.FI);         }
  "then"        { return symbol(sym.THEN);       }
  "while"       { return symbol(sym.WHILE);      }
  "for"         { return symbol(sym.FOR);        }
  "forall"      { return symbol(sym.FORALL);     }
  "do"          { return symbol(sym.DO);         }
  "od"          { return symbol(sym.OD);         }
  ":"           { return symbol(sym.COLON);      }
  "in"          { return symbol(sym.IN);         }

  "print"       { return symbol(sym.PRINT);      }
  "read"        { return symbol(sym.READ);       }
  "return"      { return symbol(sym.RETURN);     }
  /* declarative symbols in the language */
  "fdef"        { return symbol(sym.FDEF);       }
  "tdef"        { return symbol(sym.TDEF);       }

  {Rational}    { return symbol(sym.RATIONAL);   }
  {Integer}     { return symbol(sym.INTEGER,
                    Integer.parseInt(yytext())); }
  {Float}       { return symbol(sym.FLOAT);      }

  {Char}        {
                  return symbol(
                      sym.CHAR,
                      yytext());
                }

  "T"           { return symbol(sym.T);          }
  "F"           { return symbol(sym.F);          }
  "alias"       { return symbol(sym.ALIAS);      }

  /* TODO: implement rational correctly */

  /* types in the language */
  "top"         { return symbol(sym.TOP);        }
  "bool"        { return symbol(sym.BOOLEAN_T);  }
  "char"        { return symbol(sym.CHAR_T);     }
  "dict"        { return symbol(sym.DICT_T);     }
  "float"       { return symbol(sym.FLOAT_T);    }
  "int"         { return symbol(sym.INT_T);      }
  "rat"         { return symbol(sym.RATIONAL_T); }
  "seq"         { return symbol(sym.SEQ_T);      }
  "void"        { return symbol(sym.VOID_T);     }


  {Whitespace}  { /* do nothing */               }

  /* Mathematical Operators */
  "="           { return symbol(sym.ASSIGNMENT); }
  "+"           { return symbol(sym.PLUS);       }
  "-"           { return symbol(sym.MINUS);      }
  "*"           { return symbol(sym.MULT);       }
  "/"           { return symbol(sym.DIV);        }
  "^"           { return symbol(sym.POW);        }
  "_"           { return symbol(sym.UNDERSCORE); }
  "main"        { return symbol(sym.MAIN);       }
  "."           { return symbol(sym.PERIOD);     } // Do we need a period symbol to concat names?

  /* Comparison Operators */
  "=="          { return symbol(sym.EQUALITY); }
  ">"           { return symbol(sym.GREATER_THAN); }
  "<"           { return symbol(sym.LESS_THAN);    }

  /* Sequence terminals */
  "("           { return symbol(sym.LPAREN);     }
  ")"           { return symbol(sym.RPAREN);     }
  "{"           { return symbol(sym.LBRACE);     }
  "}"           { return symbol(sym.RBRACE);     }
  "["           { return symbol(sym.LBRACKET);   }
  "]"           { return symbol(sym.RBRACKET);   }
  \"            { return symbol(sym.STRINGTERM); }
  "||"          { return symbol(sym.OR);         }
  "&&"          { return symbol(sym.AND);        }
   "!"          { return symbol(sym.NOT);        }
  ","           { return symbol(sym.COMMA);      }
  ";"           { return symbol(sym.SEMICOL);    }

  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }
}

<STRING>{
  \"            { return symbol(sym.STRINGTERM); }
}

[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}
