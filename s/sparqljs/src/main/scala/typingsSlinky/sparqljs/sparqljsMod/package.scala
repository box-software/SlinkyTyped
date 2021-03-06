package typingsSlinky.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparqljsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.sparqljs.Anon_TermBrand

  /* Rewritten from type alias, can be one of: 
    - typings.sparqljs.sparqljsMod.OperationExpression
    - typings.sparqljs.sparqljsMod.FunctionCallExpression
    - typings.sparqljs.sparqljsMod.AggregateExpression
    - typings.sparqljs.sparqljsMod.BgpPattern
    - typings.sparqljs.sparqljsMod.GroupPattern
    - typings.sparqljs.sparqljsMod.Tuple
    - typings.sparqljs.sparqljsMod.Term
  */
  type Expression = _Expression | Term
  type Term = String with Anon_TermBrand
  type ValuePatternRow = StringDictionary[Term]
  type Variable = VariableExpression | Term
}
