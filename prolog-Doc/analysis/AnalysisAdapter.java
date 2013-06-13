/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStartAst(AStartAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADocAst(ADocAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEntriesAst(AEntriesAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAuthorAst(AAuthorAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADateAst(ADateAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADescrAst(ADescrAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALabelAst(ALabelAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtDocAst(AAtDocAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringAAst(AStringAAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringBAst(AStringBAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringCAst(AStringCAst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocDescr(TDocDescr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocDate(TDocDate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocAuthor(TDocAuthor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocAtdoc(TDocAtdoc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocIdentifier(TDocIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringDocString(TStringDocString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringDocStar(TStringDocStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringStarStar(TStringStarStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringStarString(TStringStarString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocEnd(TDocEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammNoSlash(TProgrammNoSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammComment(TProgrammComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProrgrammSlash(TProrgrammSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammSingleTicks(TProgrammSingleTicks node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammDoubleTicks(TProgrammDoubleTicks node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammSlashSlash(TProgrammSlashSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammToStar(TProgrammToStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammSlashAny(TProgrammSlashAny node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammStarAny(TProgrammStarAny node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDocStart(TDocStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentNoStar(TCommentNoStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentStar(TCommentStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentStarStar(TCommentStarStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentStarNoSlash(TCommentStarNoSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentStarSlash(TCommentStarSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammSingleString(TProgrammSingleString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammSingleStringEnd(TProgrammSingleStringEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammDoubleString(TProgrammDoubleString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgrammDoubleStringEnd(TProgrammDoubleStringEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
