/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class TCode extends Token
{
    public TCode()
    {
        super.setText("code");
    }

    public TCode(int line, int pos)
    {
        super.setText("code");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCode(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCode(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCode text.");
    }
}
