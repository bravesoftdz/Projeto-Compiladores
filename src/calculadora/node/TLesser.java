/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class TLesser extends Token
{
    public TLesser()
    {
        super.setText("<");
    }

    public TLesser(int line, int pos)
    {
        super.setText("<");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLesser(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLesser(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLesser text.");
    }
}