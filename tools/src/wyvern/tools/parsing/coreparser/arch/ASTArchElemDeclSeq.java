/* Generated By:JJTree: Do not edit this line. ASTArchElemDeclSeq.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wyvern.tools.parsing.coreparser.arch;

public
class ASTArchElemDeclSeq extends SimpleNode {
  public ASTArchElemDeclSeq(int id) {
    super(id);
  }

  public ASTArchElemDeclSeq(ArchParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ArchParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=60f2d09d145f5b9c83a230147eb778d2 (do not edit this line) */
