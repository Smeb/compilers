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

%%
<YYINITIAL> {

  "if"          { return symbol(sym.IF);         }
  "then"        { return symbol(sym.THEN);       }
  "else"        { return symbol(sym.ELSE);       }
  "let"         { return symbol(sym.LET);        }

  {Integer}     { return symbol(sym.INTEGER,
                                Integer.parseInt(yytext())); }
  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }

  {Whitespace}  { /* do nothing */               }
  "="           { return symbol(sym.ASSIGNMENT);  }
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

