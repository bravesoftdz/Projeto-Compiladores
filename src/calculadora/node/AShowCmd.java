/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import java.util.*;
import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class AShowCmd extends PCmd
{
    private final LinkedList<PMultiExp> _multiExp_ = new LinkedList<PMultiExp>();
    private PExp _exp_;

    public AShowCmd()
    {
        // Constructor
    }

    public AShowCmd(
        @SuppressWarnings("hiding") List<?> _multiExp_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setMultiExp(_multiExp_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AShowCmd(
            cloneList(this._multiExp_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShowCmd(this);
    }

    public LinkedList<PMultiExp> getMultiExp()
    {
        return this._multiExp_;
    }

    public void setMultiExp(List<?> list)
    {
        for(PMultiExp e : this._multiExp_)
        {
            e.parent(null);
        }
        this._multiExp_.clear();

        for(Object obj_e : list)
        {
            PMultiExp e = (PMultiExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._multiExp_.add(e);
        }
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
            + toString(this._multiExp_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiExp_.remove(child))
        {
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
        for(ListIterator<PMultiExp> i = this._multiExp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMultiExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}