import java.util.HashMap;

public class FuncVisitor extends FunctionsBaseVisitor<Integer> {

	private HashMap<String, String> dec = new HashMap<String, String>();

    @Override
     public Integer visitRoot(FunctionsParser.RootContext ctx)
     {
    	System.out.println("Testando como percorrer isso");
//    	visit(ctx.decVar(0));
        return 0;
     }
    // @Override
    // public Integer visitExprSum(FuncionParser.ExprSumContext ctx)
    // {
    //     return visit(ctx.expr(0)) + visit(ctx.expr(1));
    // }
    // @Override
    // public Integer visitExprNum(SummerParser.ExprNumContext ctx)
    // {
    //     return Integer.valueOf(ctx.NUM().getText());
    // }

		//ctx.ID()- pegar contexto de ID, pra navegar na árvore, getText pega valor do contexto
		//o que mais importa é printar as coisas

    public Integer visitParenID(FunctionsParser.ParenIDContext ctx) {
//    	String type = dec.get(ctx.ID().getText());
//    	if(type != null && type.equals("VAR")) {
//    		// return dec.get(ctx.ID().getText());
//    	}else if (type == null){
//			//ERRO não foi declarado
//			System.out.println("Symbol undeclared: " + ctx.ID().getText());
//		}else{
//			//ERRO Bad use
//			System.out.println("Bad used symbol: " + ctx.ID().getText());
//		}
		return 0;
    }

    public Integer visitDecVar(FunctionsParser.DecVarContext ctx) {
//    	if(dec.get(ctx.ID().getText()) == null) {
//    		dec.put(ctx.arq1, "VAR");
//    		System.out.println("Symbol already declared: " + ctx.ID().getText());
//    	}else {
//    	//ERRO já foi declarado
//    		System.out.println("Symbol already declared: " + ctx.ID().getText());
//    	}
    	System.out.println("No visit decvar teste");
		return 0;
    }

    public Integer visitFunction(FunctionsParser.FuncContext ctx) {
//    	String type = dec.get(ctx.ID().getText());
//    	if(type != null && type.equals("FUNC")) {
//    		return dec.get(ctx.ID().getText());
//    	}else if (type == null){
//			//ERRO não foi declarado
//			System.out.println("Symbol undeclared: " + ctx.ID().getText());
//		}else{
//			//ERRO bad use
//			System.out.println("Bad used symbol: " + ctx.ID().getText());
//
//		}

		return 0;

    }

    // public Integer visitDecFunc(FunctionParser.FuncContext ctx) {
    //
    // }
}
