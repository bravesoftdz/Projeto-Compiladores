/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import java.util.*;
import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class ATipoDeclaracao extends PDeclaracao
{
    private PTipo _tipo_;
    private final LinkedList<PMultiId> _multiId_ = new LinkedList<PMultiId>();
    private TId _id_;

    public ATipoDeclaracao()
    {
        // Constructor
    }

    public ATipoDeclaracao(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") List<?> _multiId_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setTipo(_tipo_);

        setMultiId(_multiId_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new ATipoDeclaracao(
            cloneNode(this._tipo_),
            cloneList(this._multiId_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoDeclaracao(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public LinkedList<PMultiId> getMultiId()
    {
        return this._multiId_;
    }

    public void setMultiId(List<?> list)
    {
        for(PMultiId e : this._multiId_)
        {
            e.parent(null);
        }
        this._multiId_.clear();

        for(Object obj_e : list)
        {
            PMultiId e = (PMultiId) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._multiId_.add(e);
        }
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._multiId_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._multiId_.remove(child))
        {
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        for(ListIterator<PMultiId> i = this._multiId_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMultiId) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
