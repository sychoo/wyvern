/* Generated By:JJTree: Do not edit this line. ASTPortDecl.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wyvern.tools.parsing.coreparser.arch;

public
class ASTPortDecl extends SimpleNode {
  public ASTPortDecl(int id) {
    super(id);
  }

  public ASTPortDecl(ArchParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ArchParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8103444d4a579c37283fc481f4a3775b (do not edit this line) */
