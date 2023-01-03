package AST;

public class AST_CFIELD_LIST extends AST_LIST {

    /* DATA MEMBERS */
    public AST_CFIELD head;
    public AST_CFIELD_LIST tail;

    /* CONSTRUCTOR(S) */
    public AST_CFIELD_LIST(AST_CFIELD head, AST_CFIELD_LIST tail) {
        SerialNumber = AST_Node_Serial_Number.getFresh();

        if (tail != null) System.out.print("cFieldList -> cfield cFieldList\n");
        if (tail == null) System.out.print("cFieldList -> cfield\n");

        this.head = head;
        this.tail = tail;
    }

    /*  printing message for a cFIELD list AST node */
    public void PrintMe() {
        /*System.out.print("AST_CFIELD_LIST\n");*/

        /* print entire list */
        if (head != null) head.PrintMe();
        if (tail != null) tail.PrintMe();

        /**********************************/
        /* PRINT to AST GRAPHVIZ DOT file */
        /**********************************/
        AST_GRAPHVIZ.getInstance().logNode(SerialNumber, "CFIELD LIST");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (head != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, head.SerialNumber);
        if (tail != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, tail.SerialNumber);
    }

    @Override
    public AST_CFIELD getHead() {
        return this.head;
    }

    @Override
    public AST_CFIELD_LIST getTail() {
        return this.tail;
    }

}
