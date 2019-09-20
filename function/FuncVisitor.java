import java.util.HashMap;

public class FuncVisitor extends FunctionsBaseVisitor<Integer> {

	private HashMap<String, String> dec = new HashMap<String, String>(); //guarda função e quantidade de parametros
	private HashMap<String, String> var = new HashMap<String, String>(); // guarda variáveis
	private HashMap<String, String> param = new HashMap<String, String>(); // guarda parametros da função, para verificar se as variáveis estão no escopo dela

//    @Override
//     public Integer visitRoot(FunctionsParser.RootContext ctx)
//     {
//    	System.out.println("Testando como percorrer isso");
////    	visit(ctx.decVar(0));
//        return 0;
//     }
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
    	String type = dec.get(ctx.ID().getText());
    	if(type != null && type.equals("VAR")) {
    		 dec.get(ctx.ID().getText());
    	}else if (type == null){
			//ERRO não foi declarado
			System.out.println("Symbol undeclared: " + ctx.ID().getText());
			}else{
				//ERRO Bad use
				System.out.println("Bad used symbol: " + ctx.ID().getText());
			}
			return 0;
    }

    @Override
    public Integer visitDecVar(FunctionsParser.DecVarContext ctx) {
    	if(var.get(ctx.ID().getText()) == null) {
    		var.put(ctx.ID().getText(), "VAR");
    		System.out.println("Symbol already declared: " + ctx.ID().getText());
    	}else {
    	//ERRO já foi declarado
    		System.out.println("Symbol already declared: " + ctx.ID().getText());
    	}
    	System.out.println("No visit decvar teste2" + var.toString());
			return 0;
    }

		public Integer visitDecFunc(FunctionsParser.DecFuncContext ctx){
			int n = visit(ctx.paramIds()); //guardar funções no hash com quantidade de parametros
			dec.put(ctx.ID().getText(), n);
			System.out.println("vetor parametros" + param.toString());
		}

		public Integer visitParamIds(FunctionsParser.ParamIdsContext ctx){
			System.out.println("visitou paramIds");
			return visit(ctx.paramIds(0)) + visit(ctx.paramIds(1));
		}

		public Integer visitParamId(FunctionsParser.ParamIdContext ctx){
			param.put(ctx.ID().getText(), "PARAM");
			System.out.println("visitou paramId");
			return 1;
		}

    public Integer visitFunction(FunctionsParser.FuncContext ctx) {
    // 	String type = dec.get(ctx.ID().getText());
    // 	if(type != null && type.equals("FUNC")) {
    // 		dec.get(ctx.ID().getText());
    // 	}else if (type == null){
		// 	//ERRO não foi declarado
		// 	System.out.println("Symbol undeclared: " + ctx.ID().getText());
		// }else{
		// 	//ERRO bad use
		// 	System.out.println("Bad used symbol: " + ctx.ID().getText());
    //
		// }

		return 0;

    }

    public Integer visitExprSoma(FunctionsParser.ExprSomaContext ctx){ return visit.children(); } //visit children vai descer na árvore visitando os filhos
}
