/* adder.java */
/* Generated By:JavaCC: Do not edit this line. adder.java */
import java.util.ArrayList;

class adder implements adderConstants {
                        public static void main(String[]args)
                        throws ParseException, TokenMgrError{
                        adder parser=new adder(System.in);
                        parser.Programa();}

//Inicio de procedimientos para definir patrones
  final public 

void Start() throws ParseException {int contador = 0;
        Token t;
        ArrayList<String> Lista = new ArrayList<String>();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDREACH:
      case CLASSTYPE:
      case VOID:
      case NUMTYPES:
      case FLOATTYPE:
      case STRINGTYPE:
      case CHARTYPE:
      case BOOL:
      case LPAR:
      case RPAR:
      case LBRACE:
      case RBRACE:
      case SEMICOLON:
      case ARITM:
      case CONDITION:
      case RELAT:
      case STRUCTTYPE:
      case CLASS:
      case ALT:
      case FOREACH:
      case CATCH:
      case TRYBLOCK:
      case PRINTOUT:
      case IFSTRUCT:
      case SWITCHSTRUCT:
      case IDENTIFIER:
      case NUMBER:
      case STRING:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMBER:{
        jj_consume_token(NUMBER);
        break;
        }
      case STRING:{
        jj_consume_token(STRING);
        break;
        }
      case IDREACH:{
        jj_consume_token(IDREACH);
        break;
        }
      case CLASSTYPE:{
        jj_consume_token(CLASSTYPE);
        break;
        }
      case VOID:{
        jj_consume_token(VOID);
        break;
        }
      case NUMTYPES:{
        jj_consume_token(NUMTYPES);
        break;
        }
      case FLOATTYPE:{
        jj_consume_token(FLOATTYPE);
        break;
        }
      case STRINGTYPE:{
        jj_consume_token(STRINGTYPE);
        break;
        }
      case CHARTYPE:{
        jj_consume_token(CHARTYPE);
        break;
        }
      case BOOL:{
        jj_consume_token(BOOL);
        break;
        }
      case LPAR:{
        jj_consume_token(LPAR);
        break;
        }
      case RPAR:{
        jj_consume_token(RPAR);
        break;
        }
      case LBRACE:{
        jj_consume_token(LBRACE);
        break;
        }
      case RBRACE:{
        jj_consume_token(RBRACE);
        break;
        }
      case SEMICOLON:{
        jj_consume_token(SEMICOLON);
        break;
        }
      case ARITM:{
        jj_consume_token(ARITM);
        break;
        }
      case CONDITION:{
        jj_consume_token(CONDITION);
        break;
        }
      case RELAT:{
        jj_consume_token(RELAT);
        break;
        }
      case STRUCTTYPE:{
        jj_consume_token(STRUCTTYPE);
        break;
        }
      case CLASS:{
        jj_consume_token(CLASS);
        break;
        }
      case ALT:{
        jj_consume_token(ALT);
        break;
        }
      case FOREACH:{
        jj_consume_token(FOREACH);
        break;
        }
      case CATCH:{
        jj_consume_token(CATCH);
        break;
        }
      case TRYBLOCK:{
        jj_consume_token(TRYBLOCK);
        break;
        }
      case PRINTOUT:{
        jj_consume_token(PRINTOUT);
        break;
        }
      case IFSTRUCT:{
        jj_consume_token(IFSTRUCT);
        break;
        }
      case SWITCHSTRUCT:{
        jj_consume_token(SWITCHSTRUCT);
        break;
        }
      case IDENTIFIER:{
        t = jj_consume_token(IDENTIFIER);
String variable = t.image;
if(Lista.contains(variable))
                                {

                                }
                                else
                                {
                                        Lista.add(variable);
                                }
                                contador++;
System.out.println("Identificador: " + variable + " " + Lista.indexOf(variable) );
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  final public void Programa() throws ParseException {
    jj_consume_token(IDENTIFIER);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PACKEXP:
    case IMPORT:{
      Librerias();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      Clase();
    }
    jj_consume_token(0);
}

  final public void Librerias() throws ParseException {
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PACKEXP:{
        jj_consume_token(PACKEXP);
        break;
        }
      case IMPORT:{
        jj_consume_token(IMPORT);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PACKEXP:
      case IMPORT:{
        ;
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
    }
}

  final public void Clase() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      Heredar();
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMTYPES:
      case STRINGTYPE:
      case DEF:
      case CONST:
      case ENUM:
      case COMENT:
      case SIZEOF:{
        ;
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DEF:{
        DeclarVarGlob();
        break;
        }
      case CONST:{
        Metodo();
        break;
        }
      case ENUM:{
        Enumerable();
        break;
        }
      case NUMTYPES:
      case STRINGTYPE:{
        Estructura();
        break;
        }
      case COMENT:{
        Comentario();
        break;
        }
      case SIZEOF:{
        Size();
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  final public void Heredar() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(HCLASS);
}

  final public void DeclarVarGlob() throws ParseException {
    jj_consume_token(DEF);
    DefinirVariables();
    jj_consume_token(COLON);
}

  final public void DefinirVariables() throws ParseException {
    label_5:
    while (true) {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(ASIGN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMTYPES:{
        jj_consume_token(NUMTYPES);
        break;
        }
      case FLOATTYPE:{
        jj_consume_token(FLOATTYPE);
        break;
        }
      case BOOL:{
        jj_consume_token(BOOL);
        break;
        }
      case STRINGTYPE:{
        jj_consume_token(STRINGTYPE);
        break;
        }
      case CHARTYPE:{
        jj_consume_token(CHARTYPE);
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_5;
      }
    }
}

  final public void Metodo() throws ParseException {
    jj_consume_token(CONST);
    jj_consume_token(VOID);
    jj_consume_token(IDENTIFIER);
    Bloque();
    jj_consume_token(COLON);
}

  final public void Bloque() throws ParseException {
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LOOPFOR:
      case LOOPDO:
      case LOOPWHILE:
      case CONDITION:
      case FOREACH:
      case RAISE:
      case PRINTOUT:
      case IFSTRUCT:
      case DEF:
      case GOTO:
      case IDENTIFIER:
      case NUMBER:
      case STRING:{
        ;
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LOOPFOR:
      case LOOPDO:
      case LOOPWHILE:{
        Ciclos();
        break;
        }
      case IFSTRUCT:{
        Pregunta();
        break;
        }
      case PRINTOUT:{
        ImpCons();
        break;
        }
      case DEF:{
        declarVarLocal();
        break;
        }
      case CONDITION:
      case IDENTIFIER:
      case NUMBER:
      case STRING:{
        OpAritmetica();
        break;
        }
      case FOREACH:{
        CicloForEach();
        break;
        }
      case GOTO:{
        Goto();
        break;
        }
      case RAISE:{
        Raise();
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    Return();
}

  final public void ImpCons() throws ParseException {
    jj_consume_token(PRINTOUT);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CONDITION:
    case NUMBER:
    case STRING:{
      Valor();
      break;
      }
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Return() throws ParseException {
    jj_consume_token(RETURN);
    jj_consume_token(IDENTIFIER);
}

  final public void declarVarLocal() throws ParseException {
    jj_consume_token(DEF);
    DefinirVariables();
    jj_consume_token(COLON);
}

  final public void Ciclos() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LOOPFOR:{
      CicloFor();
      break;
      }
    case LOOPWHILE:{
      CicloWhile();
      break;
      }
    case LOOPDO:{
      CicloDo();
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void CicloFor() throws ParseException {
    jj_consume_token(LOOPFOR);
    EstructuraFor();
    Bloque();
    jj_consume_token(COLON);
}

  final public void EstructuraFor() throws ParseException {
    Condicion();
    jj_consume_token(COMA);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(ASIGN);
    Valor();
    jj_consume_token(COMA);
    Incremento();
}

  final public void Incremento() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(ARITM);
    Valor();
}

  final public void CicloWhile() throws ParseException {
    jj_consume_token(LOOPWHILE);
    Condicion();
    Bloque();
    jj_consume_token(COLON);
}

  final public void CicloDo() throws ParseException {
    jj_consume_token(LOOPDO);
    Bloque();
    jj_consume_token(LOOPWHILE);
    Condicion();
    jj_consume_token(COLON);
}

  final public void CicloForEach() throws ParseException {
    jj_consume_token(FOREACH);
    Condicion();
    Bloque();
    jj_consume_token(COLON);
}

  final public void Pregunta() throws ParseException {
    jj_consume_token(IFSTRUCT);
    Condicion();
    jj_consume_token(THEN);
    Bloque();
    jj_consume_token(COLON);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ALT:{
      Sino();
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      ;
    }
}

  final public void Sino() throws ParseException {
    jj_consume_token(ALT);
    Bloque();
    jj_consume_token(COLON);
}

  final public void TryCatch() throws ParseException {
    jj_consume_token(TRYBLOCK);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LOOPFOR:
      case LOOPDO:
      case LOOPWHILE:
      case CONDITION:
      case PRINTOUT:
      case IFSTRUCT:
      case DEF:
      case IDENTIFIER:
      case NUMBER:
      case STRING:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LOOPFOR:
      case LOOPDO:
      case LOOPWHILE:{
        Ciclos();
        break;
        }
      case IFSTRUCT:{
        Pregunta();
        break;
        }
      case PRINTOUT:{
        ImpCons();
        break;
        }
      case DEF:{
        declarVarLocal();
        break;
        }
      case CONDITION:
      case IDENTIFIER:
      case NUMBER:
      case STRING:{
        OpAritmetica();
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(COLON);
    jj_consume_token(CATCH);
    Bloque();
    jj_consume_token(COLON);
}

  final public void Switch() throws ParseException {
    jj_consume_token(SWITCHSTRUCT);
    jj_consume_token(IDENTIFIER);
    label_8:
    while (true) {
      jj_consume_token(CASE);
      Valor();
      Bloque();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:{
        ;
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        break label_8;
      }
    }
    jj_consume_token(COLON);
}

  final public void Condicion() throws ParseException {
    Oprelacional();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LOGIC:{
        ;
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        break label_9;
      }
      jj_consume_token(LOGIC);
      Oprelacional();
    }
}

  final public void Oprelacional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      break;
      }
    case CONDITION:
    case NUMBER:
    case STRING:{
      Valor();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ARITM:{
        ;
        break;
        }
      default:
        jj_la1[21] = jj_gen;
        break label_10;
      }
      jj_consume_token(ARITM);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case CONDITION:
      case NUMBER:
      case STRING:{
        Valor();
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RELAT);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      break;
      }
    case CONDITION:
    case NUMBER:
    case STRING:{
      Valor();
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ARITM:{
        ;
        break;
        }
      default:
        jj_la1[24] = jj_gen;
        break label_11;
      }
      jj_consume_token(ARITM);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case CONDITION:
      case NUMBER:
      case STRING:{
        Valor();
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  final public void OpAritmetica() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      jj_consume_token(ASIGN);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      break;
      }
    case CONDITION:
    case NUMBER:
    case STRING:{
      Valor();
      break;
      }
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ARITM:{
        ;
        break;
        }
      default:
        jj_la1[28] = jj_gen;
        break label_12;
      }
      jj_consume_token(ARITM);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case CONDITION:
      case NUMBER:
      case STRING:{
        Valor();
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

  final public void Valor() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CONDITION:{
      jj_consume_token(CONDITION);
      break;
      }
    case NUMBER:{
      jj_consume_token(NUMBER);
      break;
      }
    case STRING:{
      jj_consume_token(STRING);
      break;
      }
    default:
      jj_la1[30] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Enumerable() throws ParseException {
    jj_consume_token(ENUM);
    jj_consume_token(IDENTIFIER);
    BloqueEnum();
    jj_consume_token(COLON);
}

  final public void BloqueEnum() throws ParseException {
    label_13:
    while (true) {
      Valor();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONDITION:
      case NUMBER:
      case STRING:{
        ;
        break;
        }
      default:
        jj_la1[31] = jj_gen;
        break label_13;
      }
    }
}

  final public void Estructura() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRINGTYPE:{
      jj_consume_token(STRINGTYPE);
      break;
      }
    case NUMTYPES:{
      jj_consume_token(NUMTYPES);
      break;
      }
    default:
      jj_la1[32] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LIST:
    case STACK:
    case QUEUE:{
      EstructuraDatos();
      break;
      }
    case STRUCTTYPE:
    case ARRAY:{
      EstructuraEstatica();
      jj_consume_token(IDENTIFIER);
      break;
      }
    default:
      jj_la1[33] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void EstructuraDatos() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LIST:{
      Lista();
      break;
      }
    case STACK:{
      Stack();
      break;
      }
    case QUEUE:{
      Queue();
      break;
      }
    default:
      jj_la1[34] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Lista() throws ParseException {
    jj_consume_token(LIST);
    jj_consume_token(IDENTIFIER);
    label_14:
    while (true) {
      jj_consume_token(NUMBER);
      jj_consume_token(COMA);
      Valor();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUMBER:{
        ;
        break;
        }
      default:
        jj_la1[35] = jj_gen;
        break label_14;
      }
    }
    jj_consume_token(COLON);
}

  final public void Stack() throws ParseException {
    jj_consume_token(STACK);
    jj_consume_token(IDENTIFIER);
    label_15:
    while (true) {
      Valor();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONDITION:
      case NUMBER:
      case STRING:{
        ;
        break;
        }
      default:
        jj_la1[36] = jj_gen;
        break label_15;
      }
    }
    jj_consume_token(COLON);
}

  final public void Queue() throws ParseException {
    jj_consume_token(QUEUE);
    jj_consume_token(IDENTIFIER);
    label_16:
    while (true) {
      Valor();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONDITION:
      case NUMBER:
      case STRING:{
        ;
        break;
        }
      default:
        jj_la1[37] = jj_gen;
        break label_16;
      }
    }
    jj_consume_token(COLON);
}

  final public void EstructuraEstatica() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ARRAY:{
      jj_consume_token(ARRAY);
      break;
      }
    case STRUCTTYPE:{
      jj_consume_token(STRUCTTYPE);
      break;
      }
    default:
      jj_la1[38] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Comentario() throws ParseException {
    jj_consume_token(COMENT);
    Valor();
}

  final public void Size() throws ParseException {
    jj_consume_token(SIZEOF);
    jj_consume_token(IDENTIFIER);
}

  final public void Goto() throws ParseException {
    jj_consume_token(GOTO);
    jj_consume_token(NUMBER);
}

  final public void Raise() throws ParseException {
    jj_consume_token(RAISE);
    Bloque();
    jj_consume_token(COLON);
}

  final public void Conversion() throws ParseException {
    jj_consume_token(EXPLICIT);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(TO);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMTYPES:{
      jj_consume_token(NUMTYPES);
      break;
      }
    case STRINGTYPE:{
      jj_consume_token(STRINGTYPE);
      break;
      }
    case FLOATTYPE:{
      jj_consume_token(FLOATTYPE);
      break;
      }
    case CHARTYPE:{
      jj_consume_token(CHARTYPE);
      break;
      }
    default:
      jj_la1[39] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Ignorar() throws ParseException {
    jj_consume_token(PASS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LOOPFOR:
    case LOOPDO:
    case LOOPWHILE:{
      Ciclos();
      break;
      }
    case IFSTRUCT:{
      Pregunta();
      break;
      }
    case PRINTOUT:{
      ImpCons();
      break;
      }
    case DEF:{
      declarVarLocal();
      break;
      }
    case CONDITION:
    case IDENTIFIER:
    case NUMBER:
    case STRING:{
      OpAritmetica();
      break;
      }
    default:
      jj_la1[40] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Evento() throws ParseException {
    jj_consume_token(EVENT);
    Condicion();
    Bloque();
    jj_consume_token(COLON);
}

  /** Generated Token Manager. */
  public adderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[41];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	   jj_la1_init_2();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x6ed03ffe,0x6ed03ffe,0x0,0x4000000,0x0,0x0,0x0,0x50,0x50,0x1f0,0x0,0xa04e0000,0xa04e0000,0x400000,0xe0000,0x8000000,0x4e0000,0x4e0000,0x10000000,0x1000000,0x400000,0x100000,0x400000,0x400000,0x100000,0x400000,0x0,0x400000,0x100000,0x400000,0x400000,0x400000,0x50,0x2000000,0x0,0x0,0x400000,0x400000,0x2000000,0xf0,0x4e0000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x1180000f,0x1180000f,0x60,0x800000,0x60,0x60,0x800000,0x30b00,0x30b00,0x0,0x800000,0x11840106,0x11840106,0x11800000,0x0,0x0,0x11800106,0x11800106,0x0,0x0,0x11800000,0x0,0x11800000,0x11800000,0x0,0x11800000,0x800000,0x11800000,0x0,0x11800000,0x11000000,0x11000000,0x0,0xf000,0x7000,0x1000000,0x11000000,0x11000000,0x8000,0x0,0x11800106,};
	}
	private static void jj_la1_init_2() {
	   jj_la1_2 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
	}

  /** Constructor with InputStream. */
  public adder(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public adder(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new adderTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 41; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 41; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public adder(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new adderTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 41; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new adderTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 41; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public adder(adderTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 41; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(adderTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 41; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[66];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 41; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		   if ((jj_la1_2[i] & (1<<j)) != 0) {
			 la1tokens[64+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 66; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

                }
