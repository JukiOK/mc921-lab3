import java.util.ArrayList;
import java.util.HashMap;

public class FuncVisitor extends FunctionsBaseVisitor<Integer> {

	private HashMap<String, Integer> funcs = new HashMap<String, Integer>(); //guarda função e quantidade de parametros
	private ArrayList<String> var = new ArrayList<String>(); // guarda variáveis
	private ArrayList<String> param = new ArrayList<String>(); // guarda parametros da função, para verificar se as variáveis estão no escopo dela

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

//    public Integer visitParenID(FunctionsParser.ParenIDContext ctx) {
////    	String type = dec.get(ctx.ID().getText());
////    	if(type != null && type.equals("VAR")) {
////    		 dec.get(ctx.ID().getText());
////    	}else if (type == null){
////			//ERRO não foi declarado
////			System.out.println("Symbol undeclared: " + ctx.ID().getText());
////		}else{
////			//ERRO Bad use
////			System.out.println("Bad used symbol: " + ctx.ID().getText());
////		}
//		return 0;
//    }

    @Override
    public Integer visitDecVar(FunctionsParser.DecVarContext ctx) {
    	if(!var.contains(ctx.ID().getText())) {
    		var.add(ctx.ID().getText());
    	}else {
    	//ERRO já foi declarado
    		System.out.println("Symbol already declared: " + ctx.ID().getText());
    	}
    	System.out.println("No visit decvar teste2: " + var.toString());
		return 0;
    }

	public Integer visitDecFunc(FunctionsParser.DecFuncContext ctx){
		param.clear();
		int n = visit(ctx.ids()); //guardar funções no hash com quantidade de parametros
		funcs.put(ctx.ID().getText(), n);
		visit(ctx.expr());
		return 0;
	}

	public Integer visitParamIds(FunctionsParser.ParamIdsContext ctx){
		System.out.println("visitou paramIds");
		return visit(ctx.ids(0)) + visit(ctx.ids(1));
	}

	public Integer visitParamId(FunctionsParser.ParamIdContext ctx){
		param.add(ctx.ID().getText());
		System.out.println("visitou paramId");
		return 1;
	}

    public Integer visitFunction(FunctionsParser.FunctionContext ctx) {
     	if(var.contains(ctx.ID().getText())) {
		 	//ERRO bad use
		 	System.out.println("Bad used symbol: " + ctx.ID().getText());
     	}else if (funcs.get(ctx.ID().getText()) == null){
		 	//ERRO não foi declarado
		 	System.out.println("Symbol undeclared: " + ctx.ID().getText());
     	}
     	
     	int n = visit(ctx.values());
     	
     	System.out.println("argumentos: " + n);
     	
     	if(n != funcs.get(ctx.ID().getText())) {
     		//ERRO numero de argumentos errado
     		System.out.println("numero de argumentos errado");
     	}
     	
		return 0;

    }
    

    public Integer visitExprSoma(FunctionsParser.ExprSomaContext ctx){ 
        System.out.println("Passou em: visitExprSoma");
    	visit(ctx.expr());
    	visit(ctx.muldiv());
    	return 0;
    } //visit children vai descer na árvore visitando os filhos

	public Integer visitExprSub(FunctionsParser.ExprSubContext ctx){ 
        System.out.println("Passou em: visitExprSub");
		visit(ctx.expr());
    	visit(ctx.muldiv());
    	return 0;
	} //visit children vai descer na árvore visitando os filhos

	public Integer visitExprMuldiv(FunctionsParser.ExprMuldivContext ctx){ 
        System.out.println("Passou em: visitExprMuldiv");
		return visit(ctx.muldiv()); 
	} //visit children vai descer na árvore visitando os filhos

	public Integer visitMuldivMul(FunctionsParser.MuldivMulContext ctx){
        System.out.println("Passou em: visitMuldivMul");
		visit(ctx.muldiv());
    	visit(ctx.paren());
    	return 0;
	} //visit children vai descer na árvore visitando os filhos

	public Integer visitMuldivDiv(FunctionsParser.MuldivDivContext ctx){
        System.out.println("Passou em: visitMuldivDiv");
        visit(ctx.muldiv());
    	visit(ctx.paren());
    	return 0;
	} //visit children vai descer na árvore visitando os filhos

	public Integer visitMuldivParen(FunctionsParser.MuldivParenContext ctx){
        System.out.println("Passou em: visitMuldivParen");
		return visit(ctx.paren()); 
	} //visit children vai descer na árvore visitando os filhos

	public Integer visitParenID(FunctionsParser.ParenIDContext ctx){
		System.out.println("parenid");
		if(!param.contains(ctx.ID().getText()) && !var.contains(ctx.ID().getText())){ //Se não tem id no parametro local, erro não foi declarado
			System.out.println("Symbol undeclared: " + ctx.ID().getText());
		}
		
		return 0;
	}
	
	public Integer visitParenFunc(FunctionsParser.ParenFuncContext ctx) {
		return visit(ctx.func());
	}
	
	public Integer visitArgvNum(FunctionsParser.ArgvNumContext ctx) {
		return 1;
	}
	
	public Integer visitArgvId(FunctionsParser.ArgvIdContext ctx) {
		String id = ctx.ID().getText();
		if(!param.contains(id) && !var.contains(id)) {
			//ERRO argumento inválido
			System.out.println("Argumento inválido");
		}
		return 1;
	}
	
	public Integer visitArgvFunc(FunctionsParser.ArgvFuncContext ctx) {
		return visit(ctx.values(0)) + visit(ctx.values(1));
	}

//		public Integer visit
}
