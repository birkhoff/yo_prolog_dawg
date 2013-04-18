/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPAst().apply(this);
        outStart(node);
    }

    public void inAStartSingleAst(AStartSingleAst node)
    {
        defaultIn(node);
    }

    public void outAStartSingleAst(AStartSingleAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStartSingleAst(AStartSingleAst node)
    {
        inAStartSingleAst(node);
        if(node.getAst() != null)
        {
            node.getAst().apply(this);
        }
        outAStartSingleAst(node);
    }

    public void inAStartAst(AStartAst node)
    {
        defaultIn(node);
    }

    public void outAStartAst(AStartAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStartAst(AStartAst node)
    {
        inAStartAst(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAStartAst(node);
    }

    public void inADocAst(ADocAst node)
    {
        defaultIn(node);
    }

    public void outADocAst(ADocAst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADocAst(ADocAst node)
    {
        inADocAst(node);
        {
            List<TString> copy = new ArrayList<TString>(node.getDes());
            Collections.reverse(copy);
            for(TString e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDat() != null)
        {
            node.getDat().apply(this);
        }
        if(node.getAut() != null)
        {
            node.getAut().apply(this);
        }
        outADocAst(node);
    }
}
