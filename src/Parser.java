
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\067\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\005\003\000\002\005\003\000\002\005" +
    "\003\000\002\005\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\006\003\000\002\006\003\000" +
    "\002\013\005\000\002\013\004\000\002\013\006\000\002" +
    "\013\004\000\002\013\005\000\002\013\003\000\002\014" +
    "\006\000\002\003\003\000\002\010\006\000\002\015\005" +
    "\000\002\016\003\000\002\016\002\000\002\017\003\000" +
    "\002\017\005\000\002\007\010\000\002\020\005\000\002" +
    "\021\003\000\002\021\002\000\002\022\003\000\002\022" +
    "\005\000\002\023\005\000\002\012\003\000\002\012\003" +
    "\000\002\012\003\000\002\012\003\000\002\012\003\000" +
    "\002\012\003\000\002\012\003\000\002\012\003\000\002" +
    "\012\003\000\002\012\003\000\002\012\003\000\002\012" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\122\000\012\007\014\012\005\025\012\031\007\001" +
    "\002\000\004\002\ufffd\001\002\000\032\013\uffda\015\022" +
    "\017\030\020\015\021\024\022\031\023\035\024\023\043" +
    "\027\054\016\055\034\056\017\001\002\000\004\002\uffff" +
    "\001\002\000\004\005\107\001\002\000\004\002\106\001" +
    "\002\000\004\002\001\001\002\000\004\005\072\001\002" +
    "\000\004\002\ufffe\001\002\000\032\010\uffe0\015\022\017" +
    "\030\020\015\021\024\022\031\023\035\024\023\043\027" +
    "\054\016\055\034\056\017\001\002\000\044\005\ufff9\010" +
    "\ufff9\011\ufff9\013\ufff9\014\ufff9\016\ufff9\036\ufff9\037\ufff9" +
    "\040\ufff9\041\ufff9\042\ufff9\043\ufff9\044\ufff9\045\ufff9\046" +
    "\ufff9\047\ufff9\051\ufff9\001\002\000\030\015\022\017\030" +
    "\020\015\021\024\022\031\023\035\024\023\043\027\054" +
    "\016\055\034\056\017\001\002\000\004\015\066\001\002" +
    "\000\044\005\uffe6\010\uffe6\011\uffe6\013\uffe6\014\uffe6\016" +
    "\uffe6\036\uffe6\037\uffe6\040\uffe6\041\uffe6\042\uffe6\043\uffe6" +
    "\044\uffe6\045\uffe6\046\uffe6\047\uffe6\051\uffe6\001\002\000" +
    "\010\010\uffe1\011\064\016\uffe1\001\002\000\030\015\022" +
    "\017\030\020\015\021\024\022\031\023\035\024\023\043" +
    "\027\054\016\055\034\056\017\001\002\000\044\005\uffe4" +
    "\010\uffe4\011\uffe4\013\uffe4\014\uffe4\016\uffe4\036\uffe4\037" +
    "\uffe4\040\uffe4\041\uffe4\042\uffe4\043\uffe4\044\uffe4\045\uffe4" +
    "\046\uffe4\047\uffe4\051\uffe4\001\002\000\044\005\ufff8\010" +
    "\ufff8\011\ufff8\013\ufff8\014\ufff8\016\ufff8\036\ufff8\037\ufff8" +
    "\040\ufff8\041\ufff8\042\ufff8\043\ufff8\044\ufff8\045\ufff8\046" +
    "\ufff8\047\ufff8\051\ufff8\001\002\000\040\005\047\010\uffdf" +
    "\011\uffdf\016\uffdf\036\042\037\053\040\052\041\044\042" +
    "\055\043\041\044\045\045\050\046\056\047\051\051\043" +
    "\001\002\000\044\005\ufffb\010\ufffb\011\ufffb\013\ufffb\014" +
    "\ufffb\016\ufffb\036\ufffb\037\ufffb\040\ufffb\041\ufffb\042\ufffb" +
    "\043\ufffb\044\ufffb\045\ufffb\046\ufffb\047\ufffb\051\ufffb\001" +
    "\002\000\030\015\022\017\030\020\015\021\024\022\031" +
    "\023\035\024\023\043\027\054\016\055\034\056\017\001" +
    "\002\000\044\005\ufff5\010\ufff5\011\ufff5\013\ufff5\014\ufff5" +
    "\016\ufff5\036\ufff5\037\ufff5\040\ufff5\041\ufff5\042\ufff5\043" +
    "\ufff5\044\ufff5\045\ufff5\046\ufff5\047\ufff5\051\ufff5\001\002" +
    "\000\044\005\ufff7\010\ufff7\011\ufff7\013\ufff7\014\ufff7\016" +
    "\ufff7\036\ufff7\037\ufff7\040\ufff7\041\ufff7\042\ufff7\043\ufff7" +
    "\044\ufff7\045\ufff7\046\ufff7\047\ufff7\051\ufff7\001\002\000" +
    "\044\005\ufffc\010\ufffc\011\ufffc\013\ufffc\014\ufffc\016\ufffc" +
    "\036\ufffc\037\ufffc\040\ufffc\041\ufffc\042\ufffc\043\ufffc\044" +
    "\ufffc\045\ufffc\046\ufffc\047\ufffc\051\ufffc\001\002\000\004" +
    "\010\060\001\002\000\004\015\037\001\002\000\044\005" +
    "\ufff6\010\ufff6\011\ufff6\013\ufff6\014\ufff6\016\ufff6\036\ufff6" +
    "\037\ufff6\040\ufff6\041\ufff6\042\ufff6\043\ufff6\044\ufff6\045" +
    "\ufff6\046\ufff6\047\ufff6\051\ufff6\001\002\000\044\005\ufffa" +
    "\010\ufffa\011\ufffa\013\ufffa\014\ufffa\016\ufffa\036\ufffa\037" +
    "\ufffa\040\ufffa\041\ufffa\042\ufffa\043\ufffa\044\ufffa\045\ufffa" +
    "\046\ufffa\047\ufffa\051\ufffa\001\002\000\030\015\022\017" +
    "\030\020\015\021\024\022\031\023\035\024\023\043\027" +
    "\054\016\055\034\056\017\001\002\000\034\005\047\016" +
    "\054\036\042\037\053\040\052\041\044\042\055\043\041" +
    "\044\045\045\050\046\056\047\051\051\043\001\002\000" +
    "\030\015\uffd0\017\uffd0\020\uffd0\021\uffd0\022\uffd0\023\uffd0" +
    "\024\uffd0\043\uffd0\054\uffd0\055\uffd0\056\uffd0\001\002\000" +
    "\030\015\uffd6\017\uffd6\020\uffd6\021\uffd6\022\uffd6\023\uffd6" +
    "\024\uffd6\043\uffd6\054\uffd6\055\uffd6\056\uffd6\001\002\000" +
    "\030\015\uffcb\017\uffcb\020\uffcb\021\uffcb\022\uffcb\023\uffcb" +
    "\024\uffcb\043\uffcb\054\uffcb\055\uffcb\056\uffcb\001\002\000" +
    "\030\015\uffd3\017\uffd3\020\uffd3\021\uffd3\022\uffd3\023\uffd3" +
    "\024\uffd3\043\uffd3\054\uffd3\055\uffd3\056\uffd3\001\002\000" +
    "\030\015\uffcf\017\uffcf\020\uffcf\021\uffcf\022\uffcf\023\uffcf" +
    "\024\uffcf\043\uffcf\054\uffcf\055\uffcf\056\uffcf\001\002\000" +
    "\030\015\022\017\030\020\015\021\024\022\031\023\035" +
    "\024\023\043\027\054\016\055\034\056\017\001\002\000" +
    "\030\015\uffd2\017\uffd2\020\uffd2\021\uffd2\022\uffd2\023\uffd2" +
    "\024\uffd2\043\uffd2\054\uffd2\055\uffd2\056\uffd2\001\002\000" +
    "\030\015\uffce\017\uffce\020\uffce\021\uffce\022\uffce\023\uffce" +
    "\024\uffce\043\uffce\054\uffce\055\uffce\056\uffce\001\002\000" +
    "\030\015\uffcc\017\uffcc\020\uffcc\021\uffcc\022\uffcc\023\uffcc" +
    "\024\uffcc\043\uffcc\054\uffcc\055\uffcc\056\uffcc\001\002\000" +
    "\030\015\uffd4\017\uffd4\020\uffd4\021\uffd4\022\uffd4\023\uffd4" +
    "\024\uffd4\043\uffd4\054\uffd4\055\uffd4\056\uffd4\001\002\000" +
    "\030\015\uffd5\017\uffd5\020\uffd5\021\uffd5\022\uffd5\023\uffd5" +
    "\024\uffd5\043\uffd5\054\uffd5\055\uffd5\056\uffd5\001\002\000" +
    "\044\005\uffe9\010\uffe9\011\uffe9\013\uffe9\014\uffe9\016\uffe9" +
    "\036\uffe9\037\uffe9\040\uffe9\041\uffe9\042\uffe9\043\uffe9\044" +
    "\uffe9\045\uffe9\046\uffe9\047\uffe9\051\uffe9\001\002\000\030" +
    "\015\uffd1\017\uffd1\020\uffd1\021\uffd1\022\uffd1\023\uffd1\024" +
    "\uffd1\043\uffd1\054\uffd1\055\uffd1\056\uffd1\001\002\000\030" +
    "\015\uffcd\017\uffcd\020\uffcd\021\uffcd\022\uffcd\023\uffcd\024" +
    "\uffcd\043\uffcd\054\uffcd\055\uffcd\056\uffcd\001\002\000\044" +
    "\005\047\010\uffeb\011\uffeb\013\uffeb\014\uffeb\016\uffeb\036" +
    "\042\037\053\040\052\041\044\042\055\043\041\044\045" +
    "\045\050\046\056\047\051\051\043\001\002\000\004\002" +
    "\uffe2\001\002\000\044\005\047\010\uffe8\011\uffe8\013\uffe8" +
    "\014\uffe8\016\uffe8\036\uffe8\037\uffe8\040\052\041\044\042" +
    "\055\043\uffe8\044\uffe8\045\050\046\uffe8\047\uffe8\051\043" +
    "\001\002\000\034\005\047\016\063\036\042\037\053\040" +
    "\052\041\044\042\055\043\041\044\045\045\050\046\056" +
    "\047\051\051\043\001\002\000\044\005\uffe7\010\uffe7\011" +
    "\uffe7\013\uffe7\014\uffe7\016\uffe7\036\uffe7\037\uffe7\040\uffe7" +
    "\041\uffe7\042\uffe7\043\uffe7\044\uffe7\045\uffe7\046\uffe7\047" +
    "\uffe7\051\uffe7\001\002\000\030\015\022\017\030\020\015" +
    "\021\024\022\031\023\035\024\023\043\027\054\016\055" +
    "\034\056\017\001\002\000\040\005\047\010\uffde\011\uffde" +
    "\016\uffde\036\042\037\053\040\052\041\044\042\055\043" +
    "\041\044\045\045\050\046\056\047\051\051\043\001\002" +
    "\000\032\015\022\016\uffe0\017\030\020\015\021\024\022" +
    "\031\023\035\024\023\043\027\054\016\055\034\056\017" +
    "\001\002\000\004\016\070\001\002\000\044\005\uffe5\010" +
    "\uffe5\011\uffe5\013\uffe5\014\uffe5\016\uffe5\036\uffe5\037\uffe5" +
    "\040\uffe5\041\uffe5\042\uffe5\043\uffe5\044\uffe5\045\uffe5\046" +
    "\uffe5\047\uffe5\051\uffe5\001\002\000\034\010\uffea\011\uffea" +
    "\013\uffea\014\uffea\016\uffea\036\uffea\037\uffea\041\uffea\043" +
    "\uffea\044\uffea\046\uffea\047\uffea\051\uffea\001\002\000\022" +
    "\025\012\026\077\027\101\030\073\031\007\032\103\033" +
    "\102\034\075\001\002\000\006\006\ufff3\011\ufff3\001\002" +
    "\000\006\006\uffee\011\uffee\001\002\000\006\006\uffef\011" +
    "\uffef\001\002\000\006\006\uffec\011\uffec\001\002\000\006" +
    "\006\uffed\011\uffed\001\002\000\006\006\ufff2\011\ufff2\001" +
    "\002\000\006\006\ufff4\011\ufff4\001\002\000\006\006\ufff0" +
    "\011\ufff0\001\002\000\006\006\ufff1\011\ufff1\001\002\000" +
    "\004\006\105\001\002\000\010\002\uffe3\006\uffe3\011\uffe3" +
    "\001\002\000\004\002\000\001\002\000\022\025\012\026" +
    "\077\027\101\030\073\031\007\032\103\033\102\034\075" +
    "\001\002\000\004\011\111\001\002\000\022\025\012\026" +
    "\077\027\101\030\073\031\007\032\103\033\102\034\075" +
    "\001\002\000\004\006\113\001\002\000\010\002\uffdd\006" +
    "\uffdd\011\uffdd\001\002\000\006\011\uffd9\013\uffd9\001\002" +
    "\000\034\005\047\014\123\036\042\037\053\040\052\041" +
    "\044\042\055\043\041\044\045\045\050\046\056\047\051" +
    "\051\043\001\002\000\004\013\122\001\002\000\006\011" +
    "\120\013\uffdb\001\002\000\030\015\022\017\030\020\015" +
    "\021\024\022\031\023\035\024\023\043\027\054\016\055" +
    "\034\056\017\001\002\000\006\011\uffd8\013\uffd8\001\002" +
    "\000\004\002\uffdc\001\002\000\030\015\022\017\030\020" +
    "\015\021\024\022\031\023\035\024\023\043\027\054\016" +
    "\055\034\056\017\001\002\000\036\005\047\011\uffd7\013" +
    "\uffd7\036\042\037\053\040\052\041\044\042\055\043\041" +
    "\044\045\045\050\046\056\047\051\051\043\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\122\000\014\002\007\007\012\010\010\015\005\020" +
    "\003\001\001\000\002\001\001\000\022\003\025\004\031" +
    "\011\114\013\035\014\017\021\115\022\116\023\113\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\003\025\004\031\011\024\013\035\014\017\016\032" +
    "\017\020\001\001\000\002\001\001\000\014\003\025\004" +
    "\031\011\070\013\035\014\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\003\025\004" +
    "\031\011\061\013\035\014\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\045\001\001\000\002\001" +
    "\001\000\014\003\025\004\031\011\060\013\035\014\017" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\003\025\004\031\011\037\013" +
    "\035\014\017\001\001\000\004\012\045\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\003\025\004\031\011\056" +
    "\013\035\014\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\045\001\001\000\002\001\001\000\004\012\045" +
    "\001\001\000\004\012\045\001\001\000\002\001\001\000" +
    "\014\003\025\004\031\011\064\013\035\014\017\001\001" +
    "\000\004\012\045\001\001\000\020\003\025\004\031\011" +
    "\024\013\035\014\017\016\066\017\020\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\045\001\001\000" +
    "\012\005\075\006\103\007\077\010\073\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\005\075\006\107" +
    "\007\077\010\073\001\001\000\002\001\001\000\012\005" +
    "\075\006\111\007\077\010\073\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\025" +
    "\004\031\011\114\013\035\014\017\023\120\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\003\025\004\031" +
    "\011\123\013\035\014\017\001\001\000\004\012\045\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




  public Boolean syntaxErrors = false;

  public void syntax_error(Symbol current_token){
  report_error("Syntax error at line " + (current_token.left+1) +
  ", column " + current_token.right + "\n", null);
  }
  private Lexer lexer;

  public Parser(Lexer lex) {
    super(lex);
    lexer = lex;
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= sequence_t 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= sequence_start 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // program ::= dict_t 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // program ::= dict_start 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expression ::= item 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expression ::= collection 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expression ::= evaluable 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // item ::= CHAR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("item",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // item ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("item",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // item ::= INTEGER 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("item",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // item ::= RATIONAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("item",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // item ::= BOOL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("item",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // type ::= BOOLEAN_T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // type ::= CHAR_T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // type ::= dict_t 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // type ::= FLOAT_T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // type ::= INT_T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // type ::= RATIONAL_T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // type ::= sequence_t 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // type_with_top ::= TOP_T 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_with_top",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // type_with_top ::= type 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("type_with_top",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // evaluable ::= expression l_r_op expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("evaluable",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // evaluable ::= NOT expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("evaluable",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // evaluable ::= LEN LPAREN expression RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("evaluable",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // evaluable ::= MINUS expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("evaluable",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // evaluable ::= LPAREN expression RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("evaluable",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // evaluable ::= function_call 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("evaluable",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // function_call ::= IDENTIFIER LPAREN sequence_contents RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("function_call",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // collection ::= STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("collection",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // sequence_t ::= SEQ_T LANGLE type_with_top RANGLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence_t",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // sequence_start ::= LBRACKET sequence_contents RBRACKET 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence_start",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // sequence_contents ::= sequence_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence_contents",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // sequence_contents ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence_contents",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // sequence_body ::= expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence_body",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // sequence_body ::= sequence_body COMMA expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence_body",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // dict_t ::= DICT_T LANGLE type_with_top COMMA type_with_top RANGLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_t",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // dict_start ::= LBRACE dict_contents RBRACE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_start",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // dict_contents ::= dict_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_contents",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // dict_contents ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_contents",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // dict_body ::= dict_value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_body",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // dict_body ::= dict_body COMMA dict_value 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_body",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // dict_value ::= expression COLON expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dict_value",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // l_r_op ::= AND 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // l_r_op ::= DIV 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // l_r_op ::= EQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // l_r_op ::= IN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // l_r_op ::= LANGLE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // l_r_op ::= LTEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // l_r_op ::= MINUS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // l_r_op ::= MULT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // l_r_op ::= NEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // l_r_op ::= OR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // l_r_op ::= PLUS 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // l_r_op ::= POW 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("l_r_op",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
