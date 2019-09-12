import java.util.HashMap;

public class AddVisitor extends FunctionsBaseVisitor<Integer> {
	
	private HashMap<String, String> dec = new HashMap<String, String>();
	
    @Override
    public Integer visitRoot(SummerParser.RootContext ctx)
    {
        Integer val = visit(ctx.expr(0)) + visit(ctx.expr(1));
        System.out.println(ctx.ADD().getText() + val);
        return 0;
    }
    @Override
    public Integer visitExprSum(SummerParser.ExprSumContext ctx)
    {
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
    }
    @Override
    public Integer visitExprNum(SummerParser.ExprNumContext ctx)
    {
        return Integer.valueOf(ctx.NUM().getText());
    }
    
    public Integer visitParenID(FunctionParser.ParenIdContext ctx) {
    	String type = dec.get(ctx.ID().getText());
    	if(type != null && type.equals("VAR")) {
    		return dec.get(ctx.ID().getText());
    	}else if (type == null)
    		//ERRO não foi declarado
    	else
    		//ERRO Bad use
    }
    
    public void visitDecVar(FunctionParser.DecVarContext ctx) {
    	if(dec.get(ctx.ID().getText()) == null)
    		dec.compute(ctx.arq1, "VAR");
    	//ERRO já foi declarado
    	
    }
    
    public String visitFunc(FunctionParser.FuncContext ctx) {
    	String type = dec.get(ctx.ID().getText());
    	if(type != null && type.equals("FUNC")) {
    		return dec.get(ctx.ID().getText());
    	}else if (type == null)
    		//ERRO não foi declarado
    	else
    		//ERRO bad use
    }
    
    public Integer visitDecFunc(FunctionParser.FuncContext ctx) {
    	
    	i
    }
}
