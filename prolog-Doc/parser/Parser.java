/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import lexer.*;
import node.*;
import analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    @SuppressWarnings({"unchecked","unused"})
    private void push(int numstate, ArrayList<Object> listNode) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list);
                    }
		    break;
                case REDUCE:
                    switch(this.action[1])
                    {
                    case 0: /* reduce AAstartstart1Start */
		    {
			ArrayList<Object> list = new0();
			push(goTo(0), list);
		    }
		    break;
                    case 1: /* reduce AAstartstart2Start */
		    {
			ArrayList<Object> list = new1();
			push(goTo(0), list);
		    }
		    break;
                    case 2: /* reduce ADocDocs */
		    {
			ArrayList<Object> list = new2();
			push(goTo(1), list);
		    }
		    break;
                    case 3: /* reduce AAoptionalrulesdoc1Doc */
		    {
			ArrayList<Object> list = new3();
			push(goTo(2), list);
		    }
		    break;
                    case 4: /* reduce AAoptionalrulesdoc2Doc */
		    {
			ArrayList<Object> list = new4();
			push(goTo(2), list);
		    }
		    break;
                    case 5: /* reduce AEntriesDoc */
		    {
			ArrayList<Object> list = new5();
			push(goTo(2), list);
		    }
		    break;
                    case 6: /* reduce AAuthorEntries */
		    {
			ArrayList<Object> list = new6();
			push(goTo(3), list);
		    }
		    break;
                    case 7: /* reduce ADateEntries */
		    {
			ArrayList<Object> list = new7();
			push(goTo(3), list);
		    }
		    break;
                    case 8: /* reduce ADescrEntries */
		    {
			ArrayList<Object> list = new8();
			push(goTo(3), list);
		    }
		    break;
                    case 9: /* reduce AAtdocEntries */
		    {
			ArrayList<Object> list = new9();
			push(goTo(3), list);
		    }
		    break;
                    case 10: /* reduce AAuthorAuthor */
		    {
			ArrayList<Object> list = new10();
			push(goTo(4), list);
		    }
		    break;
                    case 11: /* reduce ADateDate */
		    {
			ArrayList<Object> list = new11();
			push(goTo(5), list);
		    }
		    break;
                    case 12: /* reduce ADescrDescr */
		    {
			ArrayList<Object> list = new12();
			push(goTo(6), list);
		    }
		    break;
                    case 13: /* reduce ASimpleString */
		    {
			ArrayList<Object> list = new13();
			push(goTo(7), list);
		    }
		    break;
                    case 14: /* reduce AStarString */
		    {
			ArrayList<Object> list = new14();
			push(goTo(7), list);
		    }
		    break;
                    case 15: /* reduce AAfterStarString */
		    {
			ArrayList<Object> list = new15();
			push(goTo(7), list);
		    }
		    break;
                    case 16: /* reduce ATerminal$Docs */
		    {
			ArrayList<Object> list = new16();
			push(goTo(8), list);
		    }
		    break;
                    case 17: /* reduce ANonTerminal$Docs */
		    {
			ArrayList<Object> list = new17();
			push(goTo(8), list);
		    }
		    break;
                    case 18: /* reduce ATerminal$Entries */
		    {
			ArrayList<Object> list = new18();
			push(goTo(9), list);
		    }
		    break;
                    case 19: /* reduce ANonTerminal$Entries */
		    {
			ArrayList<Object> list = new19();
			push(goTo(9), list);
		    }
		    break;
                    case 20: /* reduce ATerminal$String */
		    {
			ArrayList<Object> list = new20();
			push(goTo(10), list);
		    }
		    break;
                    case 21: /* reduce ANonTerminal$String */
		    {
			ArrayList<Object> list = new21();
			push(goTo(10), list);
		    }
		    break;
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PAst node1 = (PAst) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce AAstartstart1Start */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        }

        pastNode1 = new AStartAst(listNode2);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce AAstartstart2Start */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList1.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pastNode1 = new AStartAst(listNode3);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce ADocDocs */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList2.get(0);
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce AAoptionalrulesdoc1Doc */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        }

        pastNode1 = new AEntriesAst(listNode2);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce AAoptionalrulesdoc2Doc */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList1.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pastNode1 = new AEntriesAst(listNode3);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce AEntriesDoc */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList1.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pastNode1 = new AEntriesAst(listNode3);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce AAuthorEntries */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList1.get(0);
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce ADateEntries */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList1.get(0);
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new8() /* reduce ADescrEntries */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList1.get(0);
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new9() /* reduce AAtdocEntries */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        TDocAtdoc tdocatdocNode2;
        LinkedList<Object> listNode4 = new LinkedList<Object>();
        tdocatdocNode2 = (TDocAtdoc)nodeArrayList1.get(0);
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        listNode3 = (LinkedList)nodeArrayList2.get(0);
	if(listNode3 != null)
	{
	  listNode4.addAll(listNode3);
	}
        }

        pastNode1 = new AAtDocAst(tdocatdocNode2, listNode4);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new10() /* reduce AAuthorAuthor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList2.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pastNode1 = new AAuthorAst(listNode3);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new11() /* reduce ADateDate */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList2.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pastNode1 = new ADateAst(listNode3);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new12() /* reduce ADescrDescr */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList2.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pastNode1 = new ADescrAst(listNode3);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new13() /* reduce ASimpleString */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        TStringDocString tstringdocstringNode2;
        tstringdocstringNode2 = (TStringDocString)nodeArrayList1.get(0);

        pastNode1 = new AStringAAst(tstringdocstringNode2);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new14() /* reduce AStarString */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        TStringDocStar tstringdocstarNode2;
        tstringdocstarNode2 = (TStringDocStar)nodeArrayList1.get(0);

        pastNode1 = new AStringBAst(tstringdocstarNode2);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new15() /* reduce AAfterStarString */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PAst pastNode1;
        {
            // Block
        TStringStarString tstringstarstringNode2;
        tstringstarstringNode2 = (TStringStarString)nodeArrayList1.get(0);

        pastNode1 = new AStringCAst(tstringstarstringNode2);
        }
	nodeList.add(pastNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new16() /* reduce ATerminal$Docs */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList1.get(0);
	if(pastNode1 != null)
	{
	  listNode2.add(pastNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new17() /* reduce ANonTerminal$Docs */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode1 = new LinkedList<Object>();
        PAst pastNode2;
        listNode1 = (LinkedList)nodeArrayList1.get(0);
        pastNode2 = (PAst)nodeArrayList2.get(0);
	if(listNode1 != null)
	{
	  listNode3.addAll(listNode1);
	}
	if(pastNode2 != null)
	{
	  listNode3.add(pastNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new18() /* reduce ATerminal$Entries */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList1.get(0);
	if(pastNode1 != null)
	{
	  listNode2.add(pastNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new19() /* reduce ANonTerminal$Entries */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode1 = new LinkedList<Object>();
        PAst pastNode2;
        listNode1 = (LinkedList)nodeArrayList1.get(0);
        pastNode2 = (PAst)nodeArrayList2.get(0);
	if(listNode1 != null)
	{
	  listNode3.addAll(listNode1);
	}
	if(pastNode2 != null)
	{
	  listNode3.add(pastNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new20() /* reduce ATerminal$String */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        PAst pastNode1;
        pastNode1 = (PAst)nodeArrayList1.get(0);
	if(pastNode1 != null)
	{
	  listNode2.add(pastNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new21() /* reduce ANonTerminal$String */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode1 = new LinkedList<Object>();
        PAst pastNode2;
        listNode1 = (LinkedList)nodeArrayList1.get(0);
        pastNode2 = (PAst)nodeArrayList2.get(0);
	if(listNode1 != null)
	{
	  listNode3.addAll(listNode1);
	}
	if(pastNode2 != null)
	{
	  listNode3.add(pastNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, REDUCE, 0}, {9, SHIFT, 1}, },
			{{-1, REDUCE, 3}, {0, SHIFT, 5}, {1, SHIFT, 6}, {2, SHIFT, 7}, {3, SHIFT, 8}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, ERROR, 2}, {10, ACCEPT, -1}, },
			{{-1, REDUCE, 16}, },
			{{-1, REDUCE, 1}, {9, SHIFT, 1}, },
			{{-1, ERROR, 5}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, ERROR, 6}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, ERROR, 7}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, ERROR, 8}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, REDUCE, 13}, },
			{{-1, REDUCE, 14}, },
			{{-1, REDUCE, 15}, },
			{{-1, ERROR, 12}, {8, SHIFT, 25}, },
			{{-1, REDUCE, 18}, },
			{{-1, REDUCE, 6}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 8}, },
			{{-1, REDUCE, 20}, },
			{{-1, REDUCE, 4}, {0, SHIFT, 5}, {1, SHIFT, 6}, {2, SHIFT, 7}, {3, SHIFT, 8}, },
			{{-1, REDUCE, 5}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, REDUCE, 17}, },
			{{-1, REDUCE, 12}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, REDUCE, 11}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, REDUCE, 10}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, REDUCE, 9}, {5, SHIFT, 9}, {6, SHIFT, 10}, {7, SHIFT, 11}, },
			{{-1, REDUCE, 2}, },
			{{-1, REDUCE, 19}, },
			{{-1, REDUCE, 21}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 2}, },
			{{-1, 3}, {4, 20}, },
			{{-1, 12}, },
			{{-1, 13}, {18, 26}, },
			{{-1, 14}, },
			{{-1, 15}, },
			{{-1, 16}, },
			{{-1, 17}, {19, 27}, {21, 27}, {22, 27}, {23, 27}, {24, 27}, },
			{{-1, 4}, },
			{{-1, 18}, },
			{{-1, 19}, {5, 21}, {6, 22}, {7, 23}, {8, 24}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: doc start, EOF",
			"expecting: doc descr, doc date, doc author, doc atdoc, string doc string, string doc star, string star string, doc end",
			"expecting: EOF",
			"expecting: string doc string, string doc star, string star string",
			"expecting: doc end",
			"expecting: doc descr, doc date, doc author, doc atdoc, doc end",
			"expecting: string doc string, string doc star, string star string, doc end",
        };*/
    private static int[] errors;
/*      {
			0, 1, 2, 0, 0, 3, 3, 3, 3, 1, 1, 1, 4, 5, 5, 5, 5, 1, 5, 6, 0, 1, 1, 1, 1, 0, 5, 1, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}
