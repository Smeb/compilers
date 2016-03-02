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
  StringBuffer string = new StringBuffer();

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
  AcceptedChar = ({Letter}|"_"|{Digit})
  Identifier = {Letter}{AcceptedChar}*
Integer = (0|[1-9]{Digit}*)
  Rational = ({Integer}_)?{Integer}"/"{Integer}
  Float = {Integer}.{Digit}+
  Char = \'({Letter}|{Digit}|{Punctuation})\'
  StringCharacter = [^\r\n\"\\]
%state STRING
%%
  <YYINITIAL> {
    /* iterator keywords in the language */
    "if"          { return symbol(sym.IF);         }
    "then"        { return symbol(sym.THEN);       }
    "else"        { return symbol(sym.ELSE);       }
    "elif"        { return symbol(sym.ELIF);       }
    "fi"          { return symbol(sym.FI);         }
    "while"       { return symbol(sym.WHILE);      }
    "for"         { return symbol(sym.FOR);        }
    "forall"      { return symbol(sym.FORALL);     }
    "do"          { return symbol(sym.DO);         }
    "od"          { return symbol(sym.OD);         }
    "in"          { return symbol(sym.IN);         }
    "len"         { return symbol(sym.LEN);        }
    "main"        { return symbol(sym.MAIN);       }

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
    "top"         { return symbol(sym.TOP_T);      }
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
    "."           { return symbol(sym.PERIOD);     } // Do we need a period symbol to concat names?
    ":"           { return symbol(sym.COLON);      }
    "::"          { return symbol(sym.APPEND);     }

    /* Comparison Operators */
    "=="          { return symbol(sym.EQ);         }
    "!="          { return symbol(sym.NEQ);        }
    "<"           { return symbol(sym.LT);         }
    "<="          { return symbol(sym.LTEQ);       }

    /* Misc symbols */
    ">"           { return symbol(sym.GT);         }
    /* Sequence terminals */
    "("           { return symbol(sym.LPAREN);     }
    ")"           { return symbol(sym.RPAREN);     }
    "{"           { return symbol(sym.LBRACE);     }
    "}"           { return symbol(sym.RBRACE);     }
    "["           { return symbol(sym.LBRACKET);   }
    "]"           { return symbol(sym.RBRACKET);   }
    \"            { string.setLength(0);
    yybegin(STRING);}

  "||"          { return symbol(sym.OR);         }
  "&&"          { return symbol(sym.AND);        }
  "!"           { return symbol(sym.NOT);        }
  ","           { return symbol(sym.COMMA);      }
  ";"           { return symbol(sym.SEMICOLON);  }

  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }
  }

<STRING>{
  \"            { yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL,
    string.toString());}

  {StringCharacter}+ { string.append(yytext()); }
  "\\b"   { string.append( '\b' ); }
  "\\t"   { string.append( '\t' ); }
  "\\n"   { string.append( '\n' ); }
  "\\f"   { string.append( '\f' ); }
  "\\r"   { string.append( '\r' ); }
  "\\\""  { string.append( '\"' ); }
  "\\'"   { string.append( '\'' ); }
  "\\\\"  { string.append( '\\' ); }
}

[^]  {
  System.out.println("file:" + (yyline+1) +
      ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}
