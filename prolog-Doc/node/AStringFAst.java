/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AStringFAst extends PAst
{
    private TDocSingleString _docSingleString_;

    public AStringFAst()
    {
        // Constructor
    }

    public AStringFAst(
        @SuppressWarnings("hiding") TDocSingleString _docSingleString_)
    {
        // Constructor
        setDocSingleString(_docSingleString_);

    }

    @Override
    public Object clone()
    {
        return new AStringFAst(
            cloneNode(this._docSingleString_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringFAst(this);
    }

    public TDocSingleString getDocSingleString()
    {
        return this._docSingleString_;
    }

    public void setDocSingleString(TDocSingleString node)
    {
        if(this._docSingleString_ != null)
        {
            this._docSingleString_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._docSingleString_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._docSingleString_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._docSingleString_ == child)
        {
            this._docSingleString_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._docSingleString_ == oldChild)
        {
            setDocSingleString((TDocSingleString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
