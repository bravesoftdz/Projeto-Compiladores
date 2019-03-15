/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class AConstCmd extends PCmd
{
    private PUnalt _unalt_;
    private PExp _exp_;

    public AConstCmd()
    {
        // Constructor
    }

    public AConstCmd(
        @SuppressWarnings("hiding") PUnalt _unalt_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setUnalt(_unalt_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AConstCmd(
            cloneNode(this._unalt_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstCmd(this);
    }

    public PUnalt getUnalt()
    {
        return this._unalt_;
    }

    public void setUnalt(PUnalt node)
    {
        if(this._unalt_ != null)
        {
            this._unalt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unalt_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unalt_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unalt_ == child)
        {
            this._unalt_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unalt_ == oldChild)
        {
            setUnalt((PUnalt) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
