/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.parser;

import calculadora.node.*;
import calculadora.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 0;
    }

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 1;
    }

    @Override
    public void caseTSymbol(@SuppressWarnings("unused") TSymbol node)
    {
        this.index = 2;
    }

    @Override
    public void caseTVector(@SuppressWarnings("unused") TVector node)
    {
        this.index = 3;
    }

    @Override
    public void caseTCode(@SuppressWarnings("unused") TCode node)
    {
        this.index = 4;
    }

    @Override
    public void caseTStart(@SuppressWarnings("unused") TStart node)
    {
        this.index = 5;
    }

    @Override
    public void caseTFinish(@SuppressWarnings("unused") TFinish node)
    {
        this.index = 6;
    }

    @Override
    public void caseTUnalterable(@SuppressWarnings("unused") TUnalterable node)
    {
        this.index = 7;
    }

    @Override
    public void caseTIn(@SuppressWarnings("unused") TIn node)
    {
        this.index = 8;
    }

    @Override
    public void caseTCase(@SuppressWarnings("unused") TCase node)
    {
        this.index = 9;
    }

    @Override
    public void caseTThat(@SuppressWarnings("unused") TThat node)
    {
        this.index = 10;
    }

    @Override
    public void caseTDo(@SuppressWarnings("unused") TDo node)
    {
        this.index = 11;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 12;
    }

    @Override
    public void caseTAs(@SuppressWarnings("unused") TAs node)
    {
        this.index = 13;
    }

    @Override
    public void caseTLong(@SuppressWarnings("unused") TLong node)
    {
        this.index = 14;
    }

    @Override
    public void caseTConsidering(@SuppressWarnings("unused") TConsidering node)
    {
        this.index = 15;
    }

    @Override
    public void caseTFrom(@SuppressWarnings("unused") TFrom node)
    {
        this.index = 16;
    }

    @Override
    public void caseTTo(@SuppressWarnings("unused") TTo node)
    {
        this.index = 17;
    }

    @Override
    public void caseTBy(@SuppressWarnings("unused") TBy node)
    {
        this.index = 18;
    }

    @Override
    public void caseTCapture(@SuppressWarnings("unused") TCapture node)
    {
        this.index = 19;
    }

    @Override
    public void caseTShow(@SuppressWarnings("unused") TShow node)
    {
        this.index = 20;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 21;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 22;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 23;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 24;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 25;
    }

    @Override
    public void caseTRecebe(@SuppressWarnings("unused") TRecebe node)
    {
        this.index = 26;
    }

    @Override
    public void caseTRecebeConst(@SuppressWarnings("unused") TRecebeConst node)
    {
        this.index = 27;
    }

    @Override
    public void caseTGreater(@SuppressWarnings("unused") TGreater node)
    {
        this.index = 28;
    }

    @Override
    public void caseTLesser(@SuppressWarnings("unused") TLesser node)
    {
        this.index = 29;
    }

    @Override
    public void caseTNot(@SuppressWarnings("unused") TNot node)
    {
        this.index = 30;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 31;
    }

    @Override
    public void caseTOr(@SuppressWarnings("unused") TOr node)
    {
        this.index = 32;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 33;
    }

    @Override
    public void caseTTwoequal(@SuppressWarnings("unused") TTwoequal node)
    {
        this.index = 34;
    }

    @Override
    public void caseTGoe(@SuppressWarnings("unused") TGoe node)
    {
        this.index = 35;
    }

    @Override
    public void caseTLoe(@SuppressWarnings("unused") TLoe node)
    {
        this.index = 36;
    }

    @Override
    public void caseTDiff(@SuppressWarnings("unused") TDiff node)
    {
        this.index = 37;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 38;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 39;
    }

    @Override
    public void caseTLCom(@SuppressWarnings("unused") TLCom node)
    {
        this.index = 40;
    }

    @Override
    public void caseTRCom(@SuppressWarnings("unused") TRCom node)
    {
        this.index = 41;
    }

    @Override
    public void caseTLCol(@SuppressWarnings("unused") TLCol node)
    {
        this.index = 42;
    }

    @Override
    public void caseTRCol(@SuppressWarnings("unused") TRCol node)
    {
        this.index = 43;
    }

    @Override
    public void caseTPpv(@SuppressWarnings("unused") TPpv node)
    {
        this.index = 44;
    }

    @Override
    public void caseTVir(@SuppressWarnings("unused") TVir node)
    {
        this.index = 45;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 46;
    }

    @Override
    public void caseTChar(@SuppressWarnings("unused") TChar node)
    {
        this.index = 47;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 48;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 49;
    }

    @Override
    public void caseTFloat(@SuppressWarnings("unused") TFloat node)
    {
        this.index = 50;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 51;
    }
}
