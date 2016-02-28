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
IdChar = {Letter} | {Digit} | "_"
Identifier = {Letter}{IdChar}*
Integer = (0|[1-9]{Digit}*)
Rational = ({Integer}_)?{Integer}"/"{Integer}

%%
<YYINITIAL> {

  /* keywords in the language */
  "if"          { return symbol(sym.IF);         }
  "fi"          { return symbol(sym.FI);       }
  "then"        { return symbol(sym.THEN);       }
  "fdef"        { return symbol(sym.FDEF);       }
  "tdef"        { return symbol(sym.TDEF);       }
  "for"         { return symbol(sym.FOR);        }
  "forall"      { return symbol(sym.FORALL);     }
  "else"        { return symbol(sym.ELSE);       }
  "let"         { return symbol(sym.LET);        }
  "print"       { return symbol(sym.PRINT);      }
  "read"        { return symbol(sym.READ);       }
  "do"          { return symbol(sym.DO);       }
  "od"          { return symbol(sym.OD);       }

  {Integer}     { return symbol(sym.INTEGER,
                                Integer.parseInt(yytext())); }
  /* TODO: implement rational correctly */
  {Rational}    { return symbol(sym.RATIONAL);   }
  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }

  {Whitespace}  { /* do nothing */               }
  "="           { return symbol(sym.ASSIGNMENT); }
  ";"           { return symbol(sym.SEMICOL);    }
  "+"           { return symbol(sym.PLUS);       }
  "-"           { return symbol(sym.MINUS);      }
  "*"           { return symbol(sym.MULT);       }
  "/"           { return symbol(sym.DIV);        }

  /* Sequence terminals */
  "("           { return symbol(sym.LPAREN);     }
  ")"           { return symbol(sym.RPAREN);     }
  "{"           { return symbol(sym.LBRACE);     }
  "}"           { return symbol(sym.RBRACE);     }
  "["           { return symbol(sym.LBRACKET);   }
  "]"           { return symbol(sym.RBRACKET);   }
  "\""          { return symbol(sym.STRINGTERM); }
}

[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}

