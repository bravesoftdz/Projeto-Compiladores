/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import java.util.*;
import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class AVarIdposVar extends PVar
{
    private final LinkedList<PAddPos> _addPos_ = new LinkedList<PAddPos>();

    public AVarIdposVar()
    {
        // Constructor
    }

    public AVarIdposVar(
        @SuppressWarnings("hiding") List<?> _addPos_)
    {
        // Constructor
        setAddPos(_addPos_);

    }

    @Override
    public Object clone()
    {
        return new AVarIdposVar(
            cloneList(this._addPos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarIdposVar(this);
    }

    public LinkedList<PAddPos> getAddPos()
    {
        return this._addPos_;
    }

    public void setAddPos(List<?> list)
    {
        for(PAddPos e : this._addPos_)
        {
            e.parent(null);
        }
        this._addPos_.clear();

        for(Object obj_e : list)
        {
            PAddPos e = (PAddPos) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._addPos_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._addPos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._addPos_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PAddPos> i = this._addPos_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAddPos) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
