/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AStartSingleAst extends PAst
{
    private PAst _ast_;

    public AStartSingleAst()
    {
        // Constructor
    }

    public AStartSingleAst(
        @SuppressWarnings("hiding") PAst _ast_)
    {
        // Constructor
        setAst(_ast_);

    }

    @Override
    public Object clone()
    {
        return new AStartSingleAst(
            cloneNode(this._ast_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStartSingleAst(this);
    }

    public PAst getAst()
    {
        return this._ast_;
    }

    public void setAst(PAst node)
    {
        if(this._ast_ != null)
        {
            this._ast_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ast_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ast_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ast_ == child)
        {
            this._ast_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ast_ == oldChild)
        {
            setAst((PAst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
