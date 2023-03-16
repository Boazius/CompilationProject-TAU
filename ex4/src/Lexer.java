/* The following code was generated by JFlex 1.7.0 */

/***************************/
/* FILE NAME: LEX_FILE.lex */
/***************************/

/*************/
/* USER CODE */
/*************/
import java_cup.runtime.*;

/******************************/
/* DOLAR DOLAR - DON'T TOUCH! */
/******************************/


class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\43\1\3\1\1\22\0\1\3\1\27\1\20"+
    "\5\0\1\21\1\22\1\34\1\30\1\36\1\31\1\32\1\35\1\4"+
    "\1\5\1\7\1\6\2\5\1\11\1\10\2\12\1\41\1\33\1\42"+
    "\1\37\1\40\1\27\1\0\32\13\1\25\1\0\1\26\3\0\1\16"+
    "\1\13\1\14\1\53\1\51\1\57\1\60\1\56\1\44\2\13\1\15"+
    "\1\13\1\45\1\62\2\13\1\47\1\17\1\46\1\54\1\61\1\55"+
    "\1\52\1\50\1\13\1\23\1\0\1\24\7\0\1\43\u1fa2\0\1\43"+
    "\1\43\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\3\3\4\4\1\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\1\1\24\6\4"+
    "\1\1\2\3\3\4\1\0\1\25\2\1\1\26\1\4"+
    "\1\27\6\4\2\3\3\4\3\0\1\30\1\31\1\32"+
    "\4\4\2\3\3\4\1\0\3\4\1\33\1\34\1\35"+
    "\1\4\1\2\2\4\1\36\1\37\1\40\1\4\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\63\0\231\0\314\0\377\0\u0132"+
    "\0\u0165\0\u0198\0\u01cb\0\u01fe\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\63\0\u0231"+
    "\0\63\0\63\0\63\0\u0264\0\63\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\u0363\0\u0396\0\231\0\u03c9\0\u03fc\0\u042f\0\u0462"+
    "\0\u0495\0\u01fe\0\63\0\u04c8\0\u04fb\0\63\0\u052e\0\u0132"+
    "\0\u0561\0\u0594\0\u05c7\0\u05fa\0\u062d\0\u0660\0\u0693\0\u06c6"+
    "\0\u06f9\0\u072c\0\u075f\0\u04c8\0\u0792\0\u04fb\0\u0132\0\u0132"+
    "\0\u0132\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7"+
    "\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0132\0\u0132"+
    "\0\u0132\0\u0a5c\0\u04c8\0\u0a8f\0\u0ac2\0\u0132\0\u0132\0\u0132"+
    "\0\u0af5\0\u0132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\4\6\1\10"+
    "\1\11\1\10\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\2\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\0"+
    "\1\36\1\37\1\10\1\40\1\10\1\41\3\10\1\42"+
    "\3\10\1\43\1\10\65\0\1\4\64\0\7\44\54\0"+
    "\7\45\54\0\3\45\1\46\3\45\54\0\14\10\24\0"+
    "\17\10\4\0\11\10\1\47\2\10\24\0\17\10\4\0"+
    "\14\10\24\0\3\10\1\50\13\10\4\0\14\10\24\0"+
    "\2\10\1\51\14\10\13\0\5\52\1\53\23\0\17\52"+
    "\34\0\1\54\1\55\64\0\1\56\27\0\14\10\24\0"+
    "\1\10\1\57\11\10\1\60\3\10\4\0\14\10\24\0"+
    "\1\61\4\10\1\62\11\10\4\0\14\10\24\0\5\10"+
    "\1\63\11\10\4\0\14\10\24\0\6\10\1\64\10\10"+
    "\4\0\14\10\24\0\12\10\1\65\4\10\4\0\14\10"+
    "\24\0\16\10\1\66\4\0\7\67\54\0\4\67\1\70"+
    "\2\67\54\0\12\10\1\71\1\10\24\0\17\10\4\0"+
    "\14\10\24\0\3\10\1\72\13\10\4\0\14\10\24\0"+
    "\3\10\1\73\13\10\1\0\17\74\1\0\13\74\1\75"+
    "\1\74\6\0\17\74\1\0\1\3\1\4\15\76\1\0"+
    "\15\76\6\0\17\76\4\0\14\10\24\0\2\10\1\77"+
    "\14\10\4\0\11\10\1\100\2\10\24\0\17\10\4\0"+
    "\14\10\24\0\11\10\1\101\5\10\4\0\14\10\24\0"+
    "\2\10\1\102\14\10\4\0\14\10\24\0\2\10\1\103"+
    "\14\10\4\0\14\10\24\0\1\104\16\10\4\0\14\10"+
    "\24\0\1\105\16\10\4\0\7\106\54\0\5\106\1\107"+
    "\1\106\54\0\13\10\1\110\24\0\17\10\4\0\12\10"+
    "\1\111\1\10\24\0\17\10\4\0\14\10\24\0\1\112"+
    "\16\10\1\0\17\74\1\0\13\74\1\113\1\4\6\0"+
    "\17\74\4\0\14\10\24\0\10\10\1\114\6\10\4\0"+
    "\14\10\24\0\5\10\1\115\11\10\4\0\11\10\1\116"+
    "\2\10\24\0\17\10\4\0\14\10\24\0\7\10\1\117"+
    "\7\10\4\0\7\5\54\0\6\5\1\44\54\0\13\10"+
    "\1\120\24\0\17\10\4\0\14\10\24\0\4\10\1\121"+
    "\12\10\4\0\14\10\24\0\1\10\1\122\15\10\1\0"+
    "\17\74\1\0\13\74\1\75\1\123\6\0\17\74\4\0"+
    "\14\10\24\0\3\10\1\124\13\10\4\0\14\10\24\0"+
    "\1\10\1\125\15\10\4\0\14\10\24\0\5\10\1\126"+
    "\11\10\4\0\14\10\24\0\14\10\1\127\2\10\4\0"+
    "\14\10\24\0\1\10\1\130\15\10\4\0\14\10\24\0"+
    "\7\10\1\131\7\10\4\0\13\10\1\132\24\0\17\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2856];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\10\1\13\11\1\1\3\11"+
    "\1\1\1\11\14\1\1\0\1\11\2\1\1\11\15\1"+
    "\3\0\14\1\1\0\17\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	/*********************************************************************************/
	/* Create a new java_cup.runtime.Symbol with information about the current token */
	/*********************************************************************************/
	private Symbol symbol(int type)               {return new Symbol(type, yyline, yycolumn);}
	private Symbol symbol(int type, Object value) {return new Symbol(type, yyline, yycolumn, value);}

	/*******************************************/
	/* Enable line number extraction from main */
	/*******************************************/
	public int getLine() { return yyline + 1; } 

	/**********************************************/
	/* Enable token position extraction from main */
	/**********************************************/
	public int getTokenStartPosition() { return yycolumn + 1; }
	public int getCharPos() { return yycolumn; }

	/* check string is a number between 0 and 2^15 -1. */
	/* returns -1 if invalid, else returns the number in int form */
	public int getValidInt(String numString)
	{
		/*check valid length of number */
		if (numString.length() > 5)
		return -1;
		/*check if leading zeroes */
		if(numString.charAt(0)=='0')
		{
			if(numString.length()>1)
			return -1;
			return 0;
		}
		/*parse number */
		int num = new Integer(numString);
		if (num >= 0 && num <= 32767)
		return num;
		return -1;
	}
 


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case YYINITIAL: {
              return symbol(TokenNames.EOF);
            }  // fall though
            case 91: break;
            default:
          { return new java_cup.runtime.Symbol(TokenNames.EOF); }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return symbol(TokenNames.ERROR);
            } 
            // fall through
          case 34: break;
          case 2: 
            { /* just skip what was found, do nothing */
            } 
            // fall through
          case 35: break;
          case 3: 
            { int num = getValidInt(yytext());
						if(num==-1)
						{
						return symbol(TokenNames.ERROR);
						} else {
						return symbol(TokenNames.INT, num);
						}
            } 
            // fall through
          case 36: break;
          case 4: 
            { return symbol(TokenNames.ID,  new String( yytext()));
            } 
            // fall through
          case 37: break;
          case 5: 
            { return symbol(TokenNames.LPAREN);
            } 
            // fall through
          case 38: break;
          case 6: 
            { return symbol(TokenNames.RPAREN);
            } 
            // fall through
          case 39: break;
          case 7: 
            { return symbol(TokenNames.LBRACE);
            } 
            // fall through
          case 40: break;
          case 8: 
            { return symbol(TokenNames.RBRACE);
            } 
            // fall through
          case 41: break;
          case 9: 
            { return symbol(TokenNames.LBRACK);
            } 
            // fall through
          case 42: break;
          case 10: 
            { return symbol(TokenNames.RBRACK);
            } 
            // fall through
          case 43: break;
          case 11: 
            { return symbol(TokenNames.PLUS);
            } 
            // fall through
          case 44: break;
          case 12: 
            { return symbol(TokenNames.MINUS);
            } 
            // fall through
          case 45: break;
          case 13: 
            { return symbol(TokenNames.DOT);
            } 
            // fall through
          case 46: break;
          case 14: 
            { return symbol(TokenNames.SEMICOLON);
            } 
            // fall through
          case 47: break;
          case 15: 
            { return symbol(TokenNames.TIMES);
            } 
            // fall through
          case 48: break;
          case 16: 
            { return symbol(TokenNames.DIVIDE);
            } 
            // fall through
          case 49: break;
          case 17: 
            { return symbol(TokenNames.COMMA);
            } 
            // fall through
          case 50: break;
          case 18: 
            { return symbol(TokenNames.EQ);
            } 
            // fall through
          case 51: break;
          case 19: 
            { return symbol(TokenNames.GT);
            } 
            // fall through
          case 52: break;
          case 20: 
            { return symbol(TokenNames.LT);
            } 
            // fall through
          case 53: break;
          case 21: 
            { return symbol(TokenNames.STRING,  new String( yytext()));
            } 
            // fall through
          case 54: break;
          case 22: 
            { return symbol(TokenNames.ASSIGN);
            } 
            // fall through
          case 55: break;
          case 23: 
            { return symbol(TokenNames.IF);
            } 
            // fall through
          case 56: break;
          case 24: 
            { return symbol(TokenNames.TYPE_INT);
            } 
            // fall through
          case 57: break;
          case 25: 
            { return symbol(TokenNames.NIL);
            } 
            // fall through
          case 58: break;
          case 26: 
            { return symbol(TokenNames.NEW);
            } 
            // fall through
          case 59: break;
          case 27: 
            { return symbol(TokenNames.TYPE_VOID);
            } 
            // fall through
          case 60: break;
          case 28: 
            { return symbol(TokenNames.CLASS);
            } 
            // fall through
          case 61: break;
          case 29: 
            { return symbol(TokenNames.ARRAY);
            } 
            // fall through
          case 62: break;
          case 30: 
            { return symbol(TokenNames.WHILE);
            } 
            // fall through
          case 63: break;
          case 31: 
            { return symbol(TokenNames.TYPE_STRING);
            } 
            // fall through
          case 64: break;
          case 32: 
            { return symbol(TokenNames.RETURN);
            } 
            // fall through
          case 65: break;
          case 33: 
            { return symbol(TokenNames.EXTENDS);
            } 
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
