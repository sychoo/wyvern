/* Generated By:JJTree: Do not edit this line. ASTConnectorDecls.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wyvern.tools.parsing.coreparser.arch;

public
class ASTConnectorDecls extends SimpleNode {
  public ASTConnectorDecls(int id) {
    super(id);
  }

  public ASTConnectorDecls(ArchParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ArchParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=98e4b82ab6669cd57ab06cd64ae3c65e (do not edit this line) */
