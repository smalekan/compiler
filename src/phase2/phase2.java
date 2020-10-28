/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 2 of "123.y"  */

	package phase2;
    import java.io.*;
    import java.util.ArrayList;


/**
 * A Bison parser, automatically generated from <tt>123.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class phase2
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int RECORD_KW = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int STATIC_KW = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int REAL_KW = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int INTEGER_KW = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENTS = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int LE_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int LT_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int GE_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int GT_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int EQ_KW = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int NE_KW = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int LCB_KW = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int RCB_KW = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMICOLON_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int LB_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int RB_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int LP_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int RP_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int SUB_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int DIV_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int ADDEQ_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int SUBEQ_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int MULEQ_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVEQ_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUSPLUS_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int MINESMINES_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int DOT_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int ID = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int REALCONST = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int NUMCONST = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLCONST = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int CHARCONST = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int p = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_THEN = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ELSE = 314;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public phase2(Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 207 of "123.y"  */
    {
				System.out.println("rule 1 : program -> declarationList \n");
				exportIntermediateCode();
				
			};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 213 of "123.y"  */
    {
				System.out.println(" rule 2.1 : declarationList -> declarationList declaration \n");
			};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 216 of "123.y"  */
    {
				System.out.println("rule 2.2 : declarationList -> declaration \n");
			};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 219 of "123.y"  */
    {
				System.out.println("rule 3.1 : declaration -> varDeclaration \n");
			};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 222 of "123.y"  */
    {
				System.out.println("rule 3.2 : declaration -> funDeclaration \n");
			};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 225 of "123.y"  */
    {
				System.out.println("rule 3.3 : declaration -> recDeclaration \n");
			};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 228 of "123.y"  */
    {
 symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (5-(2)))).place,110,false,1);
				System.out.println("rule 4 : recDeclaration -> record id {localDeclarations} \n");
				int pplace =  symbolTable.lookUp(((EVal)(yystack.valueAt (5-(2)))).place);
				for (int j1 = 0; j1 < ((EVal)(yystack.valueAt (5-(4)))).declaredsList.size(); j1++) {
					

      for(int i = 0; i < ((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).size(); i++) {

      		if((symbolTable.symbolsofrecord.get(pplace).lookUp(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place)) != SymbolTable.NOT_IN_SYMBOL_TABLE ) {
      			System.err.println("Error ! symbol has just defiend in symbol table .");
             	  return YYABORT;
         }

       else if(symbolTable.symbolsofrecord.get(pplace).lookUp(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
         
          if(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).initialize != null && ((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).isarray) {
          	
          		

          			  symbolTable.symbolsofrecord.get(pplace).addToSymbolTable(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place, ((EVal)(yystack.valueAt (5-(4)))).types.get(i), true , ((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).arraySize);
          				  for (int j=0 ;j< ((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).arraySize ; j++) {
          				  	emit(":=",((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).initialize.place , null ,((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place+"[" + j+"]");
          		}
          	}
			


          	 else if(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).initialize == null && ((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).isarray) {

          			  symbolTable.symbolsofrecord.get(pplace).addToSymbolTable(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place, ((EVal)(yystack.valueAt (5-(4)))).types.get(i), true , ((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).arraySize);
          	}

          		else if(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).initialize != null && !((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).isarray){

          				
          					symbolTable.symbolsofrecord.get(pplace).addToSymbolTable(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place, ((EVal)(yystack.valueAt (5-(4)))).types.get(i), false , 0);
							emit(":=",((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).initialize.place , null ,((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place);
							

          		}

         		else if(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).initialize == null && !((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).isarray){

          					symbolTable.symbolsofrecord.get(pplace).addToSymbolTable(((EVal)(yystack.valueAt (5-(4)))).declaredsList.get(j1).get(i).place, 2, false , 0);

          		}
         }
		 } 



				}
			};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 282 of "123.y"  */
    {
				System.out.println("rule 5 : varDeclaration -> typeSpecifier varDeclList ; \n");
	for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).declareds.size(); i++) {

      		if((symbolTable.lookUp(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place)) != SymbolTable.NOT_IN_SYMBOL_TABLE ) {
      			System.err.println("Error ! symbol has just defiend in symbol table .");
             	  return YYABORT;
         }

       else  if(symbolTable.lookUp(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
         
          if(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).initialize != null && ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).isarray) {
          	
          		

          			  symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true , ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).arraySize);
          				  for (int j=0 ;j< ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).arraySize ; j++) {
          				  	emit(":=",((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).initialize.place , null ,((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place+"[" + j+"]");
          		 	 }
          	}
			


          	 else if(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).initialize == null && ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).isarray) {

          			  symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true , ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).arraySize);
          	}

          		else if(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).initialize != null && !((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).isarray){

          				
          					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false , 0);
							emit(":=",((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).initialize.place , null ,((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							

          		}

         		else if(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).initialize == null && !((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).isarray){

          					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false , 0);

          		}
         }
		 } 
       	
			};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 328 of "123.y"  */
    {
				System.out.println("rule 6 : scopedVarDeclaration -> scopedTypeSpecifier varDeclList ; \n");
				yyval = new EVal();
			((EVal)yyval).declareds = ((EVal)(yystack.valueAt (3-(2)))).declareds;
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;

				
			};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 336 of "123.y"  */
    {
				System.out.println("rule 7.1 : varDeclList ->  varDeclList , varDeclInitialize \n");			
			if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_UNKNOWN
			|| ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
			yyval = new EVal();
			((EVal)yyval).declareds = ((EVal)(yystack.valueAt (3-(1)))).declareds;
			((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (3-(3)))));
			}
			else {
			System.err.println("Error! Declarator type mismatch.");
			return YYABORT;
		}

			};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 350 of "123.y"  */
    {
						System.out.println("rule 7.2 : varDeclList -> varDeclInitialize \n");
			yyval = new EVal();
		((EVal)yyval).declareds = EVal.makeDeclareds(((EVal)(yystack.valueAt (1-(1)))));
			};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 355 of "123.y"  */
    {
				System.out.println("rule 8.1 : varDeclInitialize -> varDecId \n");
			yyval = new EVal();
			((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
			((EVal)yyval).isarray = ((EVal)(yystack.valueAt (1-(1)))).isarray;
			((EVal)yyval).initialize = null ;
			((EVal)yyval).arraySize = ((EVal)(yystack.valueAt (1-(1)))).arraySize;
			};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 363 of "123.y"  */
    {
				System.out.println("rule 8.2 : varDeclInitialize -> varDecId : simpleExpression \n");
				yyval = new EVal();
			((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
			((EVal)yyval).isarray = ((EVal)(yystack.valueAt (3-(1)))).isarray;
			((EVal)yyval).initialize = ((EVal)(yystack.valueAt (3-(3))));
			((EVal)yyval).arraySize = ((EVal)(yystack.valueAt (3-(1)))).arraySize;
			};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 371 of "123.y"  */
    {
				System.out.println("rule 9.1 : varDecId -> ID \n");
				yyval = new EVal();
				((EVal)yyval).place=((EVal)(yystack.valueAt (1-(1)))).place;
				((EVal)yyval).isarray=false;
			};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 377 of "123.y"  */
    {
				System.out.println("rule 9.2 : varDecId -> ID[NUMCONST] \n");
				yyval = new EVal();
				((EVal)yyval).place=((EVal)(yystack.valueAt (4-(1)))).place;
				((EVal)yyval).isarray=true;
				((EVal)yyval).arraySize=lexInt;
			};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 384 of "123.y"  */
    {
				System.out.println("rule 10.1 : scopedTypeSpecifier -> static typeSpecifier \n");
				yyval = new EVal();
			    ((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
			};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 389 of "123.y"  */
    {
				System.out.println("rule 10.2 : scopedTypeSpecifier -> typeSpecifier \n");
				yyval = new EVal();
			    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
			};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 394 of "123.y"  */
    {
				System.out.println("rule 11.1 : typeSpecifier -> returnTypeSpecifier \n");
				yyval = new EVal();
			    ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
			};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 399 of "123.y"  */
    {
				System.out.println("rule 11.2  : typeSpecifier -> RECTYPE \n");
				yyval = new EVal();
			    ((EVal)yyval).type = 1;
			};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 404 of "123.y"  */
    {
				System.out.println("rule 12.1 : returnTypeSpecifier -> int \n");
				yyval = new EVal();
		        ((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 409 of "123.y"  */
    {
				System.out.println("rule 12.2 : returnTypeSpecifier -> real \n");
				yyval = new EVal();
				((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 414 of "123.y"  */
    {
				System.out.println("rule 12.3 : returnTypeSpecifier -> bool \n");
				yyval = new EVal();
				((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
			};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 419 of "123.y"  */
    {
				System.out.println("rule 12.4 : returnTypeSpecifier -> char \n");
				yyval = new EVal();
				((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
			};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 424 of "123.y"  */
    {
				System.out.println("rule 13.1 : funDeclaration -> typeSpecifier ID ( params ) statement \n");
			};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 427 of "123.y"  */
    {
				System.out.println("rule 13.2 : funDeclaration -> ID (params) statement \n");
			};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 430 of "123.y"  */
    {
				System.out.println("rule 14.1 : params -> paramList \n");
			};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 433 of "123.y"  */
    {
				System.out.println("rule 14.2 : params -> λ \n");
			};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 436 of "123.y"  */
    {
				System.out.println("rule 15.1 : paramList -> paramList ; paramTypeList \n");
			};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 439 of "123.y"  */
    {
				System.out.println("rule 15.2 : paramList -> paramTypeList \n");
			};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 442 of "123.y"  */
    {
				System.out.println("rule 16 : paramTypeList -> typeSpecifier paramIdList \n");
			};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 445 of "123.y"  */
    {
				System.out.println("rule 17.1 : paramIdList -> paramIdList,paramId \n");
			};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 448 of "123.y"  */
    {
				System.out.println("rule 17.2 : paramIdList -> paramId \n");
			};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 451 of "123.y"  */
    {
				System.out.println("rule 18.1 : paramId -> ID \n ");
			};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 454 of "123.y"  */
    {
				System.out.println("rule 18.2 : paramId -> ID [] \n");
			};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 457 of "123.y"  */
    {
				System.out.println("rule 19.1 : statement -> expressionStmt \n");
				yyval = new EVal();
				//((EVal)$$).nextList = $1.nextList;
			};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 462 of "123.y"  */
    {
			yyval = new EVal();
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
				((EVal)yyval).breakList = ((EVal)(yystack.valueAt (1-(1)))).breakList;
				System.out.println("rule 19.2 : statement -> compoundStmt \n");
			};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 468 of "123.y"  */
    {
				System.out.println("rule 19.3 : statement -> selectionStmt \n");
				yyval = new EVal();
					((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
			};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 473 of "123.y"  */
    {
				System.out.println("rule 19.4 : statement -> iterationStmt \n");
				yyval = new EVal();
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
				 ((EVal)yyval).breakList = ((EVal)(yystack.valueAt (1-(1)))).breakList;
			};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 479 of "123.y"  */
    {
				yyval = new EVal();
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
				System.out.println("rule 19.5 : statement -> returnStmt \n");
			};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 484 of "123.y"  */
    {
				System.out.println("rule 19.6 : statement -> breakStmt \n");
				yyval = new EVal();
				
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
				((EVal)yyval).breakList = ((EVal)(yystack.valueAt (1-(1)))).breakList;
			};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 491 of "123.y"  */
    {
    
    yyval = new EVal();
    yyval=((EVal)(yystack.valueAt (2-(1))));
    backpatch(((EVal)yyval).nextList,((EVal)(yystack.valueAt (2-(2)))).quad);
    backpatch(((EVal)yyval).breakList,((EVal)(yystack.valueAt (2-(2)))).quad);
    
    
};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 500 of "123.y"  */
    {
				yyval = new EVal();
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (4-(3)))).nextList;
				((EVal)yyval).breakList = ((EVal)(yystack.valueAt (4-(3)))).breakList;
				System.out.println("rule 20.1 : compoundStmt -> { localDeclarations statementList } \n");
			};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 506 of "123.y"  */
    {
				System.out.println("rule 20.2 : compoundStmt -> { localDeclarations } \n");
				
			};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 510 of "123.y"  */
    {
				yyval = new EVal();
				((EVal)yyval).declaredsList=((EVal)(yystack.valueAt (2-(1)))).declaredsList;
				((EVal)yyval).declaredsList.add(((EVal)(yystack.valueAt (2-(2)))).declareds);
				((EVal)yyval).types=((EVal)(yystack.valueAt (2-(1)))).types;
				((EVal)yyval).types.add(((EVal)(yystack.valueAt (2-(2)))).type);
				
                                
                                System.out.println(((EVal)(yystack.valueAt (2-(2)))).declareds.toString());
				System.out.println("rule 21.1 : localDeclarations -> localDeclarations scopedVarDeclaration \n");
			
		
			};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 523 of "123.y"  */
    {
				System.out.println("rule 21.2 : localDeclarations -> λ \n");
				yyval = new EVal();
					((EVal)yyval).declaredsList = EVal.makedeclerdlist();
			};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 528 of "123.y"  */
    {
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(3)))).nextList;
				backpatch(((EVal)(yystack.valueAt (3-(1)))).nextList, ((EVal)(yystack.valueAt (3-(2)))).quad);
				((EVal)yyval).breakList = EVal.merge(((EVal)(yystack.valueAt (3-(1)))).breakList,((EVal)(yystack.valueAt (3-(3)))).breakList);
				System.out.println("rule 22.1 : statementList -> statementList statement \n");
			};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 534 of "123.y"  */
    {
				yyval = new EVal();
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
				((EVal)yyval).breakList = ((EVal)(yystack.valueAt (1-(1)))).breakList;
				System.out.println("rule 22.2 : statementList -> statement \n");
			};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 541 of "123.y"  */
    {
				System.out.println("rule 23.1 : expressionStmt -> expression ; \n");
			};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 544 of "123.y"  */
    {
				System.out.println("rule 23.2 : expressionStmt -> ; \n");
			};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 547 of "123.y"  */
    {
				System.out.println("rule 24.1 : selectionStmt -> if (simpleExpression)  statement  \n");
				yyval = new EVal();
                backpatch(((EVal)(yystack.valueAt (6-(3)))).trueList, ((EVal)(yystack.valueAt (6-(5)))).quad);
				 
                ((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (6-(3)))).falseList, ((EVal)(yystack.valueAt (6-(6)))).nextList);
			};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 554 of "123.y"  */
    {
				System.out.println("rule 24.2 : selectionStmt -> if (simpleExpression)  statement  else statement \n");
				yyval = new EVal();
                backpatch(((EVal)(yystack.valueAt (9-(3)))).trueList, ((EVal)(yystack.valueAt (9-(5)))).quad);
                backpatch(((EVal)(yystack.valueAt (9-(3)))).falseList, ((EVal)(yystack.valueAt (9-(8)))).quad);      
                ((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(6)))).nextList, ((EVal)(yystack.valueAt (9-(9)))).nextList);
                
			};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 562 of "123.y"  */
    {
				
              yyval = new EVal();
				int place = nextQuad();
				emit("goto",null,null,null);
				backpatch(((EVal)(yystack.valueAt (9-(3)))).nextList,nextQuad());
				for (int i=0 ;i<((EVal)(yystack.valueAt (9-(6)))).trueList.size() ; i++) {
					emit("check",((EVal)(yystack.valueAt (9-(4)))).place+" == "+((EVal)(yystack.valueAt (9-(6)))).declareds.get(i).place,"goto",""+((EVal)(yystack.valueAt (9-(6)))).trueList.get(i));
				}

				backpatch(place,nextQuad());
				backpatch(((EVal)(yystack.valueAt (9-(6)))).breakList,nextQuad());
				//backpatch(((EVal)(yystack.valueAt (9-(7)))).breakList,nextQuad());
				System.out.println("rule 24.3 : selectionStmt -> switch (simpleExpression) caseElement defaultElement end \n");
			};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 577 of "123.y"  */
    {
				yyval = new EVal();
				EVal num  = new EVal();
				num.place = ""+lexInt;
				num.type  = EVal.TYPE_CODE_INTEGER;
				((EVal)yyval).declareds.add(num);
				((EVal)yyval).falseList.add(((EVal)(yystack.valueAt (8-(8)))).quad); 
				((EVal)yyval).trueList.add(((EVal)(yystack.valueAt (8-(5)))).quad); 
				((EVal)yyval).breakList = ((EVal)(yystack.valueAt (8-(6)))).breakList;
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (8-(6)))).nextList;
				System.out.println("rule 25.1 : caseElement -> case NUMCONST : statement ; \n");
			};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 589 of "123.y"  */
    {
				yyval = new EVal();
				EVal num1  = new EVal();
				num1.place = ""+lexInt;
				num1.type  = EVal.TYPE_CODE_INTEGER;
				((EVal)yyval).declareds = ((EVal)(yystack.valueAt (9-(1)))).declareds;
				((EVal)yyval).declareds.add(num1);
				((EVal)yyval).falseList = ((EVal)(yystack.valueAt (9-(1)))).falseList;
				((EVal)yyval).falseList.add(((EVal)(yystack.valueAt (9-(9)))).quad);
				((EVal)yyval).trueList = ((EVal)(yystack.valueAt (9-(1)))).trueList;
				((EVal)yyval).trueList.add(((EVal)(yystack.valueAt (9-(6)))).quad);
				((EVal)yyval).breakList = EVal.merge(((EVal)(yystack.valueAt (9-(1)))).breakList,((EVal)(yystack.valueAt (9-(7)))).breakList);
				((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(1)))).nextList,((EVal)(yystack.valueAt (9-(7)))).nextList);
				System.out.println("rule 25.2 : caseElement -> caseElement case NUMCONST : statement ; \n");
			};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 604 of "123.y"  */
    {
				System.out.println("rule 26.1 : defaultElement -> default : statement ; \n");
			};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 607 of "123.y"  */
    {
				System.out.println("rule 26.2 : defaultElement -> λ \n");
			};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 610 of "123.y"  */
    {
				System.out.println("rule 27 : iterationStmt -> while (simpleExpression) statement \n");
				yyval = new EVal();
				backpatch(((EVal)(yystack.valueAt (7-(7)))).nextList , ((EVal)(yystack.valueAt (7-(3)))).quad);
				backpatch(((EVal)(yystack.valueAt (7-(4)))).trueList, ((EVal)(yystack.valueAt (7-(6)))).quad);
				((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(4)))).falseList;
				emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (7-(3)))).quad));
			};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 618 of "123.y"  */
    {
				System.out.println("rule 28.1 : returnStmt -> return ; \n");
			};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 621 of "123.y"  */
    {
				System.out.println("rule 28.2 : returnStmt -> return statement ; \n");
			};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 624 of "123.y"  */
    {
				System.out.println("rule 29 : breakStmt -> break ; \n");
                                yyval = new EVal();
				((EVal)yyval).breakList = EVal.makeList(nextQuad());
				emit("goto",null,null,null);
			};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 627 of "123.y"  */
    {

				System.out.println("rule 30.1 : expression -> mutable = expression \n");
				if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
		
			((EVal)(yystack.valueAt (3-(1)))).type  = ((EVal)(yystack.valueAt (3-(3)))).type;
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place, null,  ((EVal)(yystack.valueAt (3-(1)))).place);

		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

		
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place,null, tmp);
			
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {

			//$1.place = $3.place;
			((EVal)(yystack.valueAt (3-(3)))).type  =EVal.TYPE_CODE_REAL;
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit(":=", ((EVal)(yystack.valueAt (3-(1)))).place,null, tmp);
		} else {
			System.err.println("Error! Invalid type ");	
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
			
			};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 667 of "123.y"  */
    {
				System.out.println("rule 30.2 : expression -> mutable += expression \n");
				if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			String tmp = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));

		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			
			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else {
			System.err.println("Error! Invalid type ");
			
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));		
			};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 711 of "123.y"  */
    {
				System.out.println("rule 30.3 : expression -> mutable -= expression \n");
				if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			String tmp = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));

		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			
			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else {
			System.err.println("Error! Invalid type" );
			
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
			};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 755 of "123.y"  */
    {
				System.out.println("rule 30.4 : expression -> mutable *= expression \n");
				if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			String tmp = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));

		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			
			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else {
		System.err.println("Error! Invalid type ");
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
		}
			};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 798 of "123.y"  */
    {
				System.out.println("rule 30.5 : expression -> mutable /= expression \n");
				if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			String tmp = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));

		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			((EVal)(yystack.valueAt (3-(1)))).type  =EVal.TYPE_CODE_REAL;
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			
			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			String tmp2 = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, tmp2);
			emit(":=", tmp2 , null ,((EVal)(yystack.valueAt (3-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (3-(1))));
			
		} else {
			System.err.println("Error! Invalid type" );
			
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
			};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 842 of "123.y"  */
    {
				System.out.println("rule 30.6 : expression -> mutable ++ \n");
				if(((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_BOOLEAN){
			
			yyval = new EVal();
			String tmp = newTemp(((EVal)(yystack.valueAt (2-(1)))).type, false);
			emit("+", ((EVal)(yystack.valueAt (2-(1)))).place, "1", tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (2-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (2-(1))));

		} else if(((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_REAL) {
			
			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("+", ((EVal)(yystack.valueAt (2-(1)))).place, "1.0" , tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (2-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (2-(1))));
			
		} else {
			System.err.println("Error! Invalid type");
			
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
			};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 870 of "123.y"  */
    {
				System.out.println("rule 30.7 : expression -> mutable -- \n");
				if(((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_BOOLEAN){
			
			yyval = new EVal();
			String tmp = newTemp(((EVal)(yystack.valueAt (2-(1)))).type, false);
			emit("-", ((EVal)(yystack.valueAt (2-(1)))).place, "1", tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (2-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (2-(1))));

		} else if(((EVal)(yystack.valueAt (2-(1)))).type == EVal.TYPE_CODE_REAL) {
			
			yyval = new EVal();
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("-", ((EVal)(yystack.valueAt (2-(1)))).place, "1.0" , tmp);
			emit(":=", tmp , null ,((EVal)(yystack.valueAt (2-(1)))).place);
			yyval = ((EVal)(yystack.valueAt (2-(1))));
			
		} else {
			System.err.println("Error! Invalid type");
			
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
			};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 898 of "123.y"  */
    {
				System.out.println("rule 30.8 : expression -> simpleExpression \n");
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 902 of "123.y"  */
    {
				System.out.println("rule 31.1 : simpleExpression -> simpleExpression or simpleExpression \n");
				yyval = new EVal();
		
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));
		emit("goto", null, null, String.valueOf(nextQuad() + 1));
			
			};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 926 of "123.y"  */
    {
				System.out.println("rule 31.2 : simpleExpression -> simpleExpression and simpleExpression \n");
					yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2));// result will be backpatched
		emit("goto", null, null, String.valueOf(nextQuad() + 1));// result will be backpatched
		
			};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 947 of "123.y"  */
    {
				System.out.println("rule 31.3 : simpleExpression -> simpleExpression or else simpleExpression \n");
				yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (5-(1)))).falseList, ((EVal)(yystack.valueAt (5-(4)))).quad);
		((EVal)yyval).trueList = EVal.merge(((EVal)(yystack.valueAt (5-(1)))).trueList, ((EVal)(yystack.valueAt (5-(5)))).trueList);
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (5-(5)))).falseList;
				
			};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 957 of "123.y"  */
    {
				System.out.println("rule 31.4 :simpleExpression -> simpleExpression and then simpleExpression \n");
				yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (5-(1)))).trueList, ((EVal)(yystack.valueAt (5-(4)))).quad);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (5-(5)))).trueList;
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (5-(1)))).falseList, ((EVal)(yystack.valueAt (5-(5)))).falseList);
			};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 966 of "123.y"  */
    {
				System.out.println("rule 31.5 : simpleExpression -> not simpleExpression \n");
				yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (2-(2)))).falseList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (2-(2)))).trueList;
			};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 974 of "123.y"  */
    {
				System.out.println("rule 31.6 : simpleExpression -> relexpression \n");	
				yyval = new EVal();
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 979 of "123.y"  */
    {
				System.out.println("rule 32.1 : relExpression -> mathLogicalExpression relop mathLogicalExpression \n");
				
			if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.RELOP_LE)
					{
						yyval = new EVal();
				((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
				((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
				((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
				((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
				emit("<=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
				emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
				emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
					
					}
					
			if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.RELOP_LT)
						{
					
					yyval = new EVal();
					((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
					((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
					((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
					((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
					emit("<", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
					emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
					emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.

					}
					if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.RELOP_GT)
							{

						yyval = new EVal();
						((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
						((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
						((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
						((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

						emit(">", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
						emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
						emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.

						}
					if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.RELOP_GE)
						{
								yyval = new EVal();
							((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
							((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
							((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
							((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
							emit(">=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
							emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
							emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.


					}
					if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.RELOP_EQ)
						{

						yyval = new EVal();
					((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
					((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
					((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
					((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
					emit(":=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
					emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
					emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.

					}

					if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.RELOP_NE)
						{

						yyval = new EVal();
					((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
					((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
					((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
					((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
					emit("<>", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
					emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
					emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched. 
					}  

				
			};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 1064 of "123.y"  */
    {
				System.out.println("rule 32.2 : relExpression -> mathLogicalExpression \n");
				yyval = new EVal();
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 1069 of "123.y"  */
    {
				System.out.println("rule 33.1 : relop -> .le \n");
				yyval = new EVal();			
				((EVal)yyval).type = EVal.RELOP_LE;
			};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 1074 of "123.y"  */
    {
				System.out.println("rule 33.2 : relop -> .lt \n");
				yyval = new EVal();			
				((EVal)yyval).type = EVal.RELOP_LT;
			};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 1079 of "123.y"  */
    {
				System.out.println("rule 33.3 : relop -> .gt \n");
				yyval = new EVal();			
				((EVal)yyval).type = EVal.RELOP_GT;
			};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 1084 of "123.y"  */
    {
				System.out.println("rule 33.4 : relop -> .ge \n");
				yyval = new EVal();			
				((EVal)yyval).type = EVal.RELOP_GE;
			};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 1089 of "123.y"  */
    {
				System.out.println("rule 33.5 : relop -> .eq \n");
				yyval = new EVal();			
				((EVal)yyval).type = EVal.RELOP_EQ;
			};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 1094 of "123.y"  */
    {
				System.out.println("rule 33.6 : relop -> .ne \n");
				yyval = new EVal();			
				((EVal)yyval).type = EVal.RELOP_NE;
			};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 1099 of "123.y"  */
    {
    System.out.println("Rule 34.1 : mathLogicalExpression : mathLogicalExpression + unaryExpression \n");


if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
   && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
   || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
   yyval = new EVal();
   ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
   ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
   emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);

  } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
   && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

   yyval = new EVal();
   ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
   ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
   String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
   emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
   emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);


  } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
   && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
   yyval = new EVal();
   ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
   ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
   String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
   emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
   emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
  } else {
   System.err.println("Error! Invalid type for " + "+" );
   
  }

 
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.


};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 1146 of "123.y"  */
    {
    System.out.println("Rule 34.2 : mathLogicalExpression : mathLogicalExpression - unaryExpression \n");
    
    
    if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
    || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
        ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
        emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
        
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
        emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
        
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
        emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
        System.err.println("Error! Invalid type for " + "-" );
        
    }
	
	((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 1191 of "123.y"  */
    {
	System.out.println("Rule 34.5.new : mathLogicalExpression : mathLogicalExpression  unaryExpression \n");
	 yyval = new EVal();
   ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
   ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;

   	((EVal)yyval).trueList=((EVal)(yystack.valueAt (1-(1)))).trueList;
	((EVal)yyval).falseList=((EVal)(yystack.valueAt (1-(1)))).falseList;
	((EVal)yyval).nextList=((EVal)(yystack.valueAt (1-(1)))).nextList;
};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 1203 of "123.y"  */
    {
    System.out.println("Rule 34.3 : mathLogicalExpression : mathLogicalExpression * unaryExpression \n");
    
    
    if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
    || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
        ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
        emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {

yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
        emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
        
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
        emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
        System.err.println("Error! Invalid type for " + "*" );
        
    }
	
	((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 1247 of "123.y"  */
    {
    System.out.println("Rule 34.4 : mathLogicalExpression : mathLogicalExpression / unaryExpression \n");
    
    
    if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
    || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
        ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
        emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
        
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
        emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
        
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
        emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
        System.err.println("Error! Invalid type for " + "/" );
        
    }
	
	((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 1290 of "123.y"  */
    {
    System.out.println("Rule 34.5 : mathLogicalExpression : mathLogicalExpression % unaryExpression \n");
    
    
    if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
    || (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
        ((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
        emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
    } else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
    && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
        
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
        emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
        emit("%", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
        
        
    } else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
    && (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
        yyval = new EVal();
        ((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
        ((EVal)yyval).type = EVal.TYPE_CODE_REAL;
        String tmp = newTemp(EVal.TYPE_CODE_REAL, false);

emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
        emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
    } else {
        System.err.println("Error! Invalid type for " + "%" );
        
    }
	
	((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 1336 of "123.y"  */
    {
   System.out.println("Rule 34.6 : mathLogicalExpression : unaryExpression \n");
    yyval = new EVal();
   ((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
   ((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;

   	((EVal)yyval).trueList=((EVal)(yystack.valueAt (1-(1)))).trueList;
	((EVal)yyval).falseList=((EVal)(yystack.valueAt (1-(1)))).falseList;
	((EVal)yyval).nextList=((EVal)(yystack.valueAt (1-(1)))).nextList;
   };
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 1347 of "123.y"  */
    {
				System.out.println("rule 36.1 : unaryExpression -> unaryop unaryExpression \n");
				if(((EVal)(yystack.valueAt (2-(1)))).operand.equals("-")){
				yyval = new EVal();
				((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
				((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
				emit("gharine","-" , ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)yyval).place);
		     }
		     else if(((EVal)(yystack.valueAt (2-(1)))).operand.equals("*")){
		     	yyval = new EVal();
				((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (2-(2)))).type, false);
				((EVal)yyval).type = ((EVal)(yystack.valueAt (2-(2)))).type;
				int f = symbolTable.LOOK(((EVal)(yystack.valueAt (2-(2)))).place);
				System.out.println("ddddddddd");
				System.out.println(f);
				emit("pointer", "*", ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)yyval).place);

		     }else if(((EVal)(yystack.valueAt (2-(1)))).operand.equals("?")){
		     	yyval = new EVal();
				((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
				((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
				emit("?", "rand()" , ((EVal)(yystack.valueAt (2-(2)))).place, ((EVal)yyval).place);
		     }

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.


				
			};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 351 of lalr1.java  */
/* Line 1381 of "123.y"  */
    {
				System.out.println("rule 36.2 : unaryExpression -> factor \n");
				yyval = new EVal();
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 351 of lalr1.java  */
/* Line 1386 of "123.y"  */
    {
				System.out.println("rule 37.1 : unaryop -> - \n");
				yyval = new EVal();
				((EVal)yyval).operand = "-";
			};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 351 of lalr1.java  */
/* Line 1391 of "123.y"  */
    {
				System.out.println("rule 37.2 : unaryop -> * \n");
				yyval = new EVal();
				((EVal)yyval).operand = "*";
			};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 351 of lalr1.java  */
/* Line 1396 of "123.y"  */
    {
				System.out.println("rule 37.3 : unaryop -> ? \n");
				yyval = new EVal();
				((EVal)yyval).operand = "?";
			};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 351 of lalr1.java  */
/* Line 1401 of "123.y"  */
    {
				System.out.println("rule 38.1 : factor -> immutable \n");
				yyval = new EVal();
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 351 of lalr1.java  */
/* Line 1406 of "123.y"  */
    {
				System.out.println("rule 38.2 : factor -> mutable \n");
				yyval = new EVal();
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 351 of lalr1.java  */
/* Line 1411 of "123.y"  */
    {
				System.out.println("rule 39.1 : mutable -> ID \n");
			int index = symbolTable.lookUp(((EVal)(yystack.valueAt (1-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + lexId + "\" is not declared.");
			return YYABORT;
		}
		else if (symbolTable.arrays.get(index)) {
                    yyval = new EVal();
                    ((EVal)yyval).isarray = true;
		((EVal)yyval).place = symbolTable.names.get(index);
		((EVal)yyval).type = symbolTable.types.get(index);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
			
		}
		else {
		yyval = new EVal();
		((EVal)yyval).place = symbolTable.names.get(index);
		((EVal)yyval).type = symbolTable.types.get(index);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
		}
			};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 351 of lalr1.java  */
/* Line 1433 of "123.y"  */
    {
				System.out.println("rule 39.2 : mutable -> mutable [ expression ] ");
				if(((EVal)(yystack.valueAt (4-(1)))).isarray){
					if(((EVal)(yystack.valueAt (4-(3)))).isarray){
						System.err.println("Error! invalid argument " );
						return YYABORT;
					}
				yyval = new EVal();
				((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (4-(1)))).type, false);
				((EVal)yyval).type  = ((EVal)(yystack.valueAt (4-(1)))).type;
				((EVal)yyval).isarray = false;
				emit(":=", ((EVal)(yystack.valueAt (4-(1)))).place +"["+((EVal)(yystack.valueAt (4-(3)))).place+"]", null, ((EVal)yyval).place);
				((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); //result will be backpatched.
	
				}
				
			};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 351 of lalr1.java  */
/* Line 1455 of "123.y"  */
    {
				System.out.println("rule 39.3 : mutable -> mutable.ID \n");
				int index = symbolTable.lookUp(((EVal)(yystack.valueAt (3-(1)))).place);
				if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + lexId + "\" is not declared.");
			return YYABORT;
		}
		else if (symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexId + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		int find = 0;
		for(int i = 0; i < symbolTable.symbolsofrecord.get(index).names.size(); i++) {

      		if((symbolTable.symbolsofrecord.get(index).lookUp(((EVal)(yystack.valueAt (3-(3)))).place)) != SymbolTable.NOT_IN_SYMBOL_TABLE ) {
      			find = 1;
				yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place+"."+((EVal)(yystack.valueAt (3-(3)))).place;
		((EVal)yyval).type = symbolTable.symbolsofrecord.get(index).types.get(i);
         }
		 }
		
		if (find == 1){
		
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
		}
		
				
			};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 351 of lalr1.java  */
/* Line 1488 of "123.y"  */
    {
				System.out.println("rule 40.1 : immutable -> (expression) \n");
			yyval = new EVal();
				((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(2)))).type, false);
				((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
				((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(2)))).trueList ;
			((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(2)))).falseList;
			((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;
				emit("()", ((EVal)(yystack.valueAt (3-(2)))).place , null , ((EVal)yyval).place);
				
			};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 351 of lalr1.java  */
/* Line 1499 of "123.y"  */
    {
				System.out.println("rule 40.2 : immutable -> call \n");
			};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 351 of lalr1.java  */
/* Line 1502 of "123.y"  */
    {
				System.out.println("rule 40.3 : immutable -> constant \n");
				yyval = new EVal();
				yyval = ((EVal)(yystack.valueAt (1-(1))));
			};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 351 of lalr1.java  */
/* Line 1507 of "123.y"  */
    {
				System.out.println("rule 41 : call -> ID (args) \n");
			};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 351 of lalr1.java  */
/* Line 1510 of "123.y"  */
    {
				System.out.println("rule 42.1 : args -> argList \n");
			};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 351 of lalr1.java  */
/* Line 1513 of "123.y"  */
    {
				System.out.println("rule 42.2 : args -> λ \n");
			};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 351 of lalr1.java  */
/* Line 1516 of "123.y"  */
    {
				System.out.println("rule 43.1 :  argList -> argList,expression \n");
			};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 351 of lalr1.java  */
/* Line 1519 of "123.y"  */
    {
				System.out.println("rule 43.1 : argList -> expression \n");
			};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 351 of lalr1.java  */
/* Line 1522 of "123.y"  */
    {
				System.out.println("rule 44.1 : constant -> NUMCONST \n");
			};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 351 of lalr1.java  */
/* Line 1525 of "123.y"  */
    {
				System.out.println("rule 44.2 : constant -> REALCONST \n");
			};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 351 of lalr1.java  */
/* Line 1528 of "123.y"  */
    {
				System.out.println("rule 44.3 : constant -> CHARCONST \n");
			};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 351 of lalr1.java  */
/* Line 1531 of "123.y"  */
    {
				System.out.println("rule 44.4 : constant -> BOOLCONST \n");
			};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 351 of lalr1.java  */
/* Line 1535 of "123.y"  */
    {
		
		yyval = new EVal();
		((EVal)yyval).place = lexId;
	};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 351 of lalr1.java  */
/* Line 1542 of "123.y"  */
    {
		
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

	};
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 351 of lalr1.java  */
/* Line 1557 of "123.y"  */
    {
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		emit(":=", String.valueOf(lexReal), null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 116:
  if (yyn == 116)
    
/* Line 351 of lalr1.java  */
/* Line 1570 of "123.y"  */
    {

		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 117:
  if (yyn == 117)
    
/* Line 351 of lalr1.java  */
/* Line 1585 of "123.y"  */
    {
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		if(lexBoolean)
			emit(":=", "1", null, ((EVal)yyval).place);
		else
			emit(":=", "0", null, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 118:
  if (yyn == 118)
    
/* Line 351 of lalr1.java  */
/* Line 1601 of "123.y"  */
    {
		yyval = new EVal();
		((EVal)yyval).quad = nextQuad();
		System.out.println(nextQuad());
	};
  break;
    

  case 119:
  if (yyn == 119)
    
/* Line 351 of lalr1.java  */
/* Line 1607 of "123.y"  */
    {
		yyval = new EVal();
		((EVal)yyval).quad = nextQuad();
	};
  break;
    



/* Line 351 of lalr1.java  */
/* Line 2722 of "123.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -50;
  private static final short yypact_[] =
  {
        34,   -32,   -50,   -50,   -50,   -50,   -50,    22,    34,   -50,
     -50,   -50,   -32,   -50,   -50,    -1,    19,   -50,   -50,   -17,
     -50,    29,   -26,    39,   -50,   -50,   -32,   290,     9,    39,
     -32,    35,    57,   -50,   -50,    46,   -50,    51,   290,   290,
     -50,   -50,   -50,   -50,   -50,   -50,   -50,    14,   -50,    54,
      64,   -50,   297,   -50,    24,   -50,   -50,   -50,    63,   -50,
     -50,   -50,   -50,    66,    65,    74,   -50,    85,   243,    39,
      39,   -50,   -50,   -32,   -50,   -50,    83,    14,   314,   111,
     101,   -50,   -50,   -50,   -50,   -50,   -50,   297,   297,   297,
     297,   297,   297,   -50,   290,   -32,   290,   -50,   243,   -32,
      90,    92,    93,    95,   269,   102,   -50,   -50,   -50,   -50,
     -50,   -50,   -50,   -50,   -50,   -50,   105,   -50,   -50,   -12,
     -50,   290,   290,   290,   290,   290,   -50,   -50,   -50,   290,
     -50,   290,    64,    64,    21,   -50,   -50,   -50,    97,   -50,
     -50,   100,   106,   -50,   -50,   -50,   290,   290,   -50,   -50,
     113,   -50,   195,   -50,   -50,   -50,   -50,   -50,   -50,   -50,
     -50,   290,   125,   290,   -50,   -50,   -50,   290,   -14,    14,
     290,   -50,   -50,   -50,   116,   -24,   -50,   -50,   -50,   -50,
     115,     6,   -50,   243,   243,   133,   -50,   -50,   144,   -50,
      69,   243,   -50,     9,   126,   -50,   145,   -50,   243,   130,
     243,     9,   -50,   -50,   -50,   135,   132,   -50,   243,   -50,
     -50,   136,   243,   -50,   138,   -50,   -50,   -50
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,    24,    23,    22,    21,   113,     0,     2,     4,
       7,     5,     0,    19,     6,    20,     0,     1,     3,     0,
      12,    13,    15,    28,    46,     9,     0,     0,     0,    28,
       0,     0,    27,    30,    20,     0,    11,    15,     0,     0,
      93,    94,    95,   115,   114,   117,   116,    14,    75,    77,
      86,    90,     0,    92,    97,    96,   102,   103,    98,   109,
     110,   111,   112,     0,     0,    31,    33,    34,     0,     0,
       0,     8,    45,     0,    18,    74,     0,    69,    97,   118,
     118,    78,    79,    81,    80,    82,    83,     0,     0,     0,
       0,     0,     0,    91,     0,     0,   106,    16,     0,     0,
       0,     0,     0,     0,     0,     0,    46,    50,   118,    26,
      37,    36,    38,    39,    40,    41,     0,    29,    17,     0,
     101,     0,     0,     0,     0,     0,    67,    68,   118,     0,
     118,     0,    84,    85,    76,    87,    88,    89,     0,   100,
     108,     0,   105,    25,    32,    35,     0,     0,   118,    59,
       0,    61,     0,    42,    49,    10,    62,    63,    64,    65,
      66,     0,    70,     0,    71,    99,   104,     0,     0,   119,
       0,    60,    44,    48,   118,    98,    72,    73,   107,   118,
       0,     0,    43,     0,     0,     0,   118,    47,    51,   118,
      57,     0,   118,     0,     0,   118,     0,    58,     0,     0,
       0,     0,   118,    52,   118,     0,     0,    53,     0,    56,
     118,     0,     0,   118,     0,    54,   118,    55
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -50,   -50,   -50,   162,   -50,   -50,   -50,    99,   149,   -50,
     -50,     3,   -50,   -50,   147,   -50,   109,   -50,    80,   -50,
     -49,   -50,    75,   -50,   -50,   -50,   -50,   -50,   -50,   -50,
     -50,    -7,   -20,   -50,   -50,    91,     7,   -35,   -50,   -50,
     -23,   -50,   -50,   -50,   -50,   -50,     1,   -28,   -50,   -50,
     -50,   -18,   -50
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     7,     8,     9,    10,    11,    72,    19,    20,    21,
      73,    30,    13,    14,    31,    32,    33,    65,    66,   108,
     109,   110,    35,   174,   111,   112,   190,   196,   113,   114,
     115,   116,    77,    48,    89,    49,    50,    51,    52,    53,
      78,    55,    56,   141,   142,    57,    58,    59,    60,    61,
      62,   129,   180
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -21;
  private static final short
  yytable_[] =
  {
        63,    15,    16,    12,    54,    79,    80,    47,    28,    15,
      29,    12,    96,    22,    25,    54,    26,    93,    75,   155,
       6,    26,    17,   179,    34,    79,    80,    37,   -20,    54,
      34,    67,    76,    79,    80,    23,    34,     1,    74,     2,
       3,     4,     5,   186,     2,     3,     4,     5,    24,   143,
      70,     2,     3,     4,     5,   135,   136,   137,    94,    87,
      88,    27,   131,    44,    54,    54,    54,    54,    54,    54,
      34,    34,    68,   118,    37,    95,    71,    81,    82,    83,
      84,    85,    86,   194,   195,    28,     6,   138,    69,   140,
     153,     6,    87,    88,   132,   133,   139,   150,     6,    96,
      67,    97,    98,   173,    90,    91,    54,    99,    54,   162,
     161,   164,   163,    92,   156,   157,   158,   159,   160,   100,
     120,   128,   130,    54,    54,   145,   168,   169,   146,   147,
     170,   148,   165,   151,   187,   188,   154,   166,    54,   167,
      54,   176,   197,   177,   171,    80,   182,    54,   189,   203,
     181,   205,   185,   175,   192,    74,   183,   202,   200,   211,
     178,   184,   204,   214,   210,   199,   209,   213,   191,   216,
      18,   193,   119,   206,   198,    36,    64,   201,   117,   144,
     134,   152,     0,     0,   207,     0,   208,     0,     0,     0,
       0,     0,   212,     0,     0,   215,     0,     0,   217,    70,
       2,     3,     4,     5,   101,     0,   102,     0,     0,     0,
       0,   103,   104,   105,     0,     0,     0,    38,     0,     0,
       0,     0,     0,     0,   106,   172,   107,     0,     0,     0,
       0,    39,     0,     0,    40,    41,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    42,     0,     6,    43,    44,
      45,    46,   101,     0,   102,     0,     0,     0,     0,   103,
     104,   105,     0,     0,     0,    38,     0,     0,     0,     0,
       0,     0,   106,     0,   107,     0,     0,     0,     0,    39,
       0,     0,    40,    41,     0,     0,     0,     0,     0,     0,
       0,    38,     0,    42,     0,     6,    43,    44,    45,    46,
     149,     0,     0,     0,     0,    39,     0,     0,    40,    41,
       0,     0,    38,     0,     0,     0,     0,     0,     0,    42,
       0,     6,    43,    44,    45,    46,    39,     0,     0,    40,
      41,     0,     0,    39,     0,     0,    40,    41,     0,     0,
      42,     0,     6,    43,    44,    45,    46,    42,    94,     6,
      43,    44,    45,    46,     0,     0,   121,   122,   123,   124,
     125,   126,   127,     0,     0,    95
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        28,     0,     1,     0,    27,    19,    20,    27,    34,     8,
      36,     8,    36,    12,    31,    38,    33,    52,    38,    31,
      52,    33,     0,    37,    23,    19,    20,    26,    52,    52,
      29,    30,    39,    19,    20,    36,    35,     3,    35,     5,
       6,     7,     8,    37,     5,     6,     7,     8,    29,    98,
       4,     5,     6,     7,     8,    90,    91,    92,    34,    38,
      39,    32,    80,    54,    87,    88,    89,    90,    91,    92,
      69,    70,    37,    70,    73,    51,    30,    23,    24,    25,
      26,    27,    28,    14,    15,    34,    52,    94,    31,    96,
     108,    52,    38,    39,    87,    88,    95,   104,    52,    36,
      99,    35,    37,   152,    40,    41,   129,    33,   131,   129,
     128,   131,   130,    49,   121,   122,   123,   124,   125,    34,
      37,    10,    21,   146,   147,    35,   146,   147,    36,    36,
     148,    36,    35,    31,   183,   184,    31,    37,   161,    33,
     163,   161,   191,   163,    31,    20,    30,   170,    15,   198,
     170,   200,    37,   152,    10,   152,   174,    12,    32,   208,
     167,   179,    32,   212,    32,   193,    31,    31,   186,    31,
       8,   189,    73,   201,   192,    26,    29,   195,    69,    99,
      89,   106,    -1,    -1,   202,    -1,   204,    -1,    -1,    -1,
      -1,    -1,   210,    -1,    -1,   213,    -1,    -1,   216,     4,
       5,     6,     7,     8,     9,    -1,    11,    -1,    -1,    -1,
      -1,    16,    17,    18,    -1,    -1,    -1,    22,    -1,    -1,
      -1,    -1,    -1,    -1,    29,    30,    31,    -1,    -1,    -1,
      -1,    36,    -1,    -1,    39,    40,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    50,    -1,    52,    53,    54,
      55,    56,     9,    -1,    11,    -1,    -1,    -1,    -1,    16,
      17,    18,    -1,    -1,    -1,    22,    -1,    -1,    -1,    -1,
      -1,    -1,    29,    -1,    31,    -1,    -1,    -1,    -1,    36,
      -1,    -1,    39,    40,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    22,    -1,    50,    -1,    52,    53,    54,    55,    56,
      31,    -1,    -1,    -1,    -1,    36,    -1,    -1,    39,    40,
      -1,    -1,    22,    -1,    -1,    -1,    -1,    -1,    -1,    50,
      -1,    52,    53,    54,    55,    56,    36,    -1,    -1,    39,
      40,    -1,    -1,    36,    -1,    -1,    39,    40,    -1,    -1,
      50,    -1,    52,    53,    54,    55,    56,    50,    34,    52,
      53,    54,    55,    56,    -1,    -1,    42,    43,    44,    45,
      46,    47,    48,    -1,    -1,    51
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,     3,     5,     6,     7,     8,    52,    61,    62,    63,
      64,    65,    71,    72,    73,   106,   106,     0,    63,    67,
      68,    69,   106,    36,    29,    31,    33,    32,    34,    36,
      71,    74,    75,    76,   106,    82,    68,   106,    22,    36,
      39,    40,    50,    53,    54,    55,    56,    92,    93,    95,
      96,    97,    98,    99,   100,   101,   102,   105,   106,   107,
     108,   109,   110,   107,    74,    77,    78,   106,    37,    31,
       4,    30,    66,    70,    71,    92,    91,    92,   100,    19,
      20,    23,    24,    25,    26,    27,    28,    38,    39,    94,
      40,    41,    49,    97,    34,    51,    36,    35,    37,    33,
      34,     9,    11,    16,    17,    18,    29,    31,    79,    80,
      81,    84,    85,    88,    89,    90,    91,    76,    71,    67,
      37,    42,    43,    44,    45,    46,    47,    48,    10,   111,
      21,   111,    96,    96,    95,    97,    97,    97,    91,   106,
      91,   103,   104,    80,    78,    35,    36,    36,    36,    31,
      91,    31,    82,   111,    31,    31,    91,    91,    91,    91,
      91,   111,    92,   111,    92,    35,    37,    33,    92,    92,
     111,    31,    30,    80,    83,   106,    92,    92,    91,    37,
     112,    92,    30,   111,   111,    37,    37,    80,    80,    15,
      86,   111,    10,   111,    14,    15,    87,    80,   111,   107,
      32,   111,    12,    80,    32,    80,   107,   111,   111,    31,
      32,    80,   111,    31,    80,   111,    31,   111
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    60,    61,    62,    62,    63,    63,    63,    64,    65,
      66,    67,    67,    68,    68,    69,    69,    70,    70,    71,
      71,    72,    72,    72,    72,    73,    73,    74,    74,    75,
      75,    76,    77,    77,    78,    78,    79,    79,    79,    79,
      79,    79,    80,    81,    81,    82,    82,    83,    83,    84,
      84,    85,    85,    85,    86,    86,    87,    87,    88,    89,
      89,    90,    91,    91,    91,    91,    91,    91,    91,    91,
      92,    92,    92,    92,    92,    92,    93,    93,    94,    94,
      94,    94,    94,    94,    95,    95,    95,    96,    96,    96,
      96,    97,    97,    98,    98,    98,    99,    99,   100,   100,
     100,   101,   101,   101,   102,   103,   103,   104,   104,   105,
     105,   105,   105,   106,   107,   108,   109,   110,   111,   112
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     1,     1,     1,     5,     3,
       3,     3,     1,     1,     3,     1,     4,     2,     1,     1,
       1,     1,     1,     1,     1,     6,     5,     1,     0,     3,
       1,     2,     3,     1,     1,     3,     1,     1,     1,     1,
       1,     1,     2,     4,     3,     2,     0,     3,     1,     2,
       1,     6,     9,     9,     8,     9,     4,     0,     7,     2,
       3,     2,     3,     3,     3,     3,     3,     2,     2,     1,
       4,     4,     5,     5,     2,     1,     3,     1,     1,     1,
       1,     1,     1,     1,     3,     3,     1,     3,     3,     3,
       1,     2,     1,     1,     1,     1,     1,     1,     1,     4,
       3,     3,     1,     1,     4,     1,     0,     3,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     0,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "RECORD_KW", "STATIC_KW", "CHAR_KW",
  "BOOLEAN_KW", "REAL_KW", "INTEGER_KW", "IF_KW", "ELSE_KW", "SWITCH_KW",
  "END_KW", "COMMENTS", "DEFAULT_KW", "CASE_KW", "WHILE_KW", "RETURN_KW",
  "BREAK_KW", "OR_KW", "AND_KW", "THEN_KW", "NOT_KW", "LE_KW", "LT_KW",
  "GE_KW", "GT_KW", "EQ_KW", "NE_KW", "LCB_KW", "RCB_KW", "SEMICOLON_KW",
  "COLON_KW", "COMMA_KW", "LB_KW", "RB_KW", "LP_KW", "RP_KW", "ADD_KW",
  "SUB_KW", "MUL_KW", "DIV_KW", "ASSIGN", "ADDEQ_KW", "SUBEQ_KW",
  "MULEQ_KW", "DIVEQ_KW", "PLUSPLUS_KW", "MINESMINES_KW", "MOD_KW",
  "QUESTION_KW", "DOT_KW", "ID", "REALCONST", "NUMCONST", "BOOLCONST",
  "CHARCONST", "p", "AND_THEN", "OR_ELSE", "$accept", "program",
  "declarationList", "declaration", "recDeclaration", "varDeclaration",
  "scopedVarDeclaration", "varDeclList", "varDeclInitialize", "varDecId",
  "scopedTypeSpecifier", "typeSpecifier", "returnTypeSpecifier",
  "funDeclaration", "params", "paramList", "paramTypeList", "paramIdList",
  "paramId", "statement1", "statement", "compoundStmt",
  "localDeclarations", "statementList", "expressionStmt", "selectionStmt",
  "caseElement", "defaultElement", "iterationStmt", "returnStmt",
  "breakStmt", "expression", "simpleExpression", "relExpression", "relop",
  "mathLogicalExpression", "term", "unaryExpression", "unaryop", "factor",
  "mutable", "immutable", "call", "args", "argList", "constant", "id",
  "save_num", "save_real", "save_char", "save_bool", "M", "N", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        61,     0,    -1,    62,    -1,    62,    63,    -1,    63,    -1,
      65,    -1,    73,    -1,    64,    -1,     3,   106,    29,    82,
      30,    -1,    71,    67,    31,    -1,    70,    67,    31,    -1,
      67,    33,    68,    -1,    68,    -1,    69,    -1,    69,    32,
      92,    -1,   106,    -1,   106,    34,   107,    35,    -1,     4,
      71,    -1,    71,    -1,    72,    -1,   106,    -1,     8,    -1,
       7,    -1,     6,    -1,     5,    -1,    71,   106,    36,    74,
      37,    80,    -1,   106,    36,    74,    37,    80,    -1,    75,
      -1,    -1,    75,    31,    76,    -1,    76,    -1,    71,    77,
      -1,    77,    33,    78,    -1,    78,    -1,   106,    -1,   106,
      34,    35,    -1,    84,    -1,    81,    -1,    85,    -1,    88,
      -1,    89,    -1,    90,    -1,    79,   111,    -1,    29,    82,
      83,    30,    -1,    29,    82,    30,    -1,    82,    66,    -1,
      -1,    83,   111,    80,    -1,    80,    -1,    91,    31,    -1,
      31,    -1,     9,    36,    92,    37,   111,    80,    -1,     9,
      36,    92,    37,   111,    80,    10,   111,    80,    -1,    11,
      36,    92,   112,    37,    86,    87,    12,   111,    -1,    15,
     111,   107,    32,   111,    80,    31,   111,    -1,    86,    15,
     111,   107,    32,   111,    80,    31,   111,    -1,    14,    32,
      80,    31,    -1,    -1,    16,    36,   111,    92,    37,   111,
      80,    -1,    17,    31,    -1,    17,    91,    31,    -1,    18,
      31,    -1,   100,    42,    91,    -1,   100,    43,    91,    -1,
     100,    44,    91,    -1,   100,    45,    91,    -1,   100,    46,
      91,    -1,   100,    47,    -1,   100,    48,    -1,    92,    -1,
      92,    19,   111,    92,    -1,    92,    20,   111,    92,    -1,
      92,    19,    10,   111,    92,    -1,    92,    20,    21,   111,
      92,    -1,    22,    92,    -1,    93,    -1,    95,    94,    95,
      -1,    95,    -1,    23,    -1,    24,    -1,    26,    -1,    25,
      -1,    27,    -1,    28,    -1,    95,    38,    96,    -1,    95,
      39,    96,    -1,    96,    -1,    96,    40,    97,    -1,    96,
      41,    97,    -1,    96,    49,    97,    -1,    97,    -1,    98,
      97,    -1,    99,    -1,    39,    -1,    40,    -1,    50,    -1,
     101,    -1,   100,    -1,   106,    -1,   100,    34,    91,    35,
      -1,   100,    51,   106,    -1,    36,    91,    37,    -1,   102,
      -1,   105,    -1,   106,    36,   103,    37,    -1,   104,    -1,
      -1,   104,    33,    91,    -1,    91,    -1,   107,    -1,   108,
      -1,   109,    -1,   110,    -1,    52,    -1,    54,    -1,    53,
      -1,    56,    -1,    55,    -1,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    12,    14,    16,    22,
      26,    30,    34,    36,    38,    42,    44,    49,    52,    54,
      56,    58,    60,    62,    64,    66,    73,    79,    81,    82,
      86,    88,    91,    95,    97,    99,   103,   105,   107,   109,
     111,   113,   115,   118,   123,   127,   130,   131,   135,   137,
     140,   142,   149,   159,   169,   178,   188,   193,   194,   202,
     205,   209,   212,   216,   220,   224,   228,   232,   235,   238,
     240,   245,   250,   256,   262,   265,   267,   271,   273,   275,
     277,   279,   281,   283,   285,   289,   293,   295,   299,   303,
     307,   309,   312,   314,   316,   318,   320,   322,   324,   326,
     331,   335,   339,   341,   343,   348,   350,   351,   355,   357,
     359,   361,   363,   365,   367,   369,   371,   373,   375,   376
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   207,   207,   213,   216,   219,   222,   225,   228,   282,
     328,   336,   350,   355,   363,   371,   377,   384,   389,   394,
     399,   404,   409,   414,   419,   424,   427,   430,   433,   436,
     439,   442,   445,   448,   451,   454,   457,   462,   468,   473,
     479,   484,   491,   500,   506,   510,   523,   528,   534,   541,
     544,   547,   554,   562,   577,   589,   604,   607,   610,   618,
     621,   624,   627,   667,   711,   755,   798,   842,   870,   898,
     902,   926,   947,   957,   966,   974,   979,  1064,  1069,  1074,
    1079,  1084,  1089,  1094,  1099,  1146,  1191,  1203,  1247,  1290,
    1336,  1347,  1381,  1386,  1391,  1396,  1401,  1406,  1411,  1433,
    1455,  1488,  1499,  1502,  1507,  1510,  1513,  1516,  1519,  1522,
    1525,  1528,  1531,  1535,  1542,  1557,  1570,  1585,  1601,  1607
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 365;
  private static final int yynnts_ = 53;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 17;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 60;

  private static final int yyuser_token_number_max_ = 314;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 21 of "123.y"  */

    
	public static final String TYPE_STRING_INTEGER = "int";
	public static final String TYPE_STRING_REAL = "double";
	public static final String TYPE_STRING_CHAR = "char";
	public static final String TYPE_STRING_BOOLEAN = "int";
	
	private static final String tempStr = "Temp";
	

	
	public static String lexId;
	public static int lexInt;
	public static double lexReal;
	public static boolean lexBoolean;
	public static char lexChar;
	// quadruple and symboltable
	
	private ArrayList<Quadruple> quadruples = new ArrayList<>();
	private SymbolTable symbolTable = new SymbolTable();
	//
	private int tempCounter = 0;
	public String fileAddress;
	
	static PrintStream writer;
    public static void main(String args[]) throws IOException, FileNotFoundException {
        phase2 mainclass;
        final Yylex lexer;
String inputCode = "test.txt";
        String outputCode = "compiler.c";
        String output = "output.txt";

        if (args.length == 1) {
            inputCode = args[0];
            outputCode = args[0] + ".c";
            output = args[0] + ".txt";
        }
        if (args.length == 2) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[0] + ".txt";
        }
        if (args.length == 3) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[2];
        }

        writer = new PrintStream(new File(output));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(inputCode)));

       mainclass = new phase2(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {
                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error: " + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error! " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        mainclass.fileAddress = outputCode;
        mainclass.parse();

        return;
}
	private void emit(String operation, String arg0, String arg1, String result) {
		quadruples.add(new Quadruple(operation, arg0, arg1, result));
	}
	
	private void backpatch(ArrayList<Integer> list, int quadNumber) {
		for (int i = 0; i < list.size(); i++)
			quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
	}
	private void backpatch(int quadNumber, int destination) {
		quadruples.get(quadNumber).result = String.valueOf(destination);
	}
	private String newTemp(int type, boolean array) {
		String name = tempStr + tempCounter++;
		symbolTable.addToSymbolTable(name, type, array,1);
		return name;
	}

	private int nextQuad() {
		return quadruples.size();
	}
		
		private String getTypeString(int typeCode){
		switch(typeCode){
			case EVal.TYPE_CODE_INTEGER:
				return TYPE_STRING_INTEGER;
			case EVal.TYPE_CODE_REAL:
				return TYPE_STRING_REAL;
			case EVal.TYPE_CODE_CHAR:
				return TYPE_STRING_CHAR;
			case EVal.TYPE_CODE_BOOLEAN:
				return TYPE_STRING_BOOLEAN;
				case EVal.TYPE_CODE_UNKNOWN:
			default:
				return null;
		}
		}
		private void exportIntermediateCode() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileAddress));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\t// ////////////////// Symbol Table \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t// ////////////////// Quadruples \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \\\\\n\n");
			// Backpatch of error controllers.
			//backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
			//backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
			for (int i = 0; i < quadruples.size() && i < 100; i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			for (int i = 100; i < quadruples.size(); i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			// Normal Finish
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

			// Array index out of bound error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

			// Invalid array size error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

			dos.writeBytes("}\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	


/* Line 927 of lalr1.java  */
/* Line 3732 of "123.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 1612 of "123.y"  */

// Classes
// // EVal
class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	public static final int RELOP_LE = 4;
	public static final int RELOP_LT = 5;
	public static final int RELOP_GT = 6;
	public static final int RELOP_GE = 7;
	public static final int RELOP_EQ = 8;
	public static final int RELOP_NE = 9;
	
	public String place;
	public int type;
	public boolean isarray;
	public int arraySize;
	public int quad;
	public String operand;
	public boolean isbool;
	public String op ;
	public ArrayList<Integer> nextList = new ArrayList<Integer>();
	public ArrayList<Integer> trueList = new ArrayList<Integer>();
	public ArrayList<Integer> falseList = new ArrayList<Integer>();
	public ArrayList<Integer> breakList = new ArrayList<Integer>();
	 public ArrayList<Integer> types = new ArrayList<Integer>();
	public ArrayList<EVal> declareds = new ArrayList<EVal>();
	public ArrayList<ArrayList<EVal>>  declaredsList = new ArrayList<ArrayList<EVal>>();

	public EVal initialize ;

	public EVal() {
		this.type=TYPE_CODE_UNKNOWN;
		
	}

	public static ArrayList<Integer> makeList(int number) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(number);
		return result;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(al1);
		result.addAll(al2);
		return result;
	}

	

	public static ArrayList<EVal> makeDeclareds(EVal initializerOrdDeclared) {
		ArrayList<EVal> result = new ArrayList<>();
		result.add(initializerOrdDeclared);
		return result;
	}
	public static ArrayList<ArrayList<EVal>> makedeclerdlist() {
		ArrayList<ArrayList<EVal>> result = new ArrayList<>();
		return result;
	}
	


}

// Quadruple

class Quadruple {

	public static final String LINE_STR = "Line";
	public String operation;
	public String arg0;
	public String arg1;
	public String result;

	public Quadruple(String operation, String arg0, String arg1, String result) {
		this.operation = operation;
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.result = result;
	}

	@Override
	public String toString() {
		switch(operation.toLowerCase()){
			case "goto":
				return operation + " " + LINE_STR + result + ";";
			case "check":
				return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
			case "LT_KW":
			case "LE_KW":
			case "GT_KW":
			case "GE_KW":
			case "ADD_KW":
			case "SUB_KW":
			case "MUL_KW":
			case "DIV_KW":
			case "MOD_KW":
			case "ADDEQ_KW":
				case "SUBEQ_KW":
				case "DIVEQ_KW":
				case "MULEQ_KW":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			case "EQ_KW":
				return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
				case "ASSIGN":
				return result + " = " + arg0 + ";";
				case ":=":
				return result + " = " + arg0 + ";";
				case "cast":
				return result + " = (" + arg1 + ") " + arg0 + ";";
				case "gharine":
				return result + " =" + arg0 + arg1 + ";";
				case "pointer":
				return result + " =" + arg0 + arg1 + ";";
				case "?":
				return result + " =" + "rand() %" + arg1 + ";";
				case "+":
			case "-":
			case "*":
			case "/":
			case "%":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			default:
				return null;
		}
	}
}

// Symbol Table
class SymbolTable {

	public static final int NOT_IN_SYMBOL_TABLE = -1;

	public ArrayList<String> names;
	public ArrayList<Integer> types;
	public ArrayList<Boolean> arrays;
	public ArrayList<Integer> sizes;
	public ArrayList<SymbolTable> symbolsofrecord;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
		sizes = new ArrayList<>();
		symbolsofrecord = new ArrayList<>();
		
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}
	
	public int LOOK(String name)
	 {
		int k = names.indexOf(name);
		return sizes.get(k);
	}

	public boolean addToSymbolTable(String name, int type, boolean array ,int size) {
		if (lookUp(name) == -1) {
			names.add(name);
			types.add(type);
			arrays.add(array);
			sizes.add(size);
			symbolsofrecord.add(new SymbolTable());
			return true;
		}
		return false;
	}

	@Override
    public String toString() {
        if(names.size() == 0)
            return null;
        String res = "";
        for(int i = 0; i < names.size(); i++) {
            switch (types.get(i)) {
                case EVal.TYPE_CODE_INTEGER:
                    res += "\t" + phase2.TYPE_STRING_INTEGER;
                    break;
                case EVal.TYPE_CODE_REAL:
                    res += "\t" + phase2.TYPE_STRING_REAL;
                    break;
                case EVal.TYPE_CODE_CHAR:
                    res += "\t" + phase2.TYPE_STRING_CHAR;
                    break;
                case EVal.TYPE_CODE_BOOLEAN:
                    res += "\t" + phase2.TYPE_STRING_BOOLEAN;
                    break;
					 case 110:
                    res += "\t" + "struct";
                    break;
            }
            res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
        }
        return res;
	}

}
