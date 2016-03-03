import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column

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
  Bool = [T|F]
  Letter = [a-zA-Z]
  Digit = [0-9]
  Punctuation = [\!#$%&\(\)\*+,-\.V:;<=>\?@\[\\\]\^_`\{\|\}\~\"\']
  AcceptedChar = ({Letter}|"_"|{Digit})
  Identifier = {Letter}{AcceptedChar}*
Integer = (0|[1-9]{Digit}*)
  Rational = ({Integer}_)?{Integer}"/"{Integer}
  Float = {Integer}\.{Digit}+
  Char = \'({Letter}|{Digit}|{Punctuation})\'
  StringCharacter = [^\r\n\"\\]
%state STRING
%%
  <YYINITIAL> {
    /* iterator keywords in the language */
    {Whitespace}  { /* do nothing */               }
    {Bool}        { return symbol(sym.BOOL);       }
    {Char}        {
                    return symbol(
                        sym.CHAR,
                        yytext());
                  }
    {Float}       { return symbol(sym.FLOAT);      }
    {Integer}     { return symbol(sym.INTEGER,
        Integer.parseInt(yytext())); }
    {Rational}    { return symbol(sym.RATIONAL);   }

    \"            { string.setLength(0);
    yybegin(STRING);}

    "seq"         { return symbol(sym.SEQ_T);      }
    "["           { return symbol(sym.LBRACKET);   }
    "]"           { return symbol(sym.RBRACKET);   }
    "<"           { return symbol(sym.LANGLE);     }
    ">"           { return symbol(sym.RANGLE);     }
    "{"           { return symbol(sym.LBRACE);     }
    "}"           { return symbol(sym.RBRACE);     }
    ","           { return symbol(sym.COMMA);      }
    ":"           { return symbol(sym.COLON);      }

    /* types in the language */
    "top"         { return symbol(sym.TOP_T);      }
    "bool"        { return symbol(sym.BOOLEAN_T);  }
    "char"        { return symbol(sym.CHAR_T);     }
    "dict"        { return symbol(sym.DICT_T);     }
    "float"       { return symbol(sym.FLOAT_T);    }
    "int"         { return symbol(sym.INT_T);      }
    "rat"         { return symbol(sym.RATIONAL_T); }
    "void"        { return symbol(sym.VOID);     }

    /* Mathematical Operators */
    "="           { return symbol(sym.ASSIGNMENT); }
    "+"           { return symbol(sym.PLUS);       }
    "-"           { return symbol(sym.MINUS);      }
    "*"           { return symbol(sym.MULT);       }
    "/"           { return symbol(sym.DIV);        }
    "^"           { return symbol(sym.POW);        }
    "."           { return symbol(sym.DOT);        }
    "::"          { return symbol(sym.APPEND);     }

    /* Comparison Operators */
    "=="          { return symbol(sym.EQ);         }
    "!="          { return symbol(sym.NEQ);        }
    "<="          { return symbol(sym.LTEQ);       }
    "||"          { return symbol(sym.OR);         }
    "&&"          { return symbol(sym.AND);        }
    "!"           { return symbol(sym.NOT);        }
    "("           { return symbol(sym.LPAREN);     }
    ")"           { return symbol(sym.RPAREN);     }
    "len"         { return symbol(sym.LEN);        }

    "main"        { return symbol(sym.MAIN);       }
    "fdef"        { return symbol(sym.FDEF);       }
    "tdef"        { return symbol(sym.TDEF);       }
    "alias"       { return symbol(sym.ALIAS);      }
    ";"           { return symbol(sym.SEMICOLON);  }
    "if"          { return symbol(sym.IF);         }
    "then"        { return symbol(sym.THEN);       }
    "else"        { return symbol(sym.ELSE);       }
    "elif"        { return symbol(sym.ELIF);       }
    "fi"          { return symbol(sym.FI);         }
    "while"       { return symbol(sym.WHILE);      }
    "forall"      { return symbol(sym.FORALL);     }
    "do"          { return symbol(sym.DO);         }
    "od"          { return symbol(sym.OD);         }
    "in"          { return symbol(sym.IN);         }

    "print"       { return symbol(sym.PRINT);      }
    "read"        { return symbol(sym.READ);       }
    "return"      { return symbol(sym.RETURN);     }
    {Identifier}  { return symbol(sym.IDENTIFIER); }
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
